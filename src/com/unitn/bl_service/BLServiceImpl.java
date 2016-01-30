package com.unitn.bl_service;

import com.unitn.local_database.UserData;
import com.unitn.storage_service.Storage;
import com.unitn.storage_service.StorageService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;

/**
 * Created by erinda on 1/24/16.
 */
@WebService(endpointInterface = "com.unitn.bl_service.BLService",
        serviceName = "BLService")
public class BLServiceImpl implements BLService {

    StorageService storage = new Storage().getStorageServiceImplPort();

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
