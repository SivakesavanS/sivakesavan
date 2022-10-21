package assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=370;//153
     int b=0; 
     int k=n;
     int a=0;
     int h=n;
     int s=1;
     int d=0;
    while(n>0) {
    	b++;
    	n=n/10;
    }
//    System.out.println(b);
    while(k>0) {
    	a=k%10;
    	s=a;
//    	for(int c=1;c<b;c++) {
//    		s=s*a;
//    	}
    	s=a*a*a;
    		d=d+s;
    		k=k/10;
    	}
    	if(h==d) {	
    	System.out.print("Armstrong number");
    }
    	else {
    		System.out.print("Not a Armstrong number");	
    	}
    	
	}
	}


