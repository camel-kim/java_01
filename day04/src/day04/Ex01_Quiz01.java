package day04;

import java.util.Scanner;

public class Ex01_Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int A = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int B = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int C = sc.nextInt();
		int max, min;

		if (A > B && A > C) {
			if (B > C) {
				max = A;
				min = C;
			} else {
				max = A;
				min = B;
			}
		} else if (B > A && B > C) {
			if (A > C) {
				max = B;
				min = C;
			} else {
				max = B;
				min = A;
			}
		} else {
			if (B > A) {
				max = C;
				min = A;
			} else {
				max = C;
				min = B;
			}
		}
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		System.out.println("평균 : " + ((A + B + C) / 3.0));
		sc.close();
	}

}
