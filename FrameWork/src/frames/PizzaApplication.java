package frames;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Pizza{
	private String pname;
	private int price;
	public Pizza(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pizza [pname=" + pname + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(pname, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return Objects.equals(pname, other.pname) && price == other.price;
	}

}
public class PizzaApplication {

	public static void main(String[] args) {
       Pizza p1=new Pizza("Maegherita",230);
       Pizza p2=new Pizza("Pepper",199);
       Pizza p3=new Pizza("Double Cheese",430);
	
       Map<Integer,Pizza> pizza=new HashMap<Integer,Pizza>();
       pizza.put(11, p1);
       pizza.put(12, p2);
       pizza.put(13, p3);
       
       
       System.out.println("Welcome");
       System.out.println("Please select from menu");
       System.out.println(pizza);
       Scanner sc=new Scanner(System.in);
       sc.nextInt();
	}
 
}
