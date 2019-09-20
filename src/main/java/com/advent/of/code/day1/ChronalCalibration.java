package com.advent.of.code.day1;

import java.util.stream.Stream;

public class ChronalCalibration {

    private ChronalCalibration() {
    }

    public static int calibrateFrequency(Stream<Integer> frequencyChanges) {
        return frequencyChanges.mapToInt(value -> value).sum();
    }
}
