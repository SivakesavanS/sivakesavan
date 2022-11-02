package muthu;
class si{
	si(){
		
		System.out.println("hi si");
	}
	si(int x){
		this();
System.out.println(x);		
	}
	si (int a,int b){
		this(3);
		System.out.println(a+b);
	}

void value() {
//	this();
	System.out.println("k7");
}
}
public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
si s=new si(7,2);
	}

}
