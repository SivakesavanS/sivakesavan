package practice2609222;

public class EBPill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int unit=650;
    if(unit<=100) {
    	System.out.print(unit*0); 
    }else if(unit >=100&&unit<=200){
    	unit=unit-100;
    	System.out.print(unit*1.5);
    }else if(unit>200&&unit<=500) {
    	unit=unit-100;//deduced 1st 100 for free
    	unit = unit - 100;//decuced 2nd 100 for rs 2
    	//unit=unit-200
    	int a=100*2;// 2nd 100 price
    	int b = unit*3;//remaining unit for rs 3
    	System.out.println(a+b);
    }else if(unit>500) {
    	unit=unit-100;
    	unit=unit-100;
    	unit=unit-300;
    	double c=100*3.5;
    	double d=300*4.6;
    	double e=unit*6.6;
    	System.out.print(c+d+e);
    }
    		
	}

}
