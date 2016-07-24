package recrusive;

import java.util.Scanner;

public class fibonaci {
	public static long fib(int n) {
		if (n <= 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter fibonaci = ");
		int n = sc.nextInt();
		long a = fib(n);
		System.out.println("fib " + n + " = " + a);
		sc.close();
	}

}
