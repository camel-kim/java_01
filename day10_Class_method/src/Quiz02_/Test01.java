package Quiz02_;

import java.util.Scanner;

public class Test01 {
	// int num1 = 100, int num2 = 200;
	public int sumFunc(int num1, int n2) {
		int sum = 0;

		sum = num1 + n2;
		return sum;
	}

	public int[] input() {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum = 0;

		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		System.out.print("수 입력 : ");
		num2 = input.nextInt();

		int[] arr = new int[2];
		arr[0] = num1;
		arr[1] = num2;

		return arr;
	}
	
	
}
