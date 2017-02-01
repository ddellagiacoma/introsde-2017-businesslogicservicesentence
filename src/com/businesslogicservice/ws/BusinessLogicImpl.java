package com.businesslogicservice.ws;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import org.json.JSONObject;

import com.storageservice.sport.ws.Activity;
import com.storageservice.sport.ws.LocalApiSportModel;
import com.storageservice.bmi.ws.Bmi;
import com.storageservice.bmi.ws.BmiApi;
import com.storageservice.bmi.ws.StorageServiceBmi;
import com.storageservice.person.ws.LocalApiPersonModel;
import com.storageservice.person.ws.Person;
import com.storageservice.person.ws.StorageServicePerson;
import com.storageservice.sport.ws.Sport;
import com.storageservice.sport.ws.StorageServiceSport;
import com.storageservice.weather.ws.Weather;
import com.storageservice.fitbit.ws.Goal;
import com.storageservice.fitbit.ws.LocalApiFitBitModel;
import com.storageservice.fitbit.ws.StorageServiceFitBit;
import com.storageservice.fitbit.ws.WeightGoal;




//Service Implementation

@WebService(endpointInterface = "com.businesslogicservice.ws.BusinessLogicModel", serviceName = "businessLogicService")
public class BusinessLogicImpl implements BusinessLogicModel {

/*	@Override
	public int registration(Person p) {
		StorageService service = new StorageService();
		ExternalApiModel people = service.getExternalApiImplPort();
		return people.registration(p);	
	}

public int login(int id){
	return id;	
}*/
@Override
	public String DailymotivationalWeather(List<Sport> sportWeather, Weather weather) {
		Random randomGenerator;
		randomGenerator = new Random();
		int randomIndex = randomGenerator.nextInt(sportWeather.size());
		String sport = sportWeather.get(randomIndex).getName();
		String sentence = "What a " + weather.getText() + " day!! The best weather for " + sport;
		return sentence;
	}
@Override
	public String DailymotivationalCalories(List<Sport> sports, Person p,String access_token,String user_id,String refresh_token) {
		Random randomGenerator;
		randomGenerator = new Random();
		int randomIndex = randomGenerator.nextInt(sports.size());
		Sport sport = sports.get(randomIndex);
		StorageServiceSport sportservice = new StorageServiceSport();
		LocalApiSportModel sportse = sportservice.getLocalApiSportImplPort();
		Activity activity = sportse.getActivityBySport(sport, access_token, user_id, refresh_token);
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		int hours = randomGenerator.nextInt(3)+1;
		double weight = fitbits.getWeightHeight(access_token, user_id, refresh_token).getWeight();
		double caloriesPerHour = activity.getMets() * weight * hours;
		String sentence = "did you know that for just " + hours + " hours of " + sport.getName() + " you will burn "
				+ caloriesPerHour + " cal. ? Let's do it";

		return sentence;
	}
@Override
	public String motivationBaseOnBmiStatus(Bmi bmi, String startDate, Person p,String access_token,String user_id,String refresh_token) {

		com.storageservice.bmi.ws.Person PersonBmi = new com.storageservice.bmi.ws.Person();
		PersonBmi.setBirthdate(p.getBirthdate());
		PersonBmi.setGenre(p.getGenre());
		PersonBmi.setIdPerson(p.getIdPerson());

		String sentence;
		if (bmi == null) {
			StorageServicePerson personservice = new StorageServicePerson();

			StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
			LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
			com.storageservice.fitbit.ws.Person weightHeight = fitbits.getWeightHeight(access_token, user_id, refresh_token);
			StorageServiceBmi bmiservice = new StorageServiceBmi();
			BmiApi bmis = bmiservice.getBmiApiImplPort();

			bmi = bmis.calculateandSavebmi(PersonBmi, weightHeight.getWeight(), weightHeight.getHeight());
			String status = bmi.getStatus();
			sentence = "your bmi has just been calculated and the value returned is " + bmi.getValue() + "\n";
			switch (status) {

			case "Normal":
				sentence = sentence + "Congratulation your bmi is perfect! Continue your lifestyle like that!";
				break;
			case "Overweight":
				sentence = sentence + "You're doing a great job, your bmi is almost right! don't give up!";
				break;
			case "Underweight":
				sentence = sentence + "Your bmi indicates a underweight, maybe is the time to eat something";
				break;
			case "Severly Underweight":
				sentence = sentence + "Your situation is difficoult and you have a " + bmi.getRisk()
						+ " !let's start a goal and improve yourself";
				break;
			case "Obese Class I (Moderately obese)":
				sentence = sentence + "You re a littl overweight and you are starting a risk: " + bmi.getRisk()
						+ " !let's do something";
				break;
			case "Obese Class II (Severely obese)":
				sentence = sentence + "Your situation is difficoult and you have a " + bmi.getRisk()
						+ " !let's start a goal and improve yourself";
				break;
			case "Obese Class III (Very severely obese)":
				if (p.getGenre().equals("m")) {
					sentence = "come on man take care of yourself and start do something";
				} else {
					sentence = "come on girl take care of yourself and start do something";
				}
				break;
			}

		} else {
			
			sentence = "From " + startDate+ " ";
			StorageServiceBmi bmiservice = new StorageServiceBmi();
			BmiApi bmis = bmiservice.getBmiApiImplPort();
			String difference = bmis.getStatusBmiDifference(startDate, p.getIdPerson());
			if (difference.equals("")) {
				StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
				LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
				com.storageservice.fitbit.ws.Person weightHeight = fitbits.getWeightHeight(access_token, user_id, refresh_token);

				bmi = bmis.calculateandSavebmi(PersonBmi, weightHeight.getWeight(), weightHeight.getHeight());
				sentence = bmis.getStatusBmiDifference(startDate, p.getIdPerson());
			}
			sentence = sentence + difference+ " never give up!";
		}
		return sentence;

	}
@Override
	public String motivationBasedOnBmiValueDifference(Person p, String startDate, Bmi bmi,String access_token,String user_id,String refresh_token) {
	

		String sentence;
		com.storageservice.bmi.ws.Person PersonBmi = new com.storageservice.bmi.ws.Person();
		
		PersonBmi.setBirthdate(p.getBirthdate());
		PersonBmi.setGenre(p.getGenre());
		PersonBmi.setIdPerson(p.getIdPerson());
		StorageServiceBmi bmiservice = new StorageServiceBmi();
		BmiApi bmis = bmiservice.getBmiApiImplPort();
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		if (bmi == null) {
		
com.storageservice.fitbit.ws.Person weightHeight = fitbits.getWeightHeight(access_token, user_id, refresh_token);
			bmi = bmis.calculateandSavebmi(PersonBmi, weightHeight.getWeight(), weightHeight.getHeight());
			String value = bmi.getStatus();
			sentence = "your bmi has just been calculated and the value returned is " + bmi.getValue() + "\n";
		} else {
		
			double difference = bmis.getPeriodBmiDifference(startDate, p.getIdPerson());
			if (difference == 0) {
			
				com.storageservice.fitbit.ws.Person weightHeight = fitbits.getWeightHeight(access_token, user_id, refresh_token);
				bmi = bmis.calculateandSavebmi(PersonBmi, weightHeight.getWeight(), weightHeight.getHeight());
				difference = bmis.getPeriodBmiDifference(startDate, p.getIdPerson());
			}
		

			sentence = "From " + startDate + " your bmi difference is " + difference + "\n";
			double tollerance = 0;
			double tolleranceNeg = 0;
			switch (bmi.getStatus()) {
			case "Normal":
				tollerance = 0.5;
				tolleranceNeg = -0.5;
				break;
			case "Overweight":
				tollerance = 0.5;
				tolleranceNeg = -1;
				break;
			case "Underweight":
				tollerance = 1;
				tolleranceNeg = -0.5;
				break;
			case "Severly Underweight":
				tollerance = 2;
				tolleranceNeg = 0;
				break;
			case "Obese Class I (Moderately obese)":
				tollerance = 0;
				tolleranceNeg = -2.5;
				break;
			case "Obese Class II (Severely obese)":
				tollerance = 0;
				tolleranceNeg = -3;
				break;
			case "Obese Class III (Very severely obese)":
				tollerance = 0;
				tolleranceNeg = -3.5;
				break;
			}

			if (difference < tollerance & difference > tolleranceNeg) {
				sentence = sentence + " your bmi change indicateds that you're doing a good job, continue like that ";

			}
			if (difference > tollerance) {
				sentence = sentence
						+ " be carefull your bmi change indicates that you're getting too much weight! this was not your goal";
			}
			if (difference < -tollerance) {
				sentence = sentence
						+ " be carefull your bmi change indicateds that you're losing too much weight! this was not your goal";
			}

		}

		return sentence;
	}
@Override
	public String motivationBasedOnWeightDifference(int idPerson, String startDate, String endDate, double startWeight,
			double goalWeight, double weightDifference) {

		String sentence;
		double initialDifference = startWeight - goalWeight;
		if (initialDifference > 0) {
			// losing weight
			if (weightDifference < 0) {
				sentence = "your goal was to losing weight but actually you're getting weight! Wake up! get up and start an activity!";
			} else {
				if (weightDifference >= initialDifference / 2) {
					sentence = "you're more than halfway goal weight!continue like that and don't give up";
				} else {
					sentence = "you have still a lot of work to do for reach your weight goal, but you started and that is good! ";

				}
				if (weightDifference >= initialDifference) {
					sentence = "Congratulation! you reach your weight goal! let's start another one! never stop!";
				}
			}
		} else {
			// getting weight
			if (weightDifference > 0) {
				sentence = "your goal was to getting weight but actually you're losing weight! take care about your goal and start a diet!";
			} else {
				if (weightDifference <= initialDifference / 2) {
					sentence = "you're more than halfway goal weight!continue like that and don't give up";
				} else {
					sentence = "you have still a lot of work to do for reach your weight goal, but you started and that is good! ";

				}
				if (weightDifference <= initialDifference) {
					sentence = "Congratulation! you reach your weight goal! let's start another one! never stop!";
				}
			}

		}

		return sentence;

	}
@Override
	public String motivationBasedOnGoalSteps(Goal goal){
	String sentence;

	if (goal.getMissingSteps()<=0){
		sentence="Gooood job! for today you finish your goal!remember to continue like that in the next days";
	}else if(goal.getMissingSteps()==goal.getSteps()/2){
	sentence= "You're halfawy! continue and finish your job, make a run !";	
	}else if(goal.getMissingSteps()<=goal.getSteps()/2){
		sentence= "You' re finishing your steps goal don't give up right now let's finish!";
	}else{
		sentence="OH come on,don't be lazy, you just start your path!  ";
	}
	
	
	return sentence;
	
}
@Override
public String motivationBasedOnFavouriteActivities(List<Activity> favouriteActivities){
	String sentence;
	Random randomGenerator;
	randomGenerator = new Random();
	int randomIndex = randomGenerator.nextInt(favouriteActivities.size());
	if (favouriteActivities.size()>0){
	sentence="it's always the best time to do the activity that you like! what do you think about do a "+favouriteActivities.get(randomIndex).getName();
	}else{
		sentence="don't you like any activity or do you like all? I hope the second one! :) start do something come on!";
	}return sentence;
}

@Override
public String motivationBasedonForecast(List<Weather> forecast){
	String sentence;
int countSnow= Collections.frequency(forecast, "Snow");
int countSun=Collections.frequency(forecast, "Sunny");
int countRain= Collections.frequency(forecast, "Rain");
int countCloud= Collections.frequency(forecast, "Cloudy");
int countPartly=Collections.frequency(forecast, "Partly Cloudy");
if (countSnow+countRain+countCloud>countSun+countPartly){
	List<String> sentences= new ArrayList();
	sentences.add("this week seems to have bad forecast what about take a break this week and do more the next one?");
	sentences.add("Even if the forecast are not good you can do some funny activities inside! let's do it");
sentences.add("Neither the weather can stop you! come on be strong don't give up!");
Random randomGenerator;
randomGenerator = new Random();
int randomIndex = randomGenerator.nextInt(sentences.size());
sentence=sentences.get(randomIndex);
}else{
	List<String> sentences= new ArrayList();
	sentences.add("this week seems to have good forecast what about to do more activities in this beautifull week  and take a break in a worse week?");
	sentences.add("Take sun is healthy! even more if you make some activities outside!");
sentences.add("For swimming or other inside-sport there is time, having regard to the forecasts is better if you do something outside!");
Random randomGenerator;
randomGenerator = new Random();
int randomIndex = randomGenerator.nextInt(sentences.size());
sentence=sentences.get(randomIndex);
}

return sentence;

}

@Override
public Person verifyAndIncrementDailyGoalAchieved(Goal goal,Person p){
	if (goal.getMissingSteps()<=0||goal.getMissingDistance()<=0){
		p.setNGoalAchieved(p.getNGoalAchieved()+1);
		p.setNTotalGoal(p.getNTotalGoal()+1);
		
	}else{
		p.setNTotalGoal(p.getNTotalGoal()+1);
	}
	if (goal.getMissingCalories()<=0){
		p.setNGoalAchieved(p.getNGoalAchieved()+1);
		p.setNTotalGoal(p.getNTotalGoal()+1);
		
	}else{
		p.setNTotalGoal(p.getNTotalGoal()+1);
	}
return p;
}


}
