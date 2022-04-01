package day03;

import java.util.Scanner;

public class Ex02_quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int a = input.nextInt();
		String s = (a % 2 == 0) ? + a + "= 짝수 " : a + " = 홀수";
		System.out.println(s);
		String s1 = (a % 3 == 0) ? + a + " = 3의 배수다 " : a + " = 3의 배수가 아니다";
		System.out.println(s1);
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);
		String s2 = (num1 > num2) ? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(s2);

	}

}
