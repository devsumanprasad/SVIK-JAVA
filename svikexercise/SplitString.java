/*
 * How to spilt string in substrings using String.split() in Java?
 */
package svikexercise;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "www.github.com/devsumanprasad";
		String arrStr[] = str.split("\\.");
		for(String s : arrStr) {
			System.out.println(s);
		}

	}

}
