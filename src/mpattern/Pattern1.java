package mpattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=0;
for(int col=1;col<=5;col++) {
	System.out.print("* ");

	if(col==5&&row<5) {
		System.out.println();
		col=0;
		row++;
	}
	
}
	}

}
