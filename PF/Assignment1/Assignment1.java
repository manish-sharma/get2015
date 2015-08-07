package Assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int octal1,binary1=110101;
		octal1= convertBinaryToOctal(binary1);
		System.out.println(octal1);
	}
static int convertBinaryToOctal(int n)
{
	int decimal=0,octal=0,i,a;
	for(i=0;n>0;i++)
	{
		a=n%10;
		decimal+=a*power(2,i);
		n=n/10;
	}
	i=1;
	while(decimal>0)
	{
		a=decimal%8;
		octal+=a*i;
		decimal=decimal/8;
		i=i*10;
	}
	return octal;
}
    static int power(int no,int p)
    {
	int x=1;
    while(p>0)
    {
    	x=x*no;
    	p--;
    }
	return x;
    }
}
