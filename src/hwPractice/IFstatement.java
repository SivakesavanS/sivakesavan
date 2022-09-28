package hwPractice;
import java.util.Scanner;
public class IFstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int mark;
    Scanner input=new Scanner (System.in);
    System.out.print("enter a  nummber");
    
    mark=input.nextInt();
    /*if(num>=18&&num<=60) {
    	System.out.println("siva");
    	
    }else if(num>=61&&num<100) {
    	System.out.println("kesavan");
    }
    else {
    	System.out.println("siivakesavan");
    }
    */
    if(mark>=60&&mark<=69) {
    System.out.print("A");}
    else if(mark>=80)
    System.out.print("B");
    else if(mark>=70)
    System.out.print("C");
    else if(mark>=60)
    System.out.print("D");
    else if(mark<60)
    System.out.print("E");
	}

}
