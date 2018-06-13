package com.serverless.services;

import com.serverless.domain.Challenge;
import com.serverless.domain.Enum.Activity;
import com.serverless.domain.Enum.Difficulty;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class GenerateChallange {


    public GenerateChallange() {
    }

    public static Challenge genarate(String tflRespose, String metResponse) {

        JSONParser parser = new JSONParser();
        Activity activity= Activity.COMMUTE;
        String description = "Go somewhere new, enjoy a commute";
        String name = "default name";


        try {


            JSONObject tflJsonObj = (JSONObject)   parser.parse(tflRespose);

           tflJsonObj.toJSONString();
           JSONArray currentForcast = (JSONArray) tflJsonObj.get("currentForecast");
           JSONObject today = (JSONObject) currentForcast.get(0);

           String forcastBand = today.get("forecastBand").toString();

           if (forcastBand.equals("Low")){

               name = "Clean air Challenge";
               activity = Activity.WALKING;
               description = "Go for a long walk, enjoy some fresh air";

           }

            JSONObject metObject = (JSONObject)   parser.parse(metResponse);

            JSONArray features = (JSONArray) metObject.get("features");
            JSONObject feature = (JSONObject) features.get(0);

            JSONObject properties = (JSONObject) feature.get("properties");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Challenge(name,activity, Difficulty.EASY,  description, "50");

    }

}
