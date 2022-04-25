package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FullName
{
public static void main(String[] args)
{
List<String> mylist1 = Arrays.asList("ram","raj","raju");
List<String> mylist2 = Arrays.asList("kumar","kumar","gowda");



List<String> result = new ArrayList<>();



result.add(mylist1.get(0)+mylist2.get(0));
result.add(mylist1.get(1)+mylist2.get(1));
result.add(mylist1.get(2)+mylist2.get(2));
System.out.println(result);
}
}