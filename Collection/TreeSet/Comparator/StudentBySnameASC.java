package com.model;
import java.util.Comparator;
public class StudentBySnameASC implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
			 return o1.getSname().compareTo(o2.getSname());
	}

}
