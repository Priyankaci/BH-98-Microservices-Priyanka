package javaprojects;

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;
	import java.util.stream.Collectors;



	public class Result2 {
	public static void main(String[] args) {

	Department d1 = new Department("EEE",111);
	Department d2 = new Department("ECE",222);
	Department d3 = new Department("CSE",333);

	Student s1 = new Student("Shesha",101,32,45,78,d1);
	Student s2 = new Student("Raju",102,98,58,91,d2);
	Student s3 = new Student("Ganesh",103,45,87,67,d1);
	Student s4 = new Student("Naveen",104,66,78,90,d3);

	List<Student> stlist = Arrays.asList(s1,s2,s3,s4);

	for(Student st:stlist)
	st.setTotal(st.getCmarks()+st.getMmarks()+st.getPmarks());

	Map<Department, List<Student>> result = stlist.stream().collect(Collectors.groupingBy(Student::getDept_id));
	//for(Department st : result.keySet()){
		//System.out.println(st+" = "+result.get(st));
		//}
	for(List<Student> st:result.values()) {
	Optional<Student> maxmarks = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getTotal)));//comparing the marks
	System.out.println(maxmarks);
	}
	}
	}
