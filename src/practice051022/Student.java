package practice051022;

public class Student {
    int rollno;
    String name;
    int mark;
    char grade;
    
    void setGrade() {
    	if(mark<=100&&mark>=91) {
    		grade='A';
    	}else if(mark<=90&&mark>=81) {
    		grade='B';
    	}else if(mark<=80&&mark>=71) {
    		grade='C';
    	}else if(mark<=70&&mark>=61) {
    		grade='d';
    	}else if(mark<=60&&mark>=51) {
    		grade='E';
    	}else if(mark<50){
    		grade='U';
    	}
        
    	
    			
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		   s.rollno=200;
		   s.name="siva";
		   s.mark=90;
		   s.setGrade();
		   System.out.println(s.grade);
		   
	}

}
