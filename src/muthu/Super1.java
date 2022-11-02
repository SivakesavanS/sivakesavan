package muthu;
class parent{
	String color="red";
	parent (){
		System.out.println("parent class constractor");
	}
	void par() {
		System.out.println("hi siva");
	}
}
class chil extends parent{
	String color="blue";
	chil(){
	//	super();
		System.out.println("chile class constractor");
	}
	void col() {
		//super.par();
		
		System.out.println(color);
		//System.out.println(super.color);
	}
	void sk() {
		System.out.println("white");
	}
	void ke() {
		System.out.println("black");
	}
	void sa() {
		//super.par();
		ke();
		sk();
		col();
	}
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
chil s=new chil();
//s.col();
s.sa();
	}

}
