/*
 * Read string via various methods
 */

package svikexercise;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
public class ReadString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String emp = sc.next();
		String str = "Dev Suman Prasad";
		StringReader s = new StringReader(str);
		System.out.println("using stringReader");
		for(int i=0;i<str.length();i++) {
			char c = (char) s.read();
			System.out.print(c);
		}
		System.out.println();
		System.out.println("using Scanner");
		System.out.println(emp);
	
		
		

	}

}
