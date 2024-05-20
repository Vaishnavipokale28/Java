package com.model;
import java.util.TreeSet;

import com.demo.Student;
public class App3 {

	public static void main(String args[])
	{
		TreeSet<StudentComparator> set=null;
		int check = 6;
		switch(check)
		{
		case 1:
			set=new TreeSet(new StudentBySidDESC());
			break;
		case 2:
			set= new TreeSet(new StudentBySidASC());
			break;
		case 3:
			set= new TreeSet(new StudentBySnameASC());
			break;
		case 4:
			set=new TreeSet(new StudentBySnameDESC());
			break;
		case 5:
			set=new TreeSet(new StudentByScityASC());
			break;
		case 6:
			set=new TreeSet(new StudentByScityDESC());
			
		}
		
		
		set.add(new StudentComparator(14,"Vaishnavi","pune",27.11));
		set.add(new StudentComparator(15,"Atharva","Aurangabad",99.3));
		set.add(new StudentComparator(16,"Sanvi","Paithan",92.32));
		set.add(new StudentComparator(11,"Mira","Nagar",72.32));
		set.add(new StudentComparator(19,"Tanvi","Mumbai",95.32));
		set.add(new StudentComparator(12,"Pratiksha","Nashik",92.32));
		for(StudentComparator s : set)
			System.out.println(s);
	}
	
}
