package frames;

	class Employee {
		 private int eid;
		 private String ename;
		 private double esal;
		 private double ecomm;
		 private String edes;
		 
		 public Employee(int eid,String ename,double esal,double ecomm, String edes) {
			 this.eid=eid;
			 this.ename=ename;
			 this.esal=esal;
			 this.ecomm=ecomm;
			 this.edes=edes;
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

		public String getEdes() {
			return edes;
		}

		public void setEdes(String edes) {
			this.edes = edes;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", ecomm=" + ecomm + ", edes="
					+ edes + "]";
		} 
		
}
