package day05;

import java.util.Scanner;

public class Ex01_switch_while {
	public static void main(String[] args) {
		/*	if문보다 처리 속도가 빠름,
			switch () :
		    case () :
		    	종속문장
				break;		//break; 탈출문
			default :	
				종속문장
		*/		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default:
			System.out.println("그 외");
		}
		//문자열로 사용 가능하나 쓰는 경우 거의 없음..
		System.out.println("문자열 입력");
		String s = sc.next();
		switch (s) {
		case "안녕" :
			System.out.println(s+"하세요");
			break;
		case "그래" :
			System.out.println(s+"반갑다");
		}
		/*	반복문.
			while(true) {
				종속 문장
			}
		*/
		while (true) {
			System.out.println("이름 입력");
			s = sc.next();
			System.out.println("당신 이름 : " + s + "군요");
		}
		
	}
	
}
