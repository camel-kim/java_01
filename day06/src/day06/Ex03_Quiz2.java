package day06;

import java.util.Scanner;

public class Ex03_Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money=0, num=0;
		System.out.println("요금을 투입하세요");
		money = sc.nextInt();
		while (true) {
			System.out.println("========= 커피 자판기 =========");
			System.out.println("1.커피(200)\t2.코코아(250)\t3.반환\t4.종료");
			System.out.println("메뉴를 선택하세요");
			num = sc.nextInt();
			if(num == 4) {
				System.out.println("종료");
				break;
			}else if (num == 3) {
				System.out.println("거스름돈 : "+money);
				money=0;
			}else if(num == 1 || num == 2){
				if(money<200) {
					System.out.println("요금이 부족합니다");
				}else if(num ==1) {
					money-=200;
					System.out.println("맛있게 드세요");
				}else {
					money-=250;
					System.out.println("맛있게 드세요");
				}
			}else {
				System.out.println("정확한 값을 입력해주세요(1-4)");
			}
		}
		sc.close();
	}

}
