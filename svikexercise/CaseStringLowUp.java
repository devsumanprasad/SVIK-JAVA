/*
 * str.toLowerCase(), str.toUpperCase()
 * and capitalize logic
 */

package svikexercise;
import java.util.Scanner;
public class CaseStringLowUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.next();
		System.out.println("Lower case : ");
		System.out.println(str.toLowerCase());
		System.out.println("Upper Case : ");
		System.out.println(str.toUpperCase());
		System.out.println("In Capitalize form");
		System.out.println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase());
		
		

	}

}
