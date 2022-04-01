package day03;

import java.util.Scanner;

public class Ex03_quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력 : ");
		int num1 = input.nextInt();
		System.out.print("두번째 수를 입력 : ");
		int num2 = input.nextInt();
		System.out.print("세번째 수를 입력 : ");
		int num3 = input.nextInt();
		if (num1 > num2 && num2 > num3 ) {
			System.out.println(num1+", "+num2+", "+num3);
		}
		if (num3 > num2 && num2 > num1) {
			System.out.println(num3+", "+num2+", "+num1);
		}
		if (num3 > num2 && num2 < num1) {
			if (num3 < num1) {
				System.out.println(num1+num3+num2);
			}
			if (num3 > num1) {
				System.out.println(num3+num1+num2);
			}
		}
	}

}

