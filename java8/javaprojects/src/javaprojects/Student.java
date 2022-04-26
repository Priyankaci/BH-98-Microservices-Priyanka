//give student record department wise.
package javaprojects;

import java.util.Objects;

class Std{
	private String sname;
	private int id;
	private int marks;
	private Department dept_id;
	
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Department getDept_id() {
		return dept_id;
	}


	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}


	public Std(String sname, int id, int marks, Department dept_id) {
		super();
		this.sname = sname;
		this.id = id;
		this.marks = marks;
		this.dept_id = dept_id;
	}


	@Override
	public String toString() {
		return "Std [sname=" + sname + ", id=" + id + ", marks=" + marks + ", dept_id=" + dept_id + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dept_id, id, marks, sname);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		return Objects.equals(dept_id, other.dept_id) && id == other.id && marks == other.marks
				&& Objects.equals(sname, other.sname);
	}
}
	