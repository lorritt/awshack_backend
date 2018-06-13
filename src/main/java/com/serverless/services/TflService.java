package com.serverless.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class  TflService {


    public static String getTFLAirQuality(){
        URL url;
        StringBuffer content;

        try {
            url = new URL("https://api.tfl.gov.uk/AirQuality?app_id=" + System.getenv("TFL_API_ID") + "&app_key="+ System.getenv("TFL_API_KEY"));
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
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
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return "Could not obtain Air Quality data";
        }
    }
}
