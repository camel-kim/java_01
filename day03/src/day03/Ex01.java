package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.print("1값 입력 : ");
		str = input.next(); 
		System.out.println(str);
		System.out.print("2값 입력 : ");
		
		input.nextLine(); //첫번째 결과에서 남은값을 빼 주는 용도로 사용??
		
		str = input.nextLine();
		
		System.out.println("출력 결과 : " + str);
		System.out.println("다음 문장들 실행!!!");
		input.close();

	}

}