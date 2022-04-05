package day13;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		try catch 문
		예외 처리
		*/
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		try {
			age = sc.nextInt();
			System.out.println("당신의 나이는 " + age);
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요~~");
			// 문제 발생 시 catch 실행
		}
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		System.out.println("다음 문장들 실행!!");
		
	}

}
