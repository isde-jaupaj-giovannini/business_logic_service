package com.unitn.bl_service;

import com.unitn.data.NewStepResponse;
import com.unitn.local_database.MeasureData;
import com.unitn.local_database.UserData;
import com.unitn.storage_service.Goal;
import com.unitn.storage_service.Storage;
import com.unitn.storage_service.StorageService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by erinda on 1/24/16.
 */
@WebService(endpointInterface = "com.unitn.bl_service.BLService",
        serviceName = "BLService")
public class BLServiceImpl implements BLService {

    StorageService storage = new Storage().getStorageServiceImplPort();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM hh:mm aa");

    @Override
    public String getDescription() {
        return "BLServiceImpl";
    }

    @Override
    public boolean registerNewUser(UserData user) {

        if (    user.getName() != null &&
                user.getName().trim().length() > 0 &&
                user.getHeight() >= 0 &&
                user.getWeight() >= 0 &&
                !storage.userExists(user.getIdTelegram())) {

            storage.createUser(user);

            return storage.userExists(user.getIdTelegram());

        }

        return false;
    }

    @Override
    public NewStepResponse saveNewSteps(MeasureData measureData) {
        NewStepResponse response = new NewStepResponse();
        response.setStatus(false);

        storage.saveData(measureData);
        List<Goal> goals = storage.getGoals(measureData.getIdTelegram());
        for (Goal goal: goals) {
            long t1= Long.parseLong( goal.getCreatedDate().substring(6, goal.getCreatedDate().length()-2) );
            Calendar date1 = Calendar.getInstance();
            date1.setTimeInMillis(t1);
            Calendar date2 = Calendar.getInstance() ;
            try {
                date2.setTime(simpleDateFormat.parse(goal.getDueDate()));
                date2.set(Calendar.YEAR, date1.get(Calendar.YEAR));
                int sum = storage.getFromToStepsData(measureData.getIdTelegram(), t1, date2.getTimeInMillis());
                if(sum >= Integer.parseInt( goal.getContent() )){
                    response.setStatus(true);
                    response.setMessage( storage.getFamousQuote().getQuote() );
                    response.setUrl( storage.getRandomComic().getImg() );

                    break;
                }

            } catch (ParseException e) {
                e.printStackTrace();
            }


        }


        if(!response.isStatus()){
            response.setMessage( storage.getMovieQuote().getQuote() );
        }

        return response;
    }


    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException {
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1")) {
            HOSTNAME = "localhost";
        }
        String PORT = "6902";
        String BASE_URL = "/ws/blservice";

        if (String.valueOf(System.getenv("PORT")) != "null") {
            PORT = String.valueOf(System.getenv("PORT"));
        }

        String endpointUrl = PROTOCOL + HOSTNAME + ":" + PORT + BASE_URL;
        System.out.println("Starting " + BLService.class.getSimpleName() + "...");
        System.out.println("--> Published. Check out " + endpointUrl + "?wsdl");
        Endpoint.publish(endpointUrl, new BLServiceImpl());
    }

}
