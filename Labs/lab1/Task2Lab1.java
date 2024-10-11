import java.util.Scanner;
public class Task2Lab1 {
    public static void main(String args[]){
    // public noDup(){
    int count = 0;

int TwoDArray[][] = new int[4][5];
Scanner TakeArray = new Scanner(System.in);
int OneDArray[]= new int[20];
System.out.println("Enter elements of the 2D array:");
for (int i = 0; i <= TwoDArray.length; i++) {
    for (int j = 0; j <= TwoDArray.length; j++) {
        TwoDArray[i][j] = TakeArray.nextInt();
            }
    
}

Boolean isDup = false;
for (int i = 0; i < TwoDArray.length-1; i++) {
    for (int j = 0; j < TwoDArray.length-1; j++) {
        
        for (int k = 1; k <= count; k++) {
            

            if(TwoDArray[i][j]== OneDArray[k]) {
                isDup = true;
                break;
            }
            
        }
        if(!isDup) {
            OneDArray[count]=TwoDArray[i][j];
            count++;
    }
}


System.out.println("Elements of the 1D array after removing duplicates:");
for (int i2 = 0; i2 < count - 1; i2++) {
    System.out.print(OneDArray[i2] + " ");

    }


   
    }}
}
    

