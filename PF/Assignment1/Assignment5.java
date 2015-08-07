
public class Assignment5 {

	int sorted(int input[])
    { int frist=input[0];
      int second=input[1],output=0;
        if(frist>second)
      { 
          for(int i=2;i<input.length;i++)
          { 
            frist=second;
          second=input[i];
          if(second>frist)
          return 0;
           output=2;
         }
      
      }
      else
      {
      for(int i=2;i<input.length;i++)
          { 
            frist=second;
          second=input[i];
          if(second<frist)
          return 0;
           output=1;
         }
      }
      
    
    return output;
    }
    
    public static void main(String[] args) {
        int a[]={0,1,2,6,7,3,4};
        Assignment5 b=new Assignment5();
        System.out.println(b.sorted(a));
        
    }
    
}

