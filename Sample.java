public class Sample{
	 int no;
	 String name;
	 double marks;
	 Sample(){
		this.no=5;
		 this.name="Madhu";
		 this.marks=100.0;
	 }
	 Sample(int no,String name,double marks){
		 this.no=no;
		 this.name=name;
		 this.marks=marks;
	 }
	 public static void main(String[] args){
		 System.out.println("hi");
		 Sample s1=new Sample(111,"Madhu",90.99);
	 }
}
