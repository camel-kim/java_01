package Quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int best = 0;
		Test01 t = new Test01();
		for (;;) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임전적");
			System.out.println("3. 게임종료");
			System.out.print(">>> ");
			int input = t.input();
			if (input == 1) {
				int num = t.random();
				int cnt = 0;
				for (;;) {
					System.out.print("Input Number --> ");
					int num1 = t.input();
					cnt++;
					if (num != num1) {
						if (num > num1) {
							System.out.println("=== U  P ===");
						} else {
							System.out.println("=== Down ===");
						}
					} else {
						break;
					}
				}
				System.out.println(cnt + "회 만에 맞췄습니다!!");
				t.best1(cnt);
			} else if (input == 2) {
				t.best2();
			} else if (input == 3) {
				System.out.println("게임 종료");
				break;
			} else {
				System.out.println("정확한 값 입력 1-3");
			}
		}
	}

}
