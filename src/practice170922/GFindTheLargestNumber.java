package practice170922;

public class GFindTheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* double n1 = 3.9, n2 = 3.9, n3 = 3.4;

     if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
	*/
		double n1 = 3.9, n2 = -3.9, n3 = 3.4;
		if( n1 <= n2 && n1 <= n3)
            System.out.println(n1 + " is the smalest number.");

        else if (n2 <= n1 && n2 <= n3)
            System.out.println(n2 + " is the smalest  number.");

        else
            System.out.println(n3 + " is the smalest number.");
	}

}