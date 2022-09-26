package practice2609222;

public class EBPill1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int unit=650;
    int rem;
    if(unit<100){
    	System.out.print(0);
    }else if(unit>100&&unit<=200) {
    	rem=unit-100;
    	System.out.print(rem*1.5);
    }else if(unit>200&&unit<=500) {
    	rem=unit-200;
   float cost=rem*3;
   float total=cost+200;//2 nd 100 unit*2rs=200
   System.out.print(total);
    }else if(unit>500) {
    	rem=unit-500;
    	double cost=rem*6.6;
    	double total=cost+(100*3.5)+(300*4.6);
    	System.out.print(total);
    }
	}

}
