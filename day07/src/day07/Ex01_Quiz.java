package day07;

import java.util.Scanner;

public class Ex01_Quiz {
	public static void main(String[] args) {
		int[] num = new int[] { 10, 54, 13, 17, 25, 30 };
		for (int num2 : num) {
			if (num2 % 2 == 0) {
				System.out.println("짝수 : " + num2);
			} else {
				System.out.println("홀수 : " + num2);
			}
		}
		System.out.println();
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("짝수, 홀수 입력 : ");
		String st = sc.next();
		for (int num2 : num) {
			if ("짝수".equals(st) && num2 % 2 == 0) {
				System.out.println("짝수 : " + num2);
			} else if ("홀수".equals(st) && num2 % 2 != 0) {
				System.out.println("홀수 : " + num2);
			}
		}
		System.out.println();
		System.out.println();

		int[] arr = new int[] { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 };
		// 2. invert_arr배열에 거꾸로 저장 후 출력
		int[] invert_arr = new int[arr.length];
		int size = arr.length;
		for (int num5 : arr) {
			invert_arr[--size] = num5;
		}
		for (int num5 : invert_arr) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		int[] resultArr = new int[arr.length / 2];
		int odd = 1;
		int even = 0;
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = arr[even] - arr[odd];
			even += 2;
			odd += 2;
		}
		System.out.println("짝수번째 - 홀수번째");
		for (int re : resultArr) {
			System.out.print(re + ", ");
		}
		System.out.println();
		System.out.println();

		int oddSum = 0, evenSum = 0;
		odd = 1;
		even = 0;
		for (int i = 0; i < resultArr.length; i++) {
			evenSum += arr[even];
			oddSum += arr[odd];
			even += 2;
			odd += 2;
		}
		System.out.println("짝수 합 - 홀수 합 = " + (evenSum - oddSum));
		
		sc.close();
	}

}
