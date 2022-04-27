package javaprojects;

class Student {
	private String sname;
	private int id;
	private int mmarks;
	private int cmarks;
	private int pmarks;
	private Department dept_id;
	private int total;
	
	
	public Student(String sname, int id,int mmarks, int cmarks, int pmarks, Department dept_id) {
		super();
		this.sname = sname;
		this.id = id;
		this.mmarks = mmarks;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.dept_id = dept_id;
	}


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

	public int getMmarks() {
		return mmarks;
	}


	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}


	public int getCmarks() {
		return cmarks;
	}


	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}


	public int getPmarks() {
		return pmarks;
	}


	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}


	public Department getDept_id() {
		return dept_id;
	}


	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", id=" + id +", mmarks=" + mmarks + ", cmarks="
				+ cmarks + ", pmarks=" + pmarks + ", dept_id=" + dept_id + "]";
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

}
