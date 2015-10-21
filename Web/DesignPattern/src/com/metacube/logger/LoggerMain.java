package com.metacube.logger;

/**
 * to execute the function of Logger
 * @author Ravika
 * @since 10/21/2015
 * /
public class LoggerMain {
	public static void main(String args[]) {
		Logger logger = Logger.getLogger();
		try{
			int p = 3;
			int d =  p/0;
		}catch(Exception exception){
			logger.log(exception);
		}
	}
}
