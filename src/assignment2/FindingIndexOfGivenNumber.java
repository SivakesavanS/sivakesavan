package assignment2;

public class FindingIndexOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String a[]= {"paul","lucy","jegatheesh","arun","john"};
 int b=0;
  for(int i=0;i<a.length;i++) {
	  if(a[i]=="john") {
		 b=i;
	  }	
  }
  System.out.println(b);
	}

}
