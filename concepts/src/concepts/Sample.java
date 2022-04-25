//WAP to filter only even items from below array
//[3,45,23,78,44,34,88]
package concepts;

class Sample {
 private int a[]= {3,45,23,78,44,34,88};

 public Sample() {
	 this.a=a;
 }
 void array(){
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if (a[i]%2==0) {
			 System.out.println(a[i]);
		 }
	 }
 }
 public static void main(String args[]) {
	 System.out.println("even number");
	 Sample s=new Sample();
	 s.array();
 }
}
