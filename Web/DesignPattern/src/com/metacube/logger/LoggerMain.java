package com.metacube.logger;
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