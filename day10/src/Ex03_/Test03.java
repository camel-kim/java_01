package Ex03_;

import java.util.Scanner;

public class Test03 {
	public int sumFunc(int num1, int n2) {
		//public 보낼자료형 xx(받는 자료형)
		int sum = 0;
		
		sum = num1 + n2;
		// 메서드를 만들 땐 강한결합 x 
		// 한가지의 기능만 사용하는 약한결합으로 만든다..?
		return sum;
		// 넘겨 받은 값을 실행 후 결과값을 돌려줌..?
		// 하나의 값만 돌려 줌 // 여러개의 값을 돌려주기 위해서 배열사용해야함
		// 반환 자료형을 일치 시켜야함
		// public int 
		
	}
	public int[] input() {
		Scanner sc = new Scanner(System.in);
		int sum = 0, num1 = 0, num2 = 0;
		
		System.out.println("수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("수 입력 : ");
		num2 = sc.nextInt();
		
		int[] arr = new int[2];
		arr[0] = num1; arr[1] = num2;
		
		return arr;
		// 자료형[] 배열 리턴의 경우 자료형[] 로 반환 
		// 이후 main에서 int[] x = x.input();
		
		
	}

}
