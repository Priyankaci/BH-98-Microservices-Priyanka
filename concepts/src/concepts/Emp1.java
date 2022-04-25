package concepts;

public class Emp1 {
	static double bonusCalculator(Emp emp)
	{
	if(emp.getEdes().equals("Manager"))
	{
	return (emp.getEsal()*30)/100;
	}
	else if(emp.getEdes().equals("Lead"))
	{
	return (emp.getEsal()*25)/100;
	}
	else
	{
	return (emp.getEsal()*20)/100;
	}
	}

	public static void main(String[] args)
	{
	Emp emp1 = new Emp(101, "Ram", 50000.0, 2000.0, "Manager");
	Emp emp2 = new Emp(101, "abhi", 40000.0, 1000.0, "Lead");
	Emp emp3 = new Emp(101, "rajini", 30000.0, 500.0, "Associate");
	System.out.println(bonusCalculator(emp1)+emp1.getEsal()+emp1.getEcomm());
	System.out.println(bonusCalculator(emp2)+emp2.getEsal()+emp2.getEcomm());
	System.out.println(bonusCalculator(emp3)+emp3.getEsal()+emp3.getEcomm());
	}
	}
	