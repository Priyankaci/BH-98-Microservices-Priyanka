package javaprojects;

import java.beans.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Result {

	public static void main(String[] args) {
		Department dpt1=new Department("CSE",111);
		Department dpt2=new Department("EEE",222);
		Department dpt3=new Department("ME",333);
		
		
		
		Std s1 = new Std("Raj",111,92,dpt1);
		Std s2 = new Std("ram",222,96,dpt3);
		Std s3 = new Std("Suraj",333,86,dpt2);
		Std s4 = new Std("Tom",222,79,dpt1);
		
		
		List<Std> students = Arrays.asList(s1,s2,s3,s4);
		Map<Department,List<Std>> studentsDepartment= students.stream().collect(Collectors.groupingBy(Std::getDept_id));
	
		System.out.println(studentsDepartment);
	}

}
