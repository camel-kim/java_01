package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Scanner 사용시 Scanner input(이름) = new Scanner(System.in); 
//	    import java.util.Scanner; 
		String name;
		System.out.println("이름 뭐에요??");
		name = input.next(); // 입력 받을 때
		System.out.println("당신의 이름은 " + name + "이군요");

		int age;
		System.out.print("나이 입력 : "); // print 사용 enter 값 없음
		age = input.nextInt(); // 정수를 입력 받음
		System.out.println("나이 : " + age + "살");

//		int k = 0, e = 0;
//		char c = 0;
//		double d = 0;
//		float f = 0;
		
//		초기화 방법.
//		첫번째 글자가 소문자로 되어있는 표현식은 0 이라는 값으로 초기화 한다.
		String n = null;
//		첫번째 글자가 대문자로 되어있는 표현식은 null 이라는 값으로 초기화 한다.

		System.out.println(n);
		input.close();
	}
}
