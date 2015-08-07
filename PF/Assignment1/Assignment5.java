public class Assignment5
	{
		public  int isSorted(int[] array)
		{
			int flag=0;
			    for(int count = 0; count < array.length-1; count ++){ 

			        if (array[count] < array[count+1])
			            flag=1;
			        else{
			        	flag=0;
			        	break;
			        	}
			        }
			    if(flag==1)
			    	return 1;
			    else {
			    	flag=0;
			    	for(int i = 0; i <array.length-1 ; i ++){ 

			            if (array[i] > array[i+1])
			                flag=1;
			            else{
			            	flag=0;
			            	break;
			            	}
			            }
			    	if(flag==1)
			        	return 2;
			    	else return 0;
				} 
			}
		public static void main(String args[]){
			
		}
	}
