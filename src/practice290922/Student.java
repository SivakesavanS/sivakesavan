package practice290922;

public class Student {
     int rollno;
     String name;
     int mark;
     void display() {
    	 System.out.println(rollno);
    	 System.out.println(name);
    	 System.out.println(mark);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student  s1=new Student();
     Student  s2=new Student();
       s1. rollno=101;
       s1.name="siva";
       s1.mark=50;
       s1.display();     
       s2. rollno=515;
       s2.name="kesavan";
       s2.mark=100;
       s2.display();
	}

}
