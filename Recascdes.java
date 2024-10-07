package DSA;
import java.util.Scanner;
public class Recascdes {
	public int pr(int a) {
		if(a<=0) {
			return a;
		}
	else {
		pr(a-1);
		System.out.println(a);
		return a;
	}
	}
	Scanner obj=new Scanner(System.in);
public static void main(String args[]) {
	Recascdes a=new Recascdes();
	int b=a.obj.nextInt();
	a.pr(b);
}
}
