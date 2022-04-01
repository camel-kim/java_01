package day03;

import java.util.Scanner;

public class Ex03_quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		if(age >= 19) {
			System.out.println("성인입니다");
		}
		if(age < 19) {
			System.out.println("현재 미성년자 입니다");
			if(age+10 >= 19) {
				System.out.println("10년뒤 사용자는 성인입니다");
			}
			if(age+10 < 19) {
				System.out.println("10년뒤 사용자는 아직 미성년자 입니다.");
			}
		}
	}

}
