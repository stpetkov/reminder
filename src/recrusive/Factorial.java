package recrusive;

import java.util.Scanner;

public class Factorial {
	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter N! = ");
		int n = sc.nextInt();
		long a = factorial(n);
		System.out.println(n + "! =" + a);
		sc.close();
	}

}
