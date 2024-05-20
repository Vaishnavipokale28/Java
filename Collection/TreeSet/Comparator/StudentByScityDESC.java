package com.model;
import java.util.Comparator;
public class StudentByScityDESC implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o2.getScity().compareTo(o1.getScity());
	}

}
