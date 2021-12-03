/*
 * String trim- str.trim(); removes all leading white spaces
 * i/p: "     The sky is blue"
 * o/p:"The sky is blue"
 */

package svikexercise;
import java.util.Scanner;
public class TrimString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Before String trim");
		System.out.println(str);
		System.out.println("After String trim");
		System.out.println(str.trim());

	}

}
