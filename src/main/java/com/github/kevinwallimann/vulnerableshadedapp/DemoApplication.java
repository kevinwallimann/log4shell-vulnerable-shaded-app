package com.github.kevinwallimann.vulnerableshadedapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.lookup.JndiLookup;

public class DemoApplication {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class.getName());

	public static void main(String[] args) {
		if (args.length != 1) {
			logger.error("Please provide exactly one argument");
		} else {
			JndiLookup jndiLookup = new JndiLookup();
			jndiLookup.lookup(args[0]);
			logger.info("JNDI lookup has been done with " + args[0]);
		}
	}
}
