package com.metacube.logger;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class LoggerClass {
	
		private static Logger logger = Logger.getLogger(LoggerClass.class.getName());
		private static LoggerClass loggerClass = new LoggerClass();
		Handler fileHandler;
		Handler consoleHandler;
		private LoggerClass() {
			try {
				fileHandler = new FileHandler("./test.log",true);
				consoleHandler = new ConsoleHandler();
				fileHandler.setFormatter(new SimpleFormatter());
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public static LoggerClass getInstance() {
			return loggerClass;
		}
		public void catchException( String string ) {
			logger.removeHandler(fileHandler);
			logger.removeHandler(consoleHandler);
			logger.addHandler(consoleHandler);
			logger.addHandler(fileHandler);
			logger.setLevel(Level.FINEST);
			consoleHandler.setLevel(Level.FINEST);
			fileHandler.setLevel(Level.FINEST);
			logger.config(string);
		}
}

