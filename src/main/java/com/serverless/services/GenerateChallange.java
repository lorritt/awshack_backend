package com.serverless.services;

import com.serverless.domain.Challenge;
import com.serverless.domain.Enum.Activity;
import com.serverless.domain.Enum.Difficulty;

public class GenerateChallange {


    public GenerateChallange() {
    }

    public static Challenge genarate() {

        return  new Challenge("Get this working lads", Activity.WALKING, Difficulty.EASY,"Get working");


    }



}
