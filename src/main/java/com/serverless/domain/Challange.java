package com.serverless.domain;

import com.serverless.domain.Enum.Activity;
import com.serverless.domain.Enum.Difficulty;

public class Challange {

    public String name;
    public Activity activity;
    public Difficulty difficulty;
    public String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}

