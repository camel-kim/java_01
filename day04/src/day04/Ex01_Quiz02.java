package day04;

import java.util.Scanner;

public class Ex01_Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 할 커피의 양");
		int num1 = sc.nextInt();
		int coffee = 2000;
		if (num1 > 10) {
			System.out.println((coffee*10)+((coffee-500)*(num1-10)));
		}else {
			System.out.println(coffee*num1);
		}
		sc.close();
	}
}
