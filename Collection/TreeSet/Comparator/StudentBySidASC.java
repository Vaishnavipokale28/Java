package com.model;
import java.util.Comparator;
public class StudentBySidASC implements Comparator<StudentComparator> {

	

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if(o1.getSid()<o2.getSid())
			return -1;
		else if(o1.getSid()>o2.getSid())
			return 1;
		return 0;
	}

}
