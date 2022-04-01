package day06;

public class Ex02_중첩for {
	public static void main(String[] args) {
		int su1, su2, sum = 0;
		for (su1 = 1; su1 <= 10; su1++) {
			for (su2 = 1; su2 <= 10; su2++) {
				sum += 1;
			}
			System.out.println("aaa");
		}
		System.out.println("sum : " + sum);

		for (su1 = 2; su1 <= 5; su1++) {
			System.out.println("상위 반복문");
			for (su2 = 1; su2 <= 5; su2++) {
				System.out.println("su1 : " + su1 + ",su2 : " + su2);
			}
			System.out.println("=========");
		}
	}
}