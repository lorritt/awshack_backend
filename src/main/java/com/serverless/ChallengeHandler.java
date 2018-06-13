package com.serverless;


import java.util.HashMap;
import java.util.Map;

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



        Response responseBody = new Response(tflString + " " + metString);
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Powered-By", "AWS Lambda & Serverless");
        headers.put("Content-Type", "application/json");

        return ApiGatewayResponse.builder()
                .setStatusCode(200)
                .setObjectBody(responseBody)
                .setHeaders(headers)
                .build();
	}
}
