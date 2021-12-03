/*
 Program to check palindrom string or not
 */
package svikexercise;
import java.util.Scanner;
public class PalindromStr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='y';
		Scanner sc = new Scanner(System.in);
		do {
			String str = sc.next();
			
			boolean p = isPalindrom(str);
			if(p) {
				System.out.println(str+ " is Palindrom");
			}
			else {
				System.out.println(str+" Not a Palindrom");
			}
			
			System.out.println("press y for repeat and n for exit");
			ch = sc.next().charAt(0);
			if(ch!='y' || ch!='Y') {
				return;
			}
			
		} while(ch == 'y' || ch=='Y');
		

	}
	static boolean isPalindrom(String str) {
		char ar[] = new char[str.length()];
		ar = str.toCharArray();
		int i=0;
		int j=ar.length-1;
		while(i<=j) {
			if(ar[i]==ar[j]) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
