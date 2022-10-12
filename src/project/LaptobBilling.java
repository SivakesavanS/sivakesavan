package project;
import java.util.Scanner;
public class LaptobBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("Enter Your Name");
  String name=s.nextLine();
//  2/System.out.println(name);
  System.out.println("Enter Your Number");
  String number=s.nextLine();
  System.out.println("Enter Your Laptop Count");
  int count=s.nextInt();
  int sum=0;
  double sum1=0;
  double Discount=0;
  for(int i=1;i<=count;i++) {
	  System.out.println("Enter Your " + i + " Laptop Price");
	  double Price=s.nextDouble();
	  
	  if(Price<=25000) {
		  Discount=(Price/100)*5;
		  Price=Price-Discount;
		 // System.out.println("After Discount = " +  Price);
	  }
	  else if(Price>25000&&Price<=50000) {
		  Discount=(Price/100)*7.5;		
		  
		  Price=Price-Discount;
		 // System.out.println("After Discount = " +  Price);
	  }
	  else if(Price>50000&&Price<=100000) {
		  Discount=(Price/100)*10;
		  Price=Price-Discount;
		 // System.out.println("After Discount = " +  Price);
	  }
	  else if(Price>100000) {
		  Discount=(Price/100)*15;
		  Price=Price-Discount;
		 // System.out.println("After Discount=" + Price);
	  }
	  sum+=Price;
	  sum1+=Discount;
  }
  System.out.println("-----------------------------------" );
  System.out.println("Invoice Number = " + "1234567" );
  System.out.println("Custamer Name = " + name );
  System.out.println("Custamer Name = " + number );
  System.out.println("Total Discount Price = " + sum1);
 System.out.println("Total Price = " + sum);
 System.out.println("-----------------------------------" );
	}

}
