package frames;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class CreditCard implements Comparable<CreditCard>{
 private String cname;
 private int expd;
 private int csc;
 
 public CreditCard(String cname,int expd,int csc) {
	 this.cname=cname;
	 this.expd=expd;
	 this.csc=csc;
	 
 }
	public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getExpd() {
	return expd;
}
public void setExpd(int expd) {
	this.expd = expd;
}
public int getCsc() {
	return csc;
}
public void setCsc(int csc) {
	this.csc = csc;
}

	@Override
public String toString() {
	return "CreditCard [cname=" + cname + ", expd=" + expd + ", csc=" + csc +"]";
}
	@Override
	public int hashCode() {
		return Objects.hash(cname,csc, expd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(cname, other.cname) &&csc == other.csc && expd == other.expd;
	}
	@Override
	public int compareTo(CreditCard c) {
		int compare =c.getExpd();
        return this.getExpd() - compare;
		
	}
	
}