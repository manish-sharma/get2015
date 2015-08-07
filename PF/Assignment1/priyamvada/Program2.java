package priyamvada;
import java.util.Arrays;
/*Program to remove duplicate numbers in an array*/

public class Program2 {
	 
    public static int[] removeDuplicates(int[] duplicate){
         
        int j = 0;
        int i = 1;
        //sorting the unsorted array
        Arrays.sort(duplicate);
        while(i < duplicate.length){
            if(duplicate[i] == duplicate[j]){
                i++;
            }else{
                duplicate[++j] = duplicate[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = duplicate[k];
        }
         
        return output;
    }
     
    public static void main(String args[]){
        int[] duplicate = {2,5,4,6,3,8,5,3,3,6,3,9,0};
        int[] output = removeDuplicates(duplicate);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}