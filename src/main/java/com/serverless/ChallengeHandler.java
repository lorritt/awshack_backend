package com.serverless;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ChallengeHandler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private static final Logger LOG = Logger.getLogger(ChallengeHandler.class);

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);
        String tmpLat = "51.517187";
        String tmpLong = "-0.104444";

        Response responseBody = new Response(getTFLAirQuality());
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Powered-By", "AWS Lambda & Serverless");
        headers.put("Content-Type", "application/json");

        return ApiGatewayResponse.builder()
                .setStatusCode(200)
                .setObjectBody(responseBody)
                .setHeaders(headers)
                .build();
	}


	private String getTFLAirQuality(){
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
            return "Could not obtain Air Quality data";
        } catch (ProtocolException e) {
            e.printStackTrace();
            return "Could not obtain Air Quality data";
        } catch (IOException e) {
            e.printStackTrace();
            return "Could not obtain Air Quality data";
        }
    }

    private String getMetOfficeHourlyForcast(String lat, String lon){

        URL url;
        StringBuffer content = null;

        try {
            //TODO make this work jordon
            url = new URL("https://pwms.datapoint.metoffice.gov.uk/points/v1/pwms-hourly-spot-forecast?latitude=" + lat + "&longitude=" + lon);
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
