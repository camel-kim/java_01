package day06;

import java.util.Scanner;

public class Ex03_문자열_기능 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫번째 문자열 입력 ");
		n1 = sc.next();
		System.out.println("2번째 문자열 입력 ");
		n2 = sc.next();
		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		// a. 문자열 목록 확인
		System.out.println(n1 == n2); // 문자열 비교의 경우 equals를 사용해야함.
		System.out.println(n1.equals(n2));

		sc.close();
	}

}
