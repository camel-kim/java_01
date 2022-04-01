package Ex04_;

import java.util.Scanner;

public class Test04 {
	public void test(int num) {
		// test(int형으로 ) 받음
		String s;
		if( num % 2 == 0 ) {
			s = "짝수";
			//print(num, "짝수");
			//System.out.println("짝수");
		}else {
			s = "홀수";
			//print(num, "홀수");
			//System.out.println("홀수");
		}
		print(num, s);
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		test(num);
		// 같은 class 내에 있는 메서드는 바로 찾아 갈 수 있음..
		// test mothod num 값을 보냄.
	}
	public void print(int n, String s) {
		System.out.println(n + "=" + s);
	}

}
