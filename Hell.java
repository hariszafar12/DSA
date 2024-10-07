package haris;
import java.util.Scanner;
public class Hell {
	public int calc(int a[]){
		for(int i=0;i<10;i++) {
			if(!(a[i]%2==0)) {
					System.out.print(a[i]+" ");
				}
		}
		for(int i=0;i<10;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
	}
		return 0;
		}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[100];
	
	System.out.println("input numbers:");
	for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Input:");
	for(int i=0;i<10;i++) {
		System.out.print(a[i]+" ");
		}
	System.out.println();
	System.out.println("Output:");
	Hell obj=new Hell();
	obj.calc(a);
}
	
}
