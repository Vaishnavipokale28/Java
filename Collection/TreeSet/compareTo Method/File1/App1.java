package com.demo;
import java.util.TreeSet;
import com.model.Student;
public class App1 {
	public static void main(String args[])
	{
		TreeSet<Student>set= new TreeSet();
		set.add(new Student(14,"Vaishnavi","pune",27.11));
		set.add(new Student(15,"Atharva","Aurangabad",99.3));
		set.add(new Student(16,"Sanvi","Paithan",92.32));
		set.add(new Student(11,"Akshay","Nagar",72.32));
		set.add(new Student(19,"Payal","Mumbai",95.32));
		set.add(new Student(12,"Pratiksha","Nashik",32.32));
		System.out.println(set);
		
	}
}
