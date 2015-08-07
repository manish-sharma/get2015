
public class JoinSortedArray {

	
	
	public static int[] merge(int[] a,int aLength, int[] b ,int bLength) {

	    int[] answer = new int[aLength + bLength];
	    int i = 0, j = 0, k = 0;
	    while (i < aLength && j < bLength)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < aLength)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < bLength)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
	}

public static void main(String args[])
{
	JoinSortedArray array = new JoinSortedArray();
int a[]={1,2,3},aLength=3,bLength=3;
	int b[]={4,5,6};
	int c[]=array.merge(a, aLength, b, bLength);
for(int count=0;count<c.length;count++)
	System.out.println(" "+c[count]);

}


}
