package com.businesslogicservice.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.storageservice.bmi.ws.Bmi;
import com.storageservice.fitbit.ws.Goal;
import com.storageservice.person.ws.Person;
import com.storageservice.sport.ws.Activity;
import com.storageservice.sport.ws.Sport;
import com.storageservice.weather.ws.Weather;


//service definition
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public interface BusinessLogicModel {
    
    @WebMethod(operationName="dailymotivationalWeather")
    @WebResult(name="sentence") 
    public String DailymotivationalWeather(@WebParam(name="sports")List<Sport> sportWeather,@WebParam(name="weather")Weather weather);

    @WebMethod(operationName="dailymotivationalCalories")
    @WebResult(name="sentence") 
    public String DailymotivationalCalories(@WebParam(name="sports")List<Sport> sportWeather,@WebParam(name="person")Person p,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
    
    @WebMethod(operationName="motivationBaseOnBmiStatus")
    @WebResult(name="sentence") 
    public String motivationBaseOnBmiStatus(@WebParam(name="bmi")Bmi bmi,@WebParam(name="startDate")String startDate,@WebParam(name="person")Person p,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
    
    @WebMethod(operationName="motivationBasedOnBmiValueDifference")
    @WebResult(name="sentence") 
    public String motivationBasedOnBmiValueDifference(@WebParam(name="person")Person p,@WebParam(name="startDate")String startDate,@WebParam(name="bmi")Bmi bmi,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
    
    @WebMethod(operationName="motivationBasedOnWeightDifference")
    @WebResult(name="sentence") 
    public String motivationBasedOnWeightDifference(@WebParam(name="idPerson")int idPerson,@WebParam(name="startDate")String startDate,@WebParam(name="endDate")String endDate,@WebParam(name="startWeight")double startWeight,
    		@WebParam(name="goalWeight")double goalWeight,@WebParam(name="weightDifference")double weightDifference);
    
    @WebMethod(operationName="motivationBasedOnGoalSteps")
    @WebResult(name="sentence") 
    public String motivationBasedOnGoalSteps(@WebParam(name="goal") Goal goal);
    
    @WebMethod(operationName="motivationBasedOnFavouriteActivities")
    @WebResult(name="sentence") 
    public String motivationBasedOnFavouriteActivities(@WebParam(name="favouriteActivities")List<Activity> favouriteActivities);
   
    @WebMethod(operationName="motivationBasedonForecast")
    @WebResult(name="sentence") 
    public String motivationBasedonForecast(@WebParam(name="forecast")List<Weather> forecast);
    
    @WebMethod(operationName="verifyAndIncrementDailyGoalAchieved")
    @WebResult(name="sentence") 
    public Person verifyAndIncrementDailyGoalAchieved(@WebParam(name="goal")Goal goal,@WebParam(name="person")Person p);
    
    
}