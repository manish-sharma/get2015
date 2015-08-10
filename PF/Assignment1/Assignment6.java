
public class Assignment6 {

	int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int apointer=0,bpointer=0;
		for(int i=0;i<(asize+bsize);i++)
		{
			if(apointer!=asize && a[apointer]<b[bpointer]){
				c[i]=a[apointer];
				apointer++;
			}
			else{
				if(bpointer!=bsize){
					c[i]=b[bpointer];
					bpointer++;
				}
			}
		}
		
		return c;
	}
	public static void main(String[] args) {
		Assignment6 assignment6=new Assignment6();
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int asize=a.length,bsize=b.length;
		int c[]=new int[asize+bsize];
		int arrayc[]=assignment6.join(a,asize,b,bsize,c);
        for (int i = 0; i <arrayc.length; i++) {
            
              System.out.println(arrayc[i]);
        }
	}
}
