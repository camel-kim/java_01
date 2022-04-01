package day06;

public class Ex02_중첩반복문_Quiz {
	public static void main(String[] args) {
		//반복문만 이용하여 문제 풀이
		
		int a, b = 0;
		for (a = 1; a <= 9; a++) {
			for (b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + a * b);
			}
		}
		
		System.out.println();
		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= 5; b++) {
				System.out.print(a * b + "\t");
				for(;b % 5 == 0;) {
					System.out.println();
					break;
				}
			}
		}
		
		System.out.println();
		for(a = 1; a <= 25; a++) {
			System.out.print(a+"\t");
			for(;a % 5 == 0;) {
				System.out.println();
				break;
			}
		}
	}
}
