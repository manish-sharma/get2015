
public class DifferenceInt {
	Integer integer = new Integer(8);
	int ab=5;
	public void add(Integer a)
	{
		a = a++;
		System.out.println(a);
		integer = integer+a;	
	}
	
	public void display() {
		System.out.println("integer" + integer);
	}
	
	public static void main(String args[])
	{
		Integer a=new Integer(5);
		int b=6;
		DifferenceInt diff=new DifferenceInt();
		diff.add(a);
		diff.display();
		System.out.println("Integer value ="+a+"\nint value="+b);
	}

}
