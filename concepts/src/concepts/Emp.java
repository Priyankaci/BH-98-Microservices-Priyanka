//WAP to calculate employees bonus based on his designation by below rule
//Manager --> 30%,Lead --> 25%,Associate --> 20%
//create employee class with id, name ,salary and commission parameters
//bonus will be salary + commision ,Follow oops

package concepts;

 class Emp {
	 private int eid;
	 private String ename;
	 private double esal;
	 private double ecomm;
	 private String edes;
	 
	 public Emp(int eid,String ename,double esal,double ecomm, String edes) {
		 this.eid=eid;
		 this.ename=ename;
		 this.esal=esal;
		 this.ecomm=ecomm;
		 this.edes=edes;
	 }
	 
	public String getEdes() {
		return edes;
	}

	public void setEdes(String edes) {
		this.edes = edes;
	}

	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsal() {
		return esal;
	}


	public void setEsal(double esal) {
		this.esal = esal;
	}


	public double getEcomm() {
		return ecomm;
	}


	public void setEcomm(double ecomm) {
		this.ecomm = ecomm;
	}
}
