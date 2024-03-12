/*
    A
   bAb
  CbAbC
 dCbAbCd
EdCbAbCdE
*/
class Program13
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
			{
				if(j%2==0)
					System.out.print((char)(j+96));
				else
					System.out.print((char)(j+64));
			}
			for(int j=n/2;j<=i;j++)
				if(j%2==0)
					System.out.print((char)(j+96));
				else
					System.out.print((char)(j+64));
				
			System.out.println();
		
		}
	}
}