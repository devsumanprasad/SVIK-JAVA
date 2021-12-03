/*
 * Java program to swap two numbers with and without using third variable
 */

package svikexercise;
import java.util.Scanner;
public class SwapNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap");
		System.out.println("a = "+a+" b = "+b);
		swapWithout(a,b);
		//Swap(a,b);
		sc.close();

	}
	static void swapWithout(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap without third variable");
		System.out.println("a = "+a+" b = "+b);
		Swap(a,b);
	}
	
	static void Swap(int a, int b) {
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swap with third variable");
		System.out.println("a = "+a+" b = "+b);
		
	}

}
