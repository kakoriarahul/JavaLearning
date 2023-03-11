package basics;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " = " + fact);
	}
	public static long factorial(int num){
		
    	if (num >= 1)
    	{
    		long fac = 1;
    		for (int i = 1 ; i <= num ; i++) {
    			fac = fac * i;
    			
    		}
    		return fac;
    	}
    	else
    		return 1;
    	}
}
