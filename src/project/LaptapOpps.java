package project;
import java.util.Scanner;
public class LaptapOpps {
void Laptop(int a) {
	Scanner s=new Scanner(System.in);
	int b[]=new int [a];
	 double c[]=new double[a];
	  double d[]=new double[a];
	int sum=0;
	for(int i=0;i<b.length;i++) {
		  System.out.print("Enter Your Amount   ");
		  b[i]=s.nextInt();
	  }
	  for(int i=0;i<b.length;i++) {
		  if(b[i]<=25000) {
			  c[i]=(b[i]/100)*5;
			  d[i]=b[i]-c[i];
			  System.out.println("---------------------------"); 
			  System.out.println("MRP               = " + b[i]);
			  System.out.println("Discount          = " + "5%");
			  System.out.println("Discount Amount   = " + c[i]);
			  System.out.println("Discount Price    = " + d[i]);  
			  System.out.println("---------------------------"); 
		  }
		  else if(b[i]>25000&&b[i]<=50000) {
			  c[i]=(b[i]/100)*7.5;
			  d[i]=b[i]-c[i];
			  System.out.println("MRP               = " + b[i]);
			  System.out.println("Discount          = " + "7.5%");
			  System.out.println("Discount Amount   = " + c[i]);
			  System.out.println("Discount Price    = " + d[i]);  
			  System.out.println("---------------------------");
		  }
		  else if(b[i]>50000&&b[i]<=100000) {
			  c[i]=(b[i]/100)*10;
			  d[i]=b[i]-c[i];
			  System.out.println("MRP               = " + b[i]);
			  System.out.println("Discount          = " + "10%");
			  System.out.println("Discount Amount   = " + c[i]);
			  System.out.println("Discount Price    = " + d[i]);  
			  System.out.println("---------------------------");
		  }
		  else if(b[i]>100000) {
			  c[i]=(b[i]/100)*15;
			  d[i]=b[i]-c[i];
			  System.out.println("MRP               = " + b[i]);
			  System.out.println("Discount          = " + "15%");
			  System.out.println("Discount Amount   = " + c[i]);
			  System.out.println("Discount Price    = " + d[i]);  
			  System.out.println("---------------------------");
		  }
		 
		  sum+=d[i];
	  }
	          System.out.println("Total Price       = " +     sum);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Name     ");
		String name=s.nextLine();
		System.out.print("Enter Your Number   ");
		String Number=s.nextLine();
		
		LaptapOpps k=new LaptapOpps();
		System.out.print("Enter Your count    ");
		int a=s.nextInt();
		
		
		k.Laptop(a);
		
	}

}
