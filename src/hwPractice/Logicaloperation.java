package hwPractice;

public class Logicaloperation {
	public static void main(String[]args) {
		/*Logical operation
		~ not   << left shift
		& and   >>right  shift
		| or    >>>right shift zero to fill
		^ Ex or
		
		*/
		int a=9,b=12;
		int c=a&b;
		System.out.println("a&b is"+c);
		c=a|b;
		System.out.println("a|b is"+c);
		c=~a;
		System.out.println("a~b is"+c);
	}
}
