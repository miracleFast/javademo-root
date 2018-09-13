package com.miracle.javademo.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.debug("hello log4j2 debug");
        logger.info("hello log4j2 info");
        logger.warn("hello log4j2 warn");
        logger.error("hello log4j2 error");
    }
}
