
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

    private final static QName _SaveDataResponse_QNAME = new QName("http://storage_service.unitn.com/", "saveDataResponse");
    private final static QName _SaveGoalResponse_QNAME = new QName("http://storage_service.unitn.com/", "saveGoalResponse");
    private final static QName _CreateUser_QNAME = new QName("http://storage_service.unitn.com/", "createUser");
    private final static QName _UserExistsResponse_QNAME = new QName("http://storage_service.unitn.com/", "userExistsResponse");
    private final static QName _UserExists_QNAME = new QName("http://storage_service.unitn.com/", "userExists");
    private final static QName _GetDescription_QNAME = new QName("http://storage_service.unitn.com/", "getDescription");
    private final static QName _GetLatestData_QNAME = new QName("http://storage_service.unitn.com/", "getLatestData");
    private final static QName _SaveData_QNAME = new QName("http://storage_service.unitn.com/", "saveData");
    private final static QName _CreateUserResponse_QNAME = new QName("http://storage_service.unitn.com/", "createUserResponse");
    private final static QName _GetLatestDataResponse_QNAME = new QName("http://storage_service.unitn.com/", "getLatestDataResponse");
    private final static QName _GetDescriptionResponse_QNAME = new QName("http://storage_service.unitn.com/", "getDescriptionResponse");
    private final static QName _GetUser_QNAME = new QName("http://storage_service.unitn.com/", "getUser");
    private final static QName _SaveGoal_QNAME = new QName("http://storage_service.unitn.com/", "saveGoal");
    private final static QName _GetUserResponse_QNAME = new QName("http://storage_service.unitn.com/", "getUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitn.storage_service
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetLatestDataResponse }
     * 
     */
    public GetLatestDataResponse createGetLatestDataResponse() {
        return new GetLatestDataResponse();
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
     * Create an instance of {@link SaveData }
     * 
     */
    public SaveData createSaveData() {
        return new SaveData();
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
     * Create an instance of {@link UserExists }
     * 
     */
    public UserExists createUserExists() {
        return new UserExists();
    }

    /**
     * Create an instance of {@link UserExistsResponse }
     * 
     */
    public UserExistsResponse createUserExistsResponse() {
        return new UserExistsResponse();
    }

    /**
     * Create an instance of {@link SaveGoalResponse }
     * 
     */
    public SaveGoalResponse createSaveGoalResponse() {
        return new SaveGoalResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link SaveDataResponse }
     * 
     */
    public SaveDataResponse createSaveDataResponse() {
        return new SaveDataResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "saveData")
    public JAXBElement<SaveData> createSaveData(SaveData value) {
        return new JAXBElement<SaveData>(_SaveData_QNAME, SaveData.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://storage_service.unitn.com/", name = "getLatestDataResponse")
    public JAXBElement<GetLatestDataResponse> createGetLatestDataResponse(GetLatestDataResponse value) {
        return new JAXBElement<GetLatestDataResponse>(_GetLatestDataResponse_QNAME, GetLatestDataResponse.class, null, value);
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
