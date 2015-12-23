package com.metacube.logger;


public class LoggerMain {
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			int c = 100 / 0;
		} catch (Exception e) {
			LoggerClass loggerClass = LoggerClass.getInstance();
			loggerClass.catchException(e.fillInStackTrace().toString());
		}
		try {
			int[] array = new int[4];
			array[4] = 10;
		} catch (Exception e) {
			LoggerClass loggerClass = LoggerClass.getInstance();
			loggerClass.catchException(e.fillInStackTrace().toString());
		}
		try {
			int[] array = new int[4];
			array[4] = 10;
		} catch (Exception e) {
			LoggerClass loggerClass = LoggerClass.getInstance();
			loggerClass.catchException(e.fillInStackTrace().toString());
		}
	}

}
