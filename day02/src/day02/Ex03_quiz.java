package day02;

import java.util.Scanner;

public class Ex03_quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? : ");
		String name = input.next();
		System.out.print(name + "님의 국어 점수 : ");
		int a = input.nextInt();
		System.out.print(name + "님의 영어 점수 : ");
		int b = input.nextInt();
		System.out.print(name + "님의 수학 점수 : ");
		int c = input.nextInt();

		System.out.println("====================");
		System.out.println("이름 :\t" + name);
		System.out.println("====================");
		System.out.println("국어 :\t" + a);
		System.out.println("영어 :\t" + b);
		System.out.println("수학 :\t" + c);
		System.out.println("====================");
		System.out.println("합계 :\t" + ((int) a + b + c));
		System.out.println("====================");
		System.out.println("평균 :\t" + (((double) a + b + c) / 3));
		System.out.println("====================");
		input.close();
	}
}
