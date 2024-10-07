package DSA;
public class Fab1 {
	public void fib(int N) {
	long startTime = System.nanoTime(); // Start time
	int a=0,b=1;
	for(int i=0;i<N;i++) {
		System.out.print(a+" ");
		int num3=a+b;
		a=b;
		b=num3;
	}
	long endTime = System.nanoTime(); // End time
    long duration = endTime - startTime;
    System.out.println("\nTime taken by Iterative Fibonacci: " + duration + " nanoseconds");
	}
	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }
public static void main(String args[]) {
	Fab1 f=new Fab1();
	f.fib(9);
	System.out.println();
    long startTime = System.nanoTime(); // Start time for recursive
	System.out.print(n1+" "+n2);//printing 0 and 1    
printFibonacci(9-2);
long endTime = System.nanoTime(); // End time for recursive
long duration = endTime - startTime;
System.out.println("\nTime taken by Recursive Fibonacci: " + duration + " nanoseconds");
}
}
