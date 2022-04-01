package day03;

import java.util.Scanner;

public class Ex03_if {
	public static void main(String[] args) {
		/*
		 * 제어문
		 * 프로그램의 흐름을 변경할 수 있다.
		 * if, switch, for, while, do while, break, continue 이런것들이 있다.	
		 * 
		 * if문의 형식
		 * if(조건식){ 해당 조건식이 참이면 중괄호 내용이 실행 거짓이면 건너뜀.
		 * 		(종속문장) 
		 * }
		 * if문 종료후 다음 문장들 실행
		*/
		Scanner input = new Scanner(System.in);
		int num;
//		System.out.println("1.쉬운게임");
//		System.out.println("2.어려운게임");
//		System.out.println("3.종료");
//		System.out.print(">>> : ");
//		num = input.nextInt();
//		if(num == 1) {
//			System.out.println("쉬운게임 시작");
//		}
//		if(num == 2) {
//			System.out.println("어려운게임 시작");
//		}
//		if(num == 3) {
//			System.out.println("게임 종료");
//		}
//		System.out.println("다음 문장들 실행!!!");
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if (num > 10)
			System.out.println("num 10보다 크다");
		System.out.println("다음문장실행!!");

		System.out.print("수 입력 : ");
		num = input.nextInt();
		if (num % 2 == 0) { // 2로 나눴을때 0과 같다면 짝수 == 맞다
			System.out.println("입력 값 짝수 : " + num);
		}
		if (num % 2 != 0) { // 2로 나눴을때 0과 같다면 짝수 != 아니다
			System.out.println("입력 값 홀수 : " + num);
		}
		System.out.println("다음 문장들 실행!!!!");
		
		input.close();
	}
}
