package com.advent.of.code.day1;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ChronalCalibrationTest {

    @Test
    void calibrationInSteps() {

        int calibratedFrequency = ChronalCalibration.calibrateFrequency(Stream.of(1, -2, 3, 1));

        assertThat(calibratedFrequency).isEqualTo(3);
    }
}