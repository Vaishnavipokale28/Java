import java.util.Arrays;
class MergeArray
{
	public static void main(String args[])
	{
		int a[]={10,23,18,24,19,12};
		int b[]={21,36,16,32,51};
		int a1=a.length;
		int b1=b.length;
		int c=a1+b1;
		int c1[]= new int[c];
		for(int i=0;i<a1;i++)
			c1[i]=a[i];
		for(int i=0;i<b1;i++)
			c1[a1+i]=b[i];				
		System.out.println(Arrays.toString(c1));			 	
	}
}
