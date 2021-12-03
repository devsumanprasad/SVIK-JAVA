/*
 * Prime in Range
 */
package svikexercise;
import java.util.Scanner;
public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound \n");
		int low = sc.nextInt();
		System.out.println("Enter upper bound \n");
		int up = sc.nextInt();
		for(int i=low;i<=up;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		if(n<2) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
