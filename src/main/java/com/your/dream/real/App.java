package com.your.dream.real;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

	private App()
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {

		Logger logger = Logger.getLogger("App");

    	for(String arg : args) {
			logger.log(Level.INFO, "parameter: {}", arg);
    	}
    }
}
