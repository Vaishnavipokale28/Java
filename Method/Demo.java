class Demo
{
	int lastDigit(int a)
	{
		return a%10;
	}
	
	int secondLastDigit(int a)
	{
		if(a>=10)
			a/=10;
		return a%10;
	}

	int sumOfDigit(int a)
	{
		int sum=0;
		while(a!=0)
		{
			sum+=a%10;
			a/=10;
		}
		return sum;
	}

	int shiftSumAtLast(int a)
	{
		int sum=0,temp=a,count=0;
		while(temp!=0)
		{
			sum+=temp%10;
			temp/=10;
		}	
			temp=sum;
			while(temp!=0)
			{
				count++;
				temp/=10;
			}
		a*=Math.pow(10,count);
		a+=sum;
		return a;
	}

	
}


