package com.serverless.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MetService {


    public static String getMetOfficeHourlyForcast(String lat, String lon){

        URL url;
        StringBuffer content = null;

        try {
            //TODO make this work jordon
//            url = new URL("https://pwms.datapoint.metoffice.gov.uk/points/v1/pwms-hourly-spot-forecast?latitude=" + lat + "&longitude=" + lon);

            url = new URL("https://pwms.datapoint.metoffice.gov.uk/points/v1/pwms-hourly-spot-forecast?latitude=51.517187&longitude=-0.104444");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("api-key",System.getenv("metOfficeAPIKey"));
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            return content.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "Could not obtain Hourly Forecast";

        } catch (ProtocolException e) {
            e.printStackTrace();
            return "Could not obtain Hourly Forecast";

        } catch (IOException e) {
            e.printStackTrace();
            return "Could not obtain Hourly Forecast";

        }
    }
}
