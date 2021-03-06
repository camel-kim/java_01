package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02_Quiz {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String menu = null, price = null;
		while (true) {
			System.out.println();
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("메뉴를 입력하세요");
				menu = sc.next();
				if (map.containsKey(menu)) {
					System.out.println("이미 등록된 메뉴 입니다.");
				} else {
					System.out.println("가격을 입력하세요");
					price = sc.next();
					map.put(menu, price);
					System.out.println("등록 되었습니다.");
				}
			} else if (num == 2) {
				Iterator<String> it = map.keySet().iterator();
				if (it.hasNext()) {
					while (it.hasNext()) {
						Object obj = it.next();
						System.out.println(obj + " : " + map.get(obj));
					}
					System.out.print("1.수정  2.삭제  3.나가기\n>>> ");
					num = sc.nextInt();
					if (num == 1) {
						System.out.println("수정할 메뉴를 입력해주세요");
						menu = sc.next();
						if(map.containsKey(menu)) {
							System.out.println("변경할 가격을 입력해주세요");
							price = sc.next();
							System.out.println("변경 되었습니다.");
							map.replace(menu, price);
						}else {
							System.out.println("메뉴가 없습니다.");
						}
					}else if (num == 2) {
						System.out.println("삭제할 메뉴를 입력해주세요.");
						menu = sc.next();
						if(map.containsKey(menu)) {
							map.remove(menu);
							System.out.println("삭제 되었습니다.");
						}else {
							System.out.println("메뉴가 없습니다.");
						}
					}else if (num == 3) {
						
					}else {
						System.out.println("정확한 값을 입력해주세요 (1-3)");
					}
				} else {
					System.out.println("등록된 메뉴가 없습니다.");
				}
			} else if (num == 3) {
				System.out.println("프로그램을 종료 합니다.");
				break;
			} else {
				System.out.println("정확한 값을 입력하세요 (1-3)");
			}
		}
		sc.close();
	}
}