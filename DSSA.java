package DSA;

import java.util.Random;

public class DSSA {

	public int find(int arrb[],int b) {
		for(int i=0;i<arrb.length-1;i++) {
			if(arrb[i]==b) {
			return 1;
			}
			}
		return 0;
	}
	public int find1(int arra[],int b,int index) {
		 if (index >= arra.length) {
	            return 0;
	        }

	        // If the current element matches the value 'b', return 1 (value found)
	        if (arra[index] == b) {
	            return 1;
	        }

	        // Recursive call to search in the next index
	        return find1(arra, b, index + 1);
	    }
	
public static void main(String args[]) {
	Random rand=new Random();
int arr[]=new int[5];
for(int i=0;i<arr.length-1;i++) {
	arr[i]=rand.nextInt(5);
}
for(int i=0;i<arr.length-1;i++) {
	System.out.print(arr[i]+" ");
}
DSSA d=new DSSA();
int target = 3;  // The value we are searching for

// Measure time for iterative find()
long startTime = System.nanoTime();
int iterativeResult = d.find(arr, target);
long endTime = System.nanoTime();
long iterativeTime = endTime - startTime;

// Measure time for recursive find1()
startTime = System.nanoTime();
int recursiveResult = d.find1(arr, target, 0);
endTime = System.nanoTime();
long recursiveTime = endTime - startTime;

// Print results
System.out.println();
System.out.println("Iterative search result: " + iterativeResult);
System.out.println("Recursive search result: " + recursiveResult);
System.out.println("Iterative search time: " + iterativeTime + " ns");
System.out.println("Recursive search time: " + recursiveTime + " ns");

}
}
