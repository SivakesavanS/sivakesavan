package assignment2;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20, 40, 60, 80, 100, 120, 150};
		int i,num=1000;
		for(i = 0; i < a.length; i++) 
		{
			if(a[i] == num) 
			{
				System.out.println("The Index Position of " + num + " = " + i);
				break;
			}
		}
		if(i == a.length)
		{
			System.out.println("Number Not Found");
		}
	}

}
