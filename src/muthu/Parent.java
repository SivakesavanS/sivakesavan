package muthu;
class siva{
	int a=7;
	siva(){
		System.out.println("sivaconst");
	}
}
class kesavan extends siva{
	int a=6;
	kesavan(){
		System.out.println("kesavancons");
	}
}
class sk extends kesavan{
	int a=8;
	sk(int a){
		System.out.println("hi sk");
		this.a=a;
		System.out.println(a);
		System.out.println(this.a);
		//System.out.println(super.a);
		//System.out.println(a);
	}
	void ml() {
		System.out.println(a);
	}
}
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kesavan s=new kesavan();
sk s=new sk(3);
s.ml();
	}

}
