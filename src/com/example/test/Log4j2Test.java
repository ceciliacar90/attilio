package com.example.test;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class Log4j2Test {


	//LogManagar factory per Logger
		private static final Logger log = LogManager.getLogger(Log4j2Test.class);
		@Test
		void loggerTest(){
			assertNotNull(log);
			log.trace("Messaggio di trace attilio");
			log.debug("messaggio di debug attilio");
			log.info("messaggio di info attilio");
			log.warn("messaggio di warn attilio");
			log.error("messaggio di error attilio");
			log.fatal("messaggio di fatal attilio");
		}

}
