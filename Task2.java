package haris;

public class Task2 {
int nodup(int a[][],int b[]) {
	int index=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if (!contains(b, index, a[i][j])) {
                b[index++] = a[i][j];
            }
		}
	}
	for(int i=0;i<index;i++) {
		System.out.print(b[i]+" ");
	}
	return 0;
	}
boolean contains(int[] arr, int length, int value) {
    for (int i = 0; i < length; i++) {
        if (arr[i] == value) {
            return true;
        }
    }
    return false;
}
public static void main (String args[]) {
	int a[][]= {
			{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{2,3,4,5,6}
	};
	int b[]=new int[20];
	Task2 obj=new Task2();
	obj.nodup(a,b);
}
}
