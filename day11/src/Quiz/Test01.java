package Quiz;

import java.util.Scanner;

public class Test01 {
	Scanner sc = new Scanner(System.in);
	public static int best = 0;

	public int random() {
		int num = (int) (Math.random() * 100);
		return num;
	}
	public int input() {
		int input = sc.nextInt();
		return input;
	}
	public void best1(int cnt) {
		if (best == 0 || best > cnt) {
			best = cnt;
			System.out.println("최고기록 달성!");
		}
	}
	public void best2() {
		if (best == 0) {
			System.out.println("기록이 없습니다");
		} else {
			System.out.println("최고기록 : " + best + "회");
		}
	}
		
}
