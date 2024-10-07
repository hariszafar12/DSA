package DSA;

public class charaar {
	public void display(char a[],int index) {
		if(index>=a.length) {
			return;
		}
		else {
		System.out.println(a[index]);
		display(a,index+1);
		}
	}
static char arr[]= {'a','b','c','d'};
	public static void main(String[] args) {
charaar a=new charaar();
a.display(arr, 0);
	}

}
