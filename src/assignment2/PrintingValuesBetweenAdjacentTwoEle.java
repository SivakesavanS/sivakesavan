package assignment2;

public class PrintingValuesBetweenAdjacentTwoEle {
void Adjascent(int a[]) {
	int c;
	for(int i=0;i<a.length-1;i++) {
		c=a[i+1]-a[i];
		
		
		
		System.out.println(c);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k[]= {2,11,32,4,5};
PrintingValuesBetweenAdjacentTwoEle s=new PrintingValuesBetweenAdjacentTwoEle();
s.Adjascent(k);
	}

}
