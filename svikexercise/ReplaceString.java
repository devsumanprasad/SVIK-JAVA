package svikexercise;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Gullu";
		String str2 = "Dev";
		System.out.println("Before replace");
		System.out.println("str1 = "+str1+" and str2 = "+str2);
		str1 = str1.replace(str1, str2);
		System.out.println("After String.replace() ");
		System.out.println("str1 = "+str1+" and str2 = "+str2);

	}

}
