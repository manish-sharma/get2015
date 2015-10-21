package creational.singleton;
/**
 * this is the main class of logger design pattern
 * @author Sumitra
 *
 */
public class LoggerMain {
public static void main(String args[]) {
	try{
		int p = 3;
		int d =  p/0;
	}catch(Exception e){
Logger.logMsg(e);
}
}
}
