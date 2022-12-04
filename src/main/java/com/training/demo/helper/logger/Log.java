package com.training.demo.helper.logger;

import org.apache.log4j.Logger;

public class Log {
    private static Logger logger = Logger.getLogger(Log.class);
    public static void info(String message){
        logger.info(message);
    }
    public static void error(String message){
        logger.error(message);
    }
    public static void debug(String message){
        logger.debug(message);
    }
}
