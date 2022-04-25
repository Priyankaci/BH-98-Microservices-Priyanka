package concepts;

public class SortStudent
{
static Student2[] sort(Student2[] st)
{
for(int i = 0; i < st.length; i++)
{
for(int j = i + 1; j < st.length; j++)
{
if(st[i].getRollNo()>st[j].getRollNo())
{
Student2 temp = st[i];
st[i] = st[j];
st[j] = temp;
}
}
}
return st;
}
public static void main(String[] args)
{
Student2 st1 = new Student2(104, "Raju");
Student2 st2 = new Student2(103, "Adi");
Student2 st3 = new Student2(102, "Ganesh");
Student2[] st = {st1, st2, st3};

for(int i = 0; i < st.length; i++)
{
System.out.println(st[i].getRollNo());
}

sort(st);

System.out.println("----------");
for(int i = 0; i < st.length; i++)
{
System.out.println(st[i].getRollNo());
}
}
}