package com.serverless;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.domain.Challenge;
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

        String tflString = TflService.getTFLAirQuality();
        String metString = MetService.getMetOfficeHourlyForcast(tmpLat,tmpLong);


        Challenge challenge = GenerateChallange.genarate();
        ObjectMapper mapperObj = new ObjectMapper();

        try {
        String jsonStr = mapperObj.writeValueAsString(challenge);

        Map<String, String> headers = new HashMap<>();
        headers.put("X-Powered-By", "AWS Lambda & Serverless");
        headers.put("Content-Type", "application/json");

        return ApiGatewayResponse.builder()
                .setStatusCode(200)
                .setRawBody(jsonStr)
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
