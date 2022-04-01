package day04;

import java.util.Scanner;

public class Ex01_if_else {

	public static void main(String[] args) {
		/*
		 * 참이면 if의 종속문장 실핼.
		 * 거짓이면 else 종속문장 실행
		 * 결과적으로 둘중 하나만 실행
		 * if(조건식){
		 * 		종속문장
		 * }
		 * else{
		 * 		종속문장
		 * }
		*/
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("아님");
		}
		System.out.println("다음 문장들 실행");
		/*
		 * if(조건식) 종속문장
		 * else if(조건식) 종속문장
		 * else if(조건식) 종속문장
		 * ...
		 * else 종속문장
		*/
		if (num > 100) {
			System.out.println("100보다 크다");
		} else if (num > 50) {
			System.out.println("50보다 크다");
		} else if (num > 30) {
			System.out.println("30보다 크다");
		} else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		input.close();
	}

}
