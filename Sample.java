public class Sample{
	 int no;
	 String name;
	 double marks;
	 Sample(int no,String name,double marks){
		 this.no=no;
		 this.name=name;
		 this.marks=marks;
	 }
	 public int setNo(int no){
		 this.no=no;
     }
	 public static void main(String[] args){
		 System.out.println("hello");
		 Sample s1=new Sample(111,"Madhu",90.99);
	 }
}
