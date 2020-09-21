package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
	System.out.println( "Hello World!" );
    	String message = "Hello, World";
	    String message = "Hello, World";
//    	Log.debug(message);
    	LOG.debug("This Will Be Printed On Debug");
        LOG.info("This Will Be Printed On Info");
        LOG.warn("This Will Be Printed On Warn");
        LOG.error("This Will Be Printed On Error");
        LOG.fatal("This Will Be Printed On Fatal");
        LOG.info("Appending string: {}.", "Hello, World");
    	System.out.println(message);
    }
}
