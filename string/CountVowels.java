class CountVowels
{
	public static void main(String args[])
	{				
				
			String s1="International";
			int count=0;
			for(int i=0;i<s1.length();i++)
			{	
				if(s1.charAt(i)=='A'||s1.charAt(i)=='a'||s1.charAt(i)=='E'||s1.charAt(i)=='e'||s1.charAt(i)=='I'||s1.charAt(i)=='i'||s1.charAt(i)=='O'||s1.charAt(i)=='o'||s1.charAt(i)=='U'||s1.charAt(i)=='u')
					count++;
			}
		System.out.println(count);


		String s2="Vaishnavi";
		int count1=0;
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
				count1++;
		}
		System.out.println(count1);

		
		
		String s3="Computer";
		s3=s3.toUpperCase();
		int count2=0;
		for(int i=0;i<s3.length();i++)
		{
			char ch=s3.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					count2++;
		}
		System.out.println(count2);



		String s4="Sambhajinagar";
		String s5="AEIOUaeiou";
		int count3=0;
		for(int i=0;i<s4.length();i++)
		{
			if (s5.contains(String.valueOf(s4.charAt(i)))) {
  			  count3++;
			}
		}
		System.out.println(count3);
			
	}
	
}