package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		ArrayList number = new ArrayList();
		String name1 = null, number1 = null, input = null;
		
		for (;;) {
			System.out.println();
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.연락처 수정");
			System.out.println("6.종료");
			int num = sc.nextInt();
			if (num == 6) {
				System.out.println("시스템 종료");
				break;
			} else if (num == 1) {
				System.out.println("이름을 입력하세요 : ");
				name1 = sc.next();
				name.add(name1);
				System.out.println("전화번호를 입력하세요 : ");
				number1 = sc.next();
				number.add(number1);
			} else if (num == 2) {
				if (name.size() == 0 && number.size() == 0) {
					System.out.println("목록에 없습니다.");
				} else {
					System.out.println("이름을 입력하세요.");
					name1 = sc.next();
					if (name.indexOf(name1) >= 0) {
						int i = name.indexOf(name1);
						System.out.print(name.get(i) + " : ");
						System.out.println(number.get(i));
					} else {
						System.out.println("목록에 없습니다.");
					}
				}
			} else if (num == 3) {
				System.out.println("삭제할 이름 입력 : ");
				name1 = sc.next();
				num = name.indexOf(name1);
				if (name.remove(name1) == true) {
					number.remove(num);
					System.out.println("삭제 완료");
				} else {
					System.out.println("목록에 없습니다.");
				}
			} else if (num == 4) {
				for (int i = 0; i < name.size(); i++) {
					System.out.print(name.get(i) + " : ");
					System.out.println(number.get(i));
				}
			} else if(num == 5){
				System.out.println("이름 또는 전화번호를 입력하세요.");
				input = sc.next();
				if(name.contains(input)) {
					int i = name.indexOf(input);
					System.out.print(name.get(i) + " : ");
					System.out.println(number.get(i));
					System.out.print("변경할 이름을 입력하세요 : ");
					name1 = sc.next();
					name.set(i, name1);
					
				}else if(number.contains(input)) {
					int i = number.indexOf(input);
					System.out.print(name.get(i) + " : ");
					System.out.println(number.get(i));
					System.out.print("변경할 전화번호를 입력하세요 : ");
					number1 = sc.next();
					number.set(i,number1);
				}else {
					System.out.println("목록에 없습니다.");
				}
			} else {
				System.out.println("정확한 값을 입력하세요.");
			}
		}
		sc.close();
	}

}
