package com.advent.of.code.day1;

public class ChronalCalibration {

    private int frequency;

    public int calibrateFrequency(int... frequencyChanges) {
        for (int c : frequencyChanges) {
            frequency += c;
        }
        return frequency;
    }
}
