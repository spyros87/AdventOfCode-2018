package com.advent.of.code.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ChronalCalibrationTest {

    private ChronalCalibration underTest;

    @BeforeEach
    void setUp() {
        underTest = new ChronalCalibration();
    }

    @Test
    void calibrationInSteps() {

        int calibratedFrequency = underTest.calibrateFrequency(1, -2, 3, 1);

        assertThat(calibratedFrequency).isEqualTo(3);
    }
}