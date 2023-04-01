package com.rafaeltpires.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes in batting practice";
    }
}
