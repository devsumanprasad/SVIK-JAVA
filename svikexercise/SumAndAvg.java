/*
 * Finf the Sum and Average of two Integers
 */

package svikexercise;
import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum = calcSum(a,b);
		int avg = calcAvg(a,b);
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+avg);
		sc.close();

	}
	static int calcSum(int a, int b) {
		return a+b;
	}
	static int calcAvg(int a, int b) {
		return (int)(a+b)/2;
	}

}
