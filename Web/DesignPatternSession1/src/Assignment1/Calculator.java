package Assignment1;

/**
 * @author Chetna
 * Logger class (Singleton) to log application exceptions in Log file
 */
public class Calculator {
	private int firstValue;
	private int secondValue;
		
	/**
	 * @return the firstValue
	 */
	public int getFirstValue() {
		return firstValue;
	}

	/**
	 * @param firstValue the firstValue to set
	 */
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	/**
	 * @return the secondValue
	 */
	public int getSecondValue() {
		return secondValue;
	}

	/**
	 * @param secondValue the secondValue to set
	 */
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	/**
	 * @return : addition of firstValue and secondValue
	 */
	public int addition () {
		return this.firstValue + this.secondValue;
	}
	
	/**
	 * @return : subtraction of firstValue and secondValue
	 */
	public int subtraction () {
		return this.firstValue - this.secondValue;
	}
	
	/**
	 * @return : multiplication of firstValue and secondValue
	 */
	public int multiplication () {
		return this.firstValue * this.secondValue;
	}
	
	/**
	 * @return : division of firstValue and secondValue
	 */
	public int division () {
		int result = 0;
		try {
			result = this.firstValue / this.secondValue;
		} catch (ArithmeticException e) {
			Logger logger = Logger.getInstance();
			logger.insertIntoLogger(e.getMessage());
			System.out.println(e.getMessage());
		}
		return result;
	}

}
