package com.advent.of.code;

import com.advent.of.code.day1.ChronalCalibration;
import com.advent.of.code.utils.Input;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class Boot {
    private static final Logger LOG = LoggerFactory.getLogger(Boot.class);

    public static void main(String[] args) {
        LOG.info("Bootstrapping Advent of Code 2018");

        Stream<Integer> integerStream = Input.use("day1-part1-input.txt").map(Integer::parseInt);
        int calibratedFrequency = ChronalCalibration.calibrateFrequency(integerStream);
        integerStream.close();

        LOG.info("Calibrated Frequency: [{}]", calibratedFrequency);
    }
}
