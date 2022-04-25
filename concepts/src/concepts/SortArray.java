package concepts;

public class SortArray {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
private int rollno;
 public SortArray(String name,int rollno)
 {
	 this.name=name;
	 this.rollno=rollno;
 }
 public static void main(String args[]) {
	int rollno[]= {10,2,5};
	System.out.println("--sorting--");
	for(int i=0;i<rollno.length;i++) {
		System.out.println(rollno[i]);
	}
	
 }
}
