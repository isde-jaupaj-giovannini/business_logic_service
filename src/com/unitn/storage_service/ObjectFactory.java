
package com.unitn.storage_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitn.storage_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Chart_QNAME = new QName("http://storage_service.unitn.com/", "chart");
    private final static QName _GetFromToStepsData_QNAME = new QName("http://storage_service.unitn.com/", "getFromToStepsData");
    private final static QName _CreateUser_QNAME = new QName("http://storage_service.unitn.com/", "createUser");
    private final static QName _GetFamousQuote_QNAME = new QName("http://storage_service.unitn.com/", "getFamousQuote");
    private final static QName _GetRandomComicResponse_QNAME = new QName("http://storage_service.unitn.com/", "getRandomComicResponse");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://storage_service.unitn.com/", "getGoalsResponse");
    private final static QName _GetRandomComic_QNAME = new QName("http://storage_service.unitn.com/", "getRandomComic");
    private final static QName _GetGoals_QNAME = new QName("http://storage_service.unitn.com/", "getGoals");
    private final static QName _UserExistsResponse_QNAME = new QName("http://storage_service.unitn.com/", "userExistsResponse");
    private final static QName _UserExists_QNAME = new QName("http://storage_service.unitn.com/", "userExists");
    private final static QName _GetChartResponse_QNAME = new QName("http://storage_service.unitn.com/", "getChartResponse");
    private final static QName _SaveData_QNAME = new QName("http://storage_service.unitn.com/", "saveData");
    private final static QName _GetChart_QNAME = new QName("http://storage_service.unitn.com/", "getChart");
    private final static QName _CreateUserResponse_QNAME = new QName("http://storage_service.unitn.com/", "createUserResponse");
    private final static QName _GetFromToStepsDataResponse_QNAME = new QName("http://storage_service.unitn.com/", "getFromToStepsDataResponse");
    private final static QName _XkcdComic_QNAME = new QName("http://storage_service.unitn.com/", "xkcdComic");
    private final static QName _GetLatestDataResponse_QNAME = new QName("http://storage_service.unitn.com/", "getLatestDataResponse");
    private final static QName _SaveDataResponse_QNAME = new QName("http://storage_service.unitn.com/", "saveDataResponse");
    private final static QName _SaveGoalResponse_QNAME = new QName("http://storage_service.unitn.com/", "saveGoalResponse");
    private final static QName _GetFamousQuoteResponse_QNAME = new QName("http://storage_service.unitn.com/", "getFamousQuoteResponse");
    private final static QName _GetMovieQuote_QNAME = new QName("http://storage_service.unitn.com/", "getMovieQuote");
    private final static QName _Quote_QNAME = new QName("http://storage_service.unitn.com/", "quote");
    private final static QName _GetDescription_QNAME = new QName("http://storage_service.unitn.com/", "getDescription");
    private final static QName _GetLatestData_QNAME = new QName("http://storage_service.unitn.com/", "getLatestData");
    private final static QName _GetDescriptionResponse_QNAME = new QName("http://storage_service.unitn.com/", "getDescriptionResponse");
    private final static QName _GetUser_QNAME = new QName("http://storage_service.unitn.com/", "getUser");
    private final static QName _GetMovieQuoteResponse_QNAME = new QName("http://storage_service.unitn.com/", "getMovieQuoteResponse");
    private final static QName _SaveGoal_QNAME = new QName("http://storage_service.unitn.com/", "saveGoal");
    private final static QName _GetUserResponse_QNAME = new QName("http://storage_service.unitn.com/", "getUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitn.storage_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieQuoteResponse }
     * 
     */
    public GetMovieQuoteResponse createGetMovieQuoteResponse() {
        return new GetMovieQuoteResponse();
    }

    /**
     * Create an instance of {@link SaveGoal }
     * 
     */
    public SaveGoal createSaveGoal() {
        return new SaveGoal();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetDescriptionResponse }
     * 
     */
    public GetDescriptionResponse createGetDescriptionResponse() {
        return new GetDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetDescription }
     * 
     */
    public GetDescription createGetDescription() {
        return new GetDescription();
    }

    /**
     * Create an instance of {@link GetLatestData }
     * 
     */
    public GetLatestData createGetLatestData() {
        return new GetLatestData();
    }

    /**
     * Create an instance of {@link GetFamousQuoteResponse }
     * 
     */
    public GetFamousQuoteResponse createGetFamousQuoteResponse() {
        return new GetFamousQuoteResponse();
    }

    /**
     * Create an instance of {@link GetMovieQuote }
     * 
     */
    public GetMovieQuote createGetMovieQuote() {
        return new GetMovieQuote();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link SaveGoalResponse }
     * 
     */
    public SaveGoalResponse createSaveGoalResponse() {
        return new SaveGoalResponse();
    }

    /**
     * Create an instance of {@link SaveDataResponse }
     * 
     */
    public SaveDataResponse createSaveDataResponse() {
        return new SaveDataResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetFromToStepsDataResponse }
     * 
     */
    public GetFromToStepsDataResponse createGetFromToStepsDataResponse() {
        return new GetFromToStepsDataResponse();
    }

    /**
     * Create an instance of {@link XkcdComic }
     * 
     */
    public XkcdComic createXkcdComic() {
        return new XkcdComic();
    }

    /**
     * Create an instance of {@link GetLatestDataResponse }
     * 
     */
    public GetLatestDataResponse createGetLatestDataResponse() {
        return new GetLatestDataResponse();
    }

    /**
     * Create an instance of {@link SaveData }
     * 
     */
    public SaveData createSaveData() {
        return new SaveData();
    }

    /**
     * Create an instance of {@link GetChart }
     * 
     */
    public GetChart createGetChart() {
        return new GetChart();
    }

    /**
     * Create an instance of {@link GetChartResponse }
     * 
     */
    public GetChartResponse createGetChartResponse() {
        return new GetChartResponse();
    }

    /**
     * Create an instance of {@link UserExists }
     * 
     */
    public UserExists createUserExists() {
        return new UserExists();
    }

    /**
     * Create an instance of {@link GetRandomComic }
     * 
     */
    public GetRandomComic createGetRandomComic() {
        return new GetRandomComic();
    }

    /**
     * Create an instance of {@link GetGoals }
     * 
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link UserExistsResponse }
     * 
     */
    public UserExistsResponse createUserExistsResponse() {
        return new UserExistsResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetFamousQuote }
     * 
     */
    public GetFamousQuote createGetFamousQuote() {
        return new GetFamousQuote();
    }

    /**
     * Create an instance of {@link GetRandomComicResponse }
     * 
     */
    public GetRandomComicResponse createGetRandomComicResponse() {
        return new GetRandomComicResponse();
    }

    /**
     * Create an instance of {@link GetGoalsResponse }
     * 
     */
    public GetGoalsResponse createGetGoalsResponse() {
        return new GetGoalsResponse();
    }

    /**
     * Create an instance of {@link Chart }
     * 
     */
    public Chart createChart() {
        return new Chart();
    }

    /**
     * Create an instance of {@link GetFromToStepsData }
     * 
     */
    public GetFromToStepsData createGetFromToStepsData() {
        return new GetFromToStepsData();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "chart")
    public JAXBElement<Chart> createChart(Chart value) {
        return new JAXBElement<Chart>(_Chart_QNAME, Chart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFromToStepsData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getFromToStepsData")
    public JAXBElement<GetFromToStepsData> createGetFromToStepsData(GetFromToStepsData value) {
        return new JAXBElement<GetFromToStepsData>(_GetFromToStepsData_QNAME, GetFromToStepsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFamousQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getFamousQuote")
    public JAXBElement<GetFamousQuote> createGetFamousQuote(GetFamousQuote value) {
        return new JAXBElement<GetFamousQuote>(_GetFamousQuote_QNAME, GetFamousQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRandomComicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getRandomComicResponse")
    public JAXBElement<GetRandomComicResponse> createGetRandomComicResponse(GetRandomComicResponse value) {
        return new JAXBElement<GetRandomComicResponse>(_GetRandomComicResponse_QNAME, GetRandomComicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRandomComic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getRandomComic")
    public JAXBElement<GetRandomComic> createGetRandomComic(GetRandomComic value) {
        return new JAXBElement<GetRandomComic>(_GetRandomComic_QNAME, GetRandomComic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "userExistsResponse")
    public JAXBElement<UserExistsResponse> createUserExistsResponse(UserExistsResponse value) {
        return new JAXBElement<UserExistsResponse>(_UserExistsResponse_QNAME, UserExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "userExists")
    public JAXBElement<UserExists> createUserExists(UserExists value) {
        return new JAXBElement<UserExists>(_UserExists_QNAME, UserExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getChartResponse")
    public JAXBElement<GetChartResponse> createGetChartResponse(GetChartResponse value) {
        return new JAXBElement<GetChartResponse>(_GetChartResponse_QNAME, GetChartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "saveData")
    public JAXBElement<SaveData> createSaveData(SaveData value) {
        return new JAXBElement<SaveData>(_SaveData_QNAME, SaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getChart")
    public JAXBElement<GetChart> createGetChart(GetChart value) {
        return new JAXBElement<GetChart>(_GetChart_QNAME, GetChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFromToStepsDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getFromToStepsDataResponse")
    public JAXBElement<GetFromToStepsDataResponse> createGetFromToStepsDataResponse(GetFromToStepsDataResponse value) {
        return new JAXBElement<GetFromToStepsDataResponse>(_GetFromToStepsDataResponse_QNAME, GetFromToStepsDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XkcdComic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "xkcdComic")
    public JAXBElement<XkcdComic> createXkcdComic(XkcdComic value) {
        return new JAXBElement<XkcdComic>(_XkcdComic_QNAME, XkcdComic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getLatestDataResponse")
    public JAXBElement<GetLatestDataResponse> createGetLatestDataResponse(GetLatestDataResponse value) {
        return new JAXBElement<GetLatestDataResponse>(_GetLatestDataResponse_QNAME, GetLatestDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "saveDataResponse")
    public JAXBElement<SaveDataResponse> createSaveDataResponse(SaveDataResponse value) {
        return new JAXBElement<SaveDataResponse>(_SaveDataResponse_QNAME, SaveDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "saveGoalResponse")
    public JAXBElement<SaveGoalResponse> createSaveGoalResponse(SaveGoalResponse value) {
        return new JAXBElement<SaveGoalResponse>(_SaveGoalResponse_QNAME, SaveGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFamousQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getFamousQuoteResponse")
    public JAXBElement<GetFamousQuoteResponse> createGetFamousQuoteResponse(GetFamousQuoteResponse value) {
        return new JAXBElement<GetFamousQuoteResponse>(_GetFamousQuoteResponse_QNAME, GetFamousQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getMovieQuote")
    public JAXBElement<GetMovieQuote> createGetMovieQuote(GetMovieQuote value) {
        return new JAXBElement<GetMovieQuote>(_GetMovieQuote_QNAME, GetMovieQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "quote")
    public JAXBElement<Quote> createQuote(Quote value) {
        return new JAXBElement<Quote>(_Quote_QNAME, Quote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getDescription")
    public JAXBElement<GetDescription> createGetDescription(GetDescription value) {
        return new JAXBElement<GetDescription>(_GetDescription_QNAME, GetDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getLatestData")
    public JAXBElement<GetLatestData> createGetLatestData(GetLatestData value) {
        return new JAXBElement<GetLatestData>(_GetLatestData_QNAME, GetLatestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getDescriptionResponse")
    public JAXBElement<GetDescriptionResponse> createGetDescriptionResponse(GetDescriptionResponse value) {
        return new JAXBElement<GetDescriptionResponse>(_GetDescriptionResponse_QNAME, GetDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getMovieQuoteResponse")
    public JAXBElement<GetMovieQuoteResponse> createGetMovieQuoteResponse(GetMovieQuoteResponse value) {
        return new JAXBElement<GetMovieQuoteResponse>(_GetMovieQuoteResponse_QNAME, GetMovieQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "saveGoal")
    public JAXBElement<SaveGoal> createSaveGoal(SaveGoal value) {
        return new JAXBElement<SaveGoal>(_SaveGoal_QNAME, SaveGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

}
