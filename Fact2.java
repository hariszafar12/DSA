package DSA;

public class Fact2 {
	public void fac(int n) {
		long startTime = System.nanoTime(); // Start time
		int f=1;
		for(int i=1;i<=n;i++) {
		f=f*i;
		System.out.print(f+" ");
		}
		long endTime = System.nanoTime(); // End time
	    long duration = endTime - startTime;
	    System.out.println("\nTime taken by Iterative Factorial: " + duration + " nanoseconds");
	}
	public int fac1(int n) {
		long startTime = System.nanoTime(); // Start time
		if(n==0||n==1) {
			System.out.print(n+" ");
			return n;
		}
		else {
			int b=n*fac1(n-1);
			System.out.print(b+" ");
			return b;
		}
	}
 public static void main(String args[]) {
Fact2 d=new Fact2();
d.fac(4);
System.out.println();
long startTime = System.nanoTime(); // Start time
d.fac1(4);
long endTime = System.nanoTime(); // End time
long duration = endTime - startTime;
System.out.println("\nTime taken by Recursive Factorial: " + duration + " nanoseconds");
 }
}
