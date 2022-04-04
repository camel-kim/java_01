package day12;

import java.util.ArrayList;
import java.util.Scanner;

// gettet / setter 도 넣어보고 메서드도 통으로 넣어보고!
public class QuizMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList notepad = new ArrayList();
		Quiz04 q = new Quiz04();
		
		for(;;) {
			System.out.println("1.시작 메뉴");
			System.out.println("2.종료");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("1.계산기");
				System.out.println("2.메모장");
				num = sc.nextInt();
				if(num == 1) {
					q.carculator();
					
//					for(;;) {
//						int num1, num2;
//						String s;
//						System.out.println("==== 사칙연산 계산기 ====");
//						System.out.println("입력 : ");
//						num1 = sc.nextInt();
//						s = sc.next();
//						num2 = sc.nextInt();
//						if(s.equals("+") == true) {
//							System.out.println(num1 + num2);
//						}else if(s.equals("-") == true) {
//							System.out.println(num1 - num2);
//						}else if(s.equals("*") == true) {
//							System.out.println(num1 * num2);
//						}else if(s.equals("/") == true) {
//							System.out.println(num1 / num2);
//						}else {
//							System.out.println("입력 오류");
//						}
//						break;
//					}
				}else {
					for(;;) {
						System.out.println("=== 메모장 ===");
						System.out.println("1.메모 입력");
						System.out.println("2.불러오기");
						System.out.println("3.나가기");
						num = sc.nextInt();
						if(num == 1) {
							System.out.print("입력 : ");
							String text = sc.next();
							q.setNotepad(text);
//							notepad.add(text);
						}else if(num == 2) {
							System.out.println(q.getNotepad());
//							System.out.println(notepad);
						}else if(num == 3) {
							System.out.println("종료");
							break;
						}else {
							System.out.println("정확한 값 입력 1 - 3");
						}
					}
				}
			}else if (num == 2) {
				break;
			}else {
				System.out.println("정확한 값 입력 1 - 2");
			}
		}
		System.out.println("시스템 종료");
	}

}
