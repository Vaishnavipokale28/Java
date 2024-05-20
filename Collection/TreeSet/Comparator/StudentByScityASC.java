package com.model;
import java.util.Comparator;
public class StudentByScityASC implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.getScity().compareTo(o2.getScity());
	}

}
