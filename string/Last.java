class Last
{
	public static void main(String args[])
	{				
		String s1="Computer";
		StringBuilder sb=new StringBuilder();
		sb.append(s1.substring(1,s1.length()-1));
		sb.append(s1.charAt(0));
		sb.append(s1.charAt(s1.length()-1));
		System.out.println(sb);	

	
		String s2="Vaishnavi";
		String s3="";
		for(int i=1;i<s2.length()-1;i++)
			s3+=s2.charAt(i);
		s3+=s2.charAt(0);
		s3+=s2.charAt(s2.length()-1);
		System.out.println(s3);
		
		

		String s4="International";
		StringBuilder s= new StringBuilder();
		for(int i=1;i<s4.length()-1;i++)
			s.append(s4.charAt(i));
		s.append(s4.charAt(0));
		s.append(s4.charAt(s4.length()-1));
		System.out.println(s);
		
			
						
	}

}