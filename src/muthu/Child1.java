package muthu;
class ke{
	static {
		System.out.println("hi static");
	}
	ke(){
		System.out.println("hi cons");
	}
	void get1() {
		System.out.println("hi get 1");
	}
}
class siv extends ke{
	static {
		System.out.println("hi static");
	}
	siv(){
		System.out.println("hi cons");
	}
	void get2() {
		System.out.println("hi get 2");
	}
}
class an extends siv{
	static {
		System.out.println("hi static");
	}
	an(){
		System.out.println("hi cons");
	}
	void get3() {
		System.out.println("hi get 3");
	}
}
public class Child1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
an s=new an();
s.get1();
s.get2();
s.get3();
	}

}
