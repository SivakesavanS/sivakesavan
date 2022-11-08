package mpattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
for(int col=1;col<=5;col++) {
	System.out.print(col);
	
	if(col%5==0) {
		col=0;
		row++;
		System.out.println();
	}
	if(row==6) {
		break;
	}
	
}


	}
}

