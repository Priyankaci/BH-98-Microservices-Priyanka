package javaprojects;

import java.util.Objects;

class Department {
	private String dname;
	private int dept_id;
	
	public Department(String dname, int dept_id) {
		super();
		this.dname = dname;
		this.dept_id = dept_id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept_id, dname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return dept_id == other.dept_id && Objects.equals(dname, other.dname);
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + ", dept_id=" + dept_id + "]";
	}

}
