class Shift2
{
	public static void main(String args[])
	{
		String s1="Vaishnavi";
		StringBuilder sb= new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		for(int i=0;i<s1.length()-1;i++)
			sb.append(s1.charAt(i));
		System.out.println(sb);

		
		String s2="Computer";
		String s3="";
		s3+=s2.charAt(s2.length()-1);
		for(int i=0;i<s2.length()-1;i++)
			s3+=s2.charAt(i);
		System.out.println(s3);


		String s4="International";
		StringBuilder s= new StringBuilder();
		s.append(s4.charAt(s4.length()-1));
		s.append(s4.substring(0,s4.length()-1));
		System.out.println(s);

		
		StringBuilder b= new StringBuilder("pune");
		String s5=b.substring(0,b.length()-1);
		b.delete(0,b.length()-1);
		b.append(s5);
		System.out.println(b);
	
		
		
						
	}
}