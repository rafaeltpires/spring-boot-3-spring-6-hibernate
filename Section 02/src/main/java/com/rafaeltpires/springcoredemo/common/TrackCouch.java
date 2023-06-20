package com.rafaeltpires.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCouch implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }
}
