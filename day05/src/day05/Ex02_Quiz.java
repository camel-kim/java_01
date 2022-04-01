package day05;

public class Ex02_Quiz {
	public static void main(String[] args) {

		System.out.println("문제 1번");
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + ".hello");
		}
		System.out.println();
		System.out.println("문제 2번");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum == 528) {
				System.out.println(sum);
				System.out.println("sum = 528일때 i의 값 : " + i);
			}
		}
		System.out.println();
		System.out.println("문제 3번");
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("문제 4번");
		int num = 1;
		for (int i = 1; i <= 30; i++) {
			num *= 2;
			if (i == 30) {
				System.out.println("30일째 예금해야 하는 입금액 : " + num / 2 + "원");
			}
		}
		System.out.println();
		System.out.println("문제 5번");
		int num1 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % (3 * 5) == 0) {
				num1 += i;
			} else if (i % 3 == 0) {

			} else {
				num1 += i;
			}
			if (i == 1000) {
				System.out.println(num1);
			}
		}
		System.out.println();
		System.out.println("문제 6번");
		sum = 0;
		for (int i = 1; sum < 10000; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		System.out.println();
		System.out.println("문제 7번");
		int rice = 100 * 1000;
		int mouse = 2;
		int day = 1;
		for (day = 1; rice < 0; day++) {
			rice -= mouse * 20;
			if (day % 10 == 0) {
				mouse *= 2;
			}
		}
		day--;
		System.out.println(day + "일" + mouse + "마리");
		
	}

}
