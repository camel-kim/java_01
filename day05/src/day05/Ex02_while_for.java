package day05;

import java.util.Scanner;

public class Ex02_while_for {
	public static void main(String[] args) {
		/*
		반복문 사용 조건
		- 규칙적으로 값이 변한다면
		- 동일한 내용을 반복할 때
		*/
		int num = 1, sum = 0;
		while (num <= 10) {
//			System.out.println(num);
			sum = sum + num;
			num++;
		}

		System.out.println("sum : " + sum);
		
		num = 1;
		sum = 0;
//		for(초기갑; 조건식; 증감식)  ; 이 2개가 무조건 들어와야 한다.
		for (; num <= 10;) {
//			System.out.println(num);
			sum = sum + num;
			num++;
		}

		System.out.println("sum : " + sum);
		
		Scanner sc = new Scanner(System.in);
		int repet;
		System.out.println("수 입력 : ");
		repet = sc.nextInt();
		
		for (int i = 0; i < repet; i++) {
			System.out.println(i + 1 + "번 반복");
		}
		System.out.println("입력 값 까지의 짝수");
		for (int i = 2; i <= repet; i += 2) {
			System.out.println(i);
		}
		for (int i = 2; i <= repet; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		
		
		int i = 2;
		while (i <= repet) {
			System.out.println(i);
			i += 2;
		}
		i = 1;
		while (i <= repet) {
			if (i % 2 == 0) {
				System.out.println(i);
			i += 2;
			}
		}
		sc.close();
	}

}
