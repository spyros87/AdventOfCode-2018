package com.advent.of.code.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class Input {

    private static final Logger LOG = LoggerFactory.getLogger(Input.class);

    private Input() {
        // Sonar indication
    }

    public static Stream<String> use(String fileName) {

        try {
            LOG.info("Reading File [{}]", fileName);
            return Files.lines(Paths.get(Objects.requireNonNull(Input.class.getClassLoader().getResource(fileName)).toURI()));
        } catch (IOException | URISyntaxException e) {
            LOG.error("Cannot read file [{}] due to: ", fileName, e);
        }
        return Stream.empty();
    }
}
