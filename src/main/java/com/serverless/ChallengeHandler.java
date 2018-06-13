package com.serverless;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.domain.Challenge;
import com.serverless.domain.Enum.Activity;
import com.serverless.domain.Enum.Difficulty;
import com.serverless.services.GenerateChallange;
import com.serverless.services.MetService;
import com.serverless.services.TflService;
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

        String tlfResponse = TflService.getTFLAirQuality();
        String metResponse = MetService.getMetOfficeHourlyForcast(tmpLat,tmpLong);

        Challenge challenge = GenerateChallange.genarate(tlfResponse, metResponse);
        ObjectMapper mapperObj = new ObjectMapper();

        try {

        ArrayList<String> challanges = new ArrayList<>();

        Challenge challenge1 = new Challenge("Royalty awaits",
                Activity.CYCLE, Difficulty.EASY,
                "Go for a cycle past Buckingham Palace", "25");
        Challenge challenge2 = new Challenge("Faster than a train",
                Activity.WALKING, Difficulty.MEDIUM,
                "Walk between two tube stops", "30");

        challanges.add(mapperObj.writeValueAsString(challenge1));
        challanges.add(mapperObj.writeValueAsString(challenge2));
        challanges.add(mapperObj.writeValueAsString(challenge));


        Map<String, String> headers = new HashMap<>();
        headers.put("X-Powered-By", "AWS Lambda & Serverless");
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "*");

        return ApiGatewayResponse.builder()
                .setStatusCode(200)
                .setRawBody(challanges.toString())
                .setHeaders(headers)
                .build();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ApiGatewayResponse.builder()
                .setStatusCode(400)
                .build();
	}
}
