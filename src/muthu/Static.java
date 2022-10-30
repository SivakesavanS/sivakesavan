package muthu;

public class Static {
	 // non-static method
//	int max;
//	static void siva() {
//		max=10;
//	}
	 int multiply(int a, int b){
	        return a * b;
	    }

	    // static method
	    static int add(int a, int b){
	    	System.out.println(a*b);
	        return a + b;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an instance of the StaticTest class
        Static st = new Static();

        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // call the static method
        System.out.println(" 2 + 3 = " + add(2,3));
	}

}
