package DSA;

public class Dct {
public String DecimalToBinary(int num) {
	if (num == 0) {
        return "0";
    } else if (num == 1) {
        return "1";
    } else {
        return DecimalToBinary(num / 2) + (num % 2);
    }
}
	public static void main(String[] args) {
Dct d=new Dct();
System.out.println(d.DecimalToBinary(13));
	}

}
