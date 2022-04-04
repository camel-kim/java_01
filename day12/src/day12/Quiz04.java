package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz04 {
	private ArrayList notepad = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
	public void setNotepad(String note) {
		this.notepad.add(note);
	}
	public ArrayList getNotepad() {
		return notepad;
	}
	
	
	public void carculator() {
		int num1, num2;
		String s;
		System.out.println("==== 사칙연산 계산기 ====");
		System.out.println("입력 : ");
		num1 = sc.nextInt();
		s = sc.next();
		num2 = sc.nextInt();
		if(s.equals("+") == true) {
			System.out.println(num1 + num2);
		}else if(s.equals("-") == true) {
			System.out.println(num1 - num2);
		}else if(s.equals("*") == true) {
			System.out.println(num1 * num2);
		}else if(s.equals("/") == true) {
			System.out.println(num1 / num2);
		}else {
			System.out.println("입력 오류");
		}
	}

}
