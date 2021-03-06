package day06;

import java.util.Scanner;

public class Ex01_Do_while__continue_break {
	public static void main(String[] args) {
		/*
			do ~ while 
			do{
			종속문장			//최초 1번은 어떠한 경우라도 실행
			while (조건식);
			}
		*/
		int su = 0, sum = 0;
		do {
			su++;
			sum += su;
		} while (su <= 9);
		System.out.println("sum : " + sum);
		/*
			continue, break
			반복문 안에서 사용한다.
			continue
			반복문의 위쪽으로 이동시켜준다
			break
			반복문을 빠져나간다.
		*/
		int i = 0;
		while (i < 5) {
			i++;
			if (i == 3) {
				System.out.println("실행");
				continue;   //continue; 차이 확인 
			}
			System.out.println("i : " + i);
		}
		Scanner sc = new Scanner(System.in);
		int num = 0;
//		while (true) {
//			System.out.println("수 입력");
//			num = sc.nextInt();
//			if (num == 4) {
//				System.out.println("다시 입력");
//				continue;
//			}
//			System.out.println("입력 값 : " + num);
//			if (num == 5) {
//				System.out.println("반복문 탈출");
//				break;   // 5입력 시 반복문을 빠져 나온다.
//			}
//		}
		while (true) {
			System.out.println("수 입력");
			num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				System.out.println("종료");
				break;
			}
			if(num == 2)
				break;
		}
		sc.close();
	}

}
