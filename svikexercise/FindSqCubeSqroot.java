/*
 * Java program to find Square, Cube and Square Root of an integer number
 */
package svikexercise;
import java.util.*;
public class FindSqCubeSqroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sq = calcSq(num);
		int cube = calcCube(num);
		int sqRoot = calcSqRoot(num);
		System.out.println("Square is "+sq);
		System.out.println("Cube is "+cube);
		System.out.println("Square root is "+sqRoot);
		sc.close();

	}
	static int calcSq(int num) {
		return (int) Math.pow(num, 2);
	}
	static int calcCube(int num) {
		return (int) Math.pow(num, 3);
	}
	static int calcSqRoot(int num) {
		return (int) Math.sqrt(num);
	}

}
