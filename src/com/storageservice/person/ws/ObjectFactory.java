
package com.storageservice.person.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.person.ws package. 
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

    private final static QName _Login_QNAME = new QName("http://ws.person.storageservice.com/", "login");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.person.storageservice.com/", "updatePerson");
    private final static QName _Registration_QNAME = new QName("http://ws.person.storageservice.com/", "registration");
    private final static QName _GetPersonInformation_QNAME = new QName("http://ws.person.storageservice.com/", "getPersonInformation");
    private final static QName _RegistrationResponse_QNAME = new QName("http://ws.person.storageservice.com/", "registrationResponse");
    private final static QName _GetPersonInformationResponse_QNAME = new QName("http://ws.person.storageservice.com/", "getPersonInformationResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.person.storageservice.com/", "updatePersonResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.person.storageservice.com/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.person.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link GetPersonInformation }
     * 
     */
    public GetPersonInformation createGetPersonInformation() {
        return new GetPersonInformation();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonInformationResponse }
     * 
     */
    public GetPersonInformationResponse createGetPersonInformationResponse() {
        return new GetPersonInformationResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "getPersonInformation")
    public JAXBElement<GetPersonInformation> createGetPersonInformation(GetPersonInformation value) {
        return new JAXBElement<GetPersonInformation>(_GetPersonInformation_QNAME, GetPersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "getPersonInformationResponse")
    public JAXBElement<GetPersonInformationResponse> createGetPersonInformationResponse(GetPersonInformationResponse value) {
        return new JAXBElement<GetPersonInformationResponse>(_GetPersonInformationResponse_QNAME, GetPersonInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.person.storageservice.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
