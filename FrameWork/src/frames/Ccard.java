package frames;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ccard {

	public static void main(String[] args) {
     Map<CreditCard,Customer> mymap=new LinkedHashMap<CreditCard,Customer>();
     mymap.put(new CreditCard("AB",2022,123),new Customer("Abhi",2443));
     mymap.put(new CreditCard("AC",2016,122),new Customer("Arun",2244));
     mymap.put(new CreditCard("AD",1999,121),new Customer("Raj",2423));
     mymap.put(new CreditCard("AA",2000,124),new Customer("Ram",2442));
     
     System.out.println(mymap);
     
     Map<CreditCard,Customer> resmap = mapSort(mymap);//store sorted result
     System.out.println(resmap);
	}
    static Map<CreditCard,Customer> mapSort(Map<CreditCard,Customer> map) {
    	List<CreditCard> list = new LinkedList<>(); 
    	list.addAll(map.keySet());//set to list
    	Collections.sort(list);
    	Map<CreditCard,Customer> result = new LinkedHashMap<CreditCard,Customer>();
    	for(CreditCard cc:list)
    		result.put(cc, map.get(cc));
    	return result;
    }
}
