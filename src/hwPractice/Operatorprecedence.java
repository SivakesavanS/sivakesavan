package hwPractice;

public class Operatorprecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Operator precedence------>a*b/10-45+50
		int a=10;
		int b=5;
		//double c=a*b/5-(45+50)/(a/b);----(-37.5)
		double c=(a*b/5-10)*5;
		System.out.print(c);
	}

}
