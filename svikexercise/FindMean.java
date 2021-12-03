/*
Java program to find mean of a given number
 */

package svikexercise;
import java.util.Arrays;
import java.util.Scanner;
public class FindMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		long ans = calcMean(arr);
		System.out.println("Mean of "+Arrays.toString(arr)+" is "+ans);

	}
	static long calcMean(int arr[]) {
		long mean = 0;
		for(int i=0;i<arr.length;i++) {
			mean+=arr[i];
		}
		return mean/=arr.length;
	}

}
