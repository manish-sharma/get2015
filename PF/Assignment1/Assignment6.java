
public class Assignment6 {
	int[]join(int a[],int asize,int b[],int bsize,int c[])
{  int indexa=0,indexb=0;
for(int i=0;i<(asize+bsize);i++)
{if( indexa!=asize && a[indexa]<b[indexb])
{ c[i]=a[indexa];
   indexa++;
}
else
{ if(indexb!=bsize)
 {
    c[i]=b[indexb];
    indexb++;

 } 
 }
}
return c;
}
public static void main(String[] args) {
Assignment6 as6=new Assignment6();
int a[] = {0,2,3,4,5,6};
int b[] ={3,5,6,8,9};
int asize=a.length;
 int bsize=b.length;
  int c[]=new int[asize+bsize];
c=as6.join(a, asize, b, bsize, c);
for(int i=0;i<c.length;i++)
    System.out.println(c[i]);
}

}
