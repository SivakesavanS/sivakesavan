package practice140922;

public class ArraySmalastNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {9,-8,8,-30,28,44};
		    int mini=a[0];
		    for(int i=0;i<a.length;i++) {
		    	if(mini>a[i]) {
		    		mini=a[i]; 
		    		}
		    	}
		  System.out.print(mini);
		    	}
	}


