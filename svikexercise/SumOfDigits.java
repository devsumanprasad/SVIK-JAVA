/*
Java program to find sum of all digits
 */

package svikexercise;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long sum = calcSum(num);
		System.out.println(sum);
	}
	static long calcSum(int num) {
		String str = Integer.toString(num);
		long ans =0;
		for(int i=0;i<str.length();i++) {
			ans+=(str.charAt(i)-'0');
		}
		return ans;
	}
}
