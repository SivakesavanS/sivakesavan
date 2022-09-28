package assignment;

public class PrintingOnlyMultiplesof3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
	    for(int i=1;i<=15;i++) {
//	    	if(i%3==0&&i%5==0) {
//	    		System.out.println(i);
//	    	}
	    	 if(i%3==0||i%5==0) {
	    		System.out.println(i);
	    	}
	    }
	}

}
