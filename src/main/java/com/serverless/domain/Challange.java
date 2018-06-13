package com.serverless.domain;

import com.serverless.domain.Enum.Activity;
import com.serverless.domain.Enum.Diffiuclty;

public class Challange {

    public String name;
    public Activity activity;
    public Diffiuclty difficulty;
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

    public Diffiuclty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Diffiuclty difficulty) {
        this.difficulty = difficulty;
    }
}

