/*
 Java Program to check whether entered number is EVEN or ODD 
 
 */

 
package svikexercise;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='y';
		Scanner sc = new Scanner(System.in);
		
		do {
			
			int num = sc.nextInt();
			boolean b = isEven(num);
			
			if(b) {
				System.out.println(num+" is Even ");
			}
			else {
				System.out.println(num+" is Odd ");
			}
			
			System.out.println("please y for use again and n for exit");
			ch=sc.next().charAt(0);
			
			
		} while(ch=='y' || ch=='Y');
		
		sc.close();
	}
	static boolean isEven(int num) {
		return num%2==0;
	}

}
