package muthu;

public class This1 {
	String name;
	String degree;
	int year;
	
	This1(){
		System.out.println("Provide = tea and biscuit given for every one");
	}
	This1(String name,String degree,int year){
	//this();//while we call another constructor this should be the first stae.
	this.name=name;
	this.degree=degree;
		this.year=year;	
//		System.out.println("Name 	:"+name);
//		System.out.println("Degree  :"+degree);
//		System.out.println("Year 	:"+year);
	
	}
void call() {
		System.out.println("Name 	:"+name);
		System.out.println("Degree  :"+degree);
		System.out.println("Year 	:"+year);
	}
void siva() {
	this.call();
	System.out.println("hi");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
This1 s=new This1("siva","MECH",2020);
This1 k=new This1("paul","EEE",2020);
//s.call();
//k.call();
s.siva();
k.siva();
	}

}
