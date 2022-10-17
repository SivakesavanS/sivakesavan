package abstraction;

public class Interface3 implements Interface1,Interface2{
	String name;
public void gst() {
	System.out.println(Interface1.rate);
}
public void sgst() {
	// TODO Auto-generated method stub
	System.out.println(Interface2.rate);
}
@Override
public void tnpsc() {
	// TODO Auto-generated method stub
	System.out.println(name);
}
@Override
public void upsc() {
	// TODO Auto-generated method stub
	System.out.println(name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface3 s=new Interface3();
		s.gst();
		s.sgst();
		s.name="siva";
		s.upsc();
		s.name="kesavan";
		s.tnpsc();
		
	}
	
}
