
public class Assignment5 {
	
	int checkArrayOrder(int[] arr)
	{
		 int size=arr.length,i;
		 for(i=0;i<size-1;i++)
		 {
			 if(arr[i]>arr[i+1])
			 {break;}
			 
		}
		 if(i==arr.length-1) return 1;
		
				 for(i=0;i<arr.length-1;i++)
				 {
					 if(arr[i]<arr[i+1])
					 {break;}
					 
				}
				 if(i==arr.length-1) return 2;
				 else return 0;
		
	}
	
	
	
	public static void main(String [] arg)

	{
		Assignment5 obj=new Assignment5();
		int[] arr={1,2,3,4,5,6};
		//int[] arr={6,5,4,3,2,1};
		//int[] arr={6,5,9,3,2,1};
		int res=obj.checkArrayOrder(arr);
		System.out.println(res);
		
	}
}
