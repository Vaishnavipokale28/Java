class Shift1
{
	public static void main(String args[])
	{
		String s1="Vaishnavi";
		StringBuilder sb= new StringBuilder();
		for(int i=1;i<s1.length();i++)
			sb.append(s1.charAt(i));
		sb.append(s1.charAt(0));
		System.out.println(sb);

		
		String s2="Computer";
		String s3="";
		for(int i=1;i<s2.length();i++)
			s3+=s2.charAt(i);
		s3+=s2.charAt(0);
		System.out.println(s3);


		String s4="International";
		StringBuilder s= new StringBuilder();
		s.append(s4.substring(1));
		s.append(s4.charAt(0));
		System.out.println(s);

		
		StringBuilder b= new StringBuilder("Pune");
		char c= b.charAt(0);
		b.deleteCharAt(0);
		b.append(c);
		System.out.println(b);
	
		
		
		
						
	}
}