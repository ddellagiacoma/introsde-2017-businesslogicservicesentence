
package com.storageservice.sport.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.sport.ws package. 
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

    private final static QName _GetFavouriteActivityResponse_QNAME = new QName("http://ws.sport.storageservice.com/", "getFavouriteActivityResponse");
    private final static QName _GetSportsByWeather_QNAME = new QName("http://ws.sport.storageservice.com/", "getSportsByWeather");
    private final static QName _Activity_QNAME = new QName("http://ws.sport.storageservice.com/", "activity");
    private final static QName _GetSport_QNAME = new QName("http://ws.sport.storageservice.com/", "getSport");
    private final static QName _Sport_QNAME = new QName("http://ws.sport.storageservice.com/", "sport");
    private final static QName _GetSportsList_QNAME = new QName("http://ws.sport.storageservice.com/", "getSportsList");
    private final static QName _GetSportResponse_QNAME = new QName("http://ws.sport.storageservice.com/", "getSportResponse");
    private final static QName _GetFavouriteActivity_QNAME = new QName("http://ws.sport.storageservice.com/", "getFavouriteActivity");
    private final static QName _GetSportsListResponse_QNAME = new QName("http://ws.sport.storageservice.com/", "getSportsListResponse");
    private final static QName _GetSportsByWeatherResponse_QNAME = new QName("http://ws.sport.storageservice.com/", "getSportsByWeatherResponse");
    private final static QName _GetActivityBySport_QNAME = new QName("http://ws.sport.storageservice.com/", "getActivityBySport");
    private final static QName _GetActivityBySportResponse_QNAME = new QName("http://ws.sport.storageservice.com/", "getActivityBySportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.sport.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActivityBySport }
     * 
     */
    public GetActivityBySport createGetActivityBySport() {
        return new GetActivityBySport();
    }

    /**
     * Create an instance of {@link GetSportsByWeatherResponse }
     * 
     */
    public GetSportsByWeatherResponse createGetSportsByWeatherResponse() {
        return new GetSportsByWeatherResponse();
    }

    /**
     * Create an instance of {@link GetActivityBySportResponse }
     * 
     */
    public GetActivityBySportResponse createGetActivityBySportResponse() {
        return new GetActivityBySportResponse();
    }

    /**
     * Create an instance of {@link GetSportsListResponse }
     * 
     */
    public GetSportsListResponse createGetSportsListResponse() {
        return new GetSportsListResponse();
    }

    /**
     * Create an instance of {@link GetSportsList }
     * 
     */
    public GetSportsList createGetSportsList() {
        return new GetSportsList();
    }

    /**
     * Create an instance of {@link Sport }
     * 
     */
    public Sport createSport() {
        return new Sport();
    }

    /**
     * Create an instance of {@link GetSport }
     * 
     */
    public GetSport createGetSport() {
        return new GetSport();
    }

    /**
     * Create an instance of {@link GetFavouriteActivity }
     * 
     */
    public GetFavouriteActivity createGetFavouriteActivity() {
        return new GetFavouriteActivity();
    }

    /**
     * Create an instance of {@link GetSportResponse }
     * 
     */
    public GetSportResponse createGetSportResponse() {
        return new GetSportResponse();
    }

    /**
     * Create an instance of {@link GetSportsByWeather }
     * 
     */
    public GetSportsByWeather createGetSportsByWeather() {
        return new GetSportsByWeather();
    }

    /**
     * Create an instance of {@link GetFavouriteActivityResponse }
     * 
     */
    public GetFavouriteActivityResponse createGetFavouriteActivityResponse() {
        return new GetFavouriteActivityResponse();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFavouriteActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getFavouriteActivityResponse")
    public JAXBElement<GetFavouriteActivityResponse> createGetFavouriteActivityResponse(GetFavouriteActivityResponse value) {
        return new JAXBElement<GetFavouriteActivityResponse>(_GetFavouriteActivityResponse_QNAME, GetFavouriteActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsByWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSportsByWeather")
    public JAXBElement<GetSportsByWeather> createGetSportsByWeather(GetSportsByWeather value) {
        return new JAXBElement<GetSportsByWeather>(_GetSportsByWeather_QNAME, GetSportsByWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSport")
    public JAXBElement<GetSport> createGetSport(GetSport value) {
        return new JAXBElement<GetSport>(_GetSport_QNAME, GetSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "sport")
    public JAXBElement<Sport> createSport(Sport value) {
        return new JAXBElement<Sport>(_Sport_QNAME, Sport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSportsList")
    public JAXBElement<GetSportsList> createGetSportsList(GetSportsList value) {
        return new JAXBElement<GetSportsList>(_GetSportsList_QNAME, GetSportsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSportResponse")
    public JAXBElement<GetSportResponse> createGetSportResponse(GetSportResponse value) {
        return new JAXBElement<GetSportResponse>(_GetSportResponse_QNAME, GetSportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFavouriteActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getFavouriteActivity")
    public JAXBElement<GetFavouriteActivity> createGetFavouriteActivity(GetFavouriteActivity value) {
        return new JAXBElement<GetFavouriteActivity>(_GetFavouriteActivity_QNAME, GetFavouriteActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSportsListResponse")
    public JAXBElement<GetSportsListResponse> createGetSportsListResponse(GetSportsListResponse value) {
        return new JAXBElement<GetSportsListResponse>(_GetSportsListResponse_QNAME, GetSportsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsByWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getSportsByWeatherResponse")
    public JAXBElement<GetSportsByWeatherResponse> createGetSportsByWeatherResponse(GetSportsByWeatherResponse value) {
        return new JAXBElement<GetSportsByWeatherResponse>(_GetSportsByWeatherResponse_QNAME, GetSportsByWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityBySport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getActivityBySport")
    public JAXBElement<GetActivityBySport> createGetActivityBySport(GetActivityBySport value) {
        return new JAXBElement<GetActivityBySport>(_GetActivityBySport_QNAME, GetActivityBySport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityBySportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sport.storageservice.com/", name = "getActivityBySportResponse")
    public JAXBElement<GetActivityBySportResponse> createGetActivityBySportResponse(GetActivityBySportResponse value) {
        return new JAXBElement<GetActivityBySportResponse>(_GetActivityBySportResponse_QNAME, GetActivityBySportResponse.class, null, value);
    }

}
