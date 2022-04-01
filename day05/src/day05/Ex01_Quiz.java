package day05;

import java.util.Scanner;

public class Ex01_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		int b = a % 7;
		String A = null; // 첫 글자가 대 문자인경우 null 로 초기화
		String B = null;
		switch (b) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		case 0:
			System.out.println("일");
		}
		while (true) {
			System.out.println("1.집 등록\n2.회사 등록\n3.보기");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("우리집 등록 : ");
				A = sc.next();
				break;
			case 2:
				System.out.print("회사 등록 : ");
				B = sc.next();
				break;
			default:
				if (A == null) {
					System.out.println("집 등록하세요");
				} else {
					System.out.println("우리집 : " + A);
				}
				if (B == null) {
					System.out.println("회사를 등록하세요");
				} else {
					System.out.println("회사 : " + B);
				}
				break;

			}
		}
	}

}
