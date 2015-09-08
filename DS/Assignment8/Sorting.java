
abstract class Sorting {
	
	protected int inputArray[];
	public void readData(int inputArray[])
	{
		this.inputArray=inputArray;
	}
	
	public abstract void performSorting();
	
	public void display() 
	{
		if(inputArray==null||inputArray.length==0)
		{
			System.out.println("Array is Empty");
			return;
		}
		for(int data : inputArray)
		{
			System.out.println(data);
		}
	}
	 
}
