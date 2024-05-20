package com.model;
import java.util.Comparator;
public class StudentBySnameDESC implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
				return o2.getSname().compareTo(o1.getSname());
	}

}
