import java.util.Arrays;
class ArrayMethod
{
	void displayArray(int a[])
	{
		System.out.println(Arrays.toString(a));
	}

	int  sumOfArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;

	}
	double avgOfArray(int a[])
	{
		return(double) sumOfArray(a)/a.length;
	}

	int[] findOddFromArray(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2!=0)
				count++;
		int b[]=new int[count];
		count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2!=0)
				b[count++]=a[i];
		return b;
	}

	double findAvgOfOddFromArray(int a[])
	{
		return avgOfArray(findOddFromArray(a));
		
	}

	int [] findEvenFromArray(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
				count++;
		int c[]=new int[count];
		count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
				c[count++]=a[i];
		return c;
	}
	

	double findAvgOfEvenFromArray(int a[])
	{
		return avgOfArray(findEvenFromArray(a));
	}
	

}