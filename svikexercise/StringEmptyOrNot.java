/*
 How to check whether a given string is empty or not in Java
 */

package svikexercise;
import java.util.Scanner;
public class StringEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str1="";
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(!str.isEmpty()) {
			System.out.println("String is not Empty");
		}
		else {
			System.out.println("String is Empty");
		}
		if(str1.isEmpty()) {
			System.out.println("str1 is empty");
		}
		else {
			System.out.println("str1 not empty");
		}
		

	}

}
