package com.rafaeltpires.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play ping-pong during 7 hours";
    }
}
