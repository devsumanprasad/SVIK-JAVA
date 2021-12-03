/*
 * 
 */

package svikexercise;

public class StartwithEndwithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "https://www.includehelp.com/java-programs/java-program-to-"
				+ "demonstrate-string-startsWith-and-endsWith-method.aspx";
		
		if(str.startsWith("https") && str.endsWith(".aspx")) {
			System.out.println("valid ssl url");
		}
		else {
			System.out.println("this url is risky");
		}

	}

}
