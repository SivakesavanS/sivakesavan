package muthu;

public class ConsParameterised {
	ConsParameterised(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	ConsParameterised(int a,int b,int c){
		int d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsParameterised s=new ConsParameterised(2,4);
		ConsParameterised s1=new ConsParameterised(2,4,3);
	}

}
