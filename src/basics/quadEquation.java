package basics;
import java.util.*;
public class quadEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = b*b-4.0*a*c;
		Solution(a,b,d);
	}
	public static void Solution(double a,double b, double d) {
		if (d>0.0) {
			double root1 = (-b + Math.pow(d,0.5))/2.0*a;
			double root2 = (-b - Math.pow(d,0.5))/2.0*a;
			System.out.println("the roots are " + root1 + " and " + root2);
		}
		else if(d==0.0) {
			double root1 = -b /2.0*a;
			double root2 = -b /2.0*a;
			System.out.println("the roots are " + root1 + " and " + root2);
		}
		else {
			System.out.println("Roots are Imaginory");
		}
	}
}
