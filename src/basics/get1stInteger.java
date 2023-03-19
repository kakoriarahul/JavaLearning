package basics;
import java.util.*;
public class get1stInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int no = sc.nextInt();
		firstDigit(no);
		
	}
	public static void firstDigit(int a) {
		int firstDigit = a;

		while(firstDigit > 9){
			firstDigit = firstDigit/10;
		}
		System.out.println("First digit of the number : " + firstDigit);
	}
}
