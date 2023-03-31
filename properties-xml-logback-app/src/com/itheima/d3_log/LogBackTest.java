package com.itheima.d3_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
     目标：掌握LogBack日志框架的使用。
 */
public class LogBackTest {
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest");

    public static void main(String[] args) {
        // while (true) {
            LOGGER.debug("debug");
            LOGGER.trace("trace");
            LOGGER.warn("warn");
            LOGGER.error("error");
            LOGGER.info("info");
        // }
    }
}
