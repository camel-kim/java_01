package Quiz02_;

import java.util.Scanner;

public class Test01 {
	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		int[] arr = new int[2];
		
		arr[0] = num1; arr[1] = num2;
		
		result1(arr);
	}
	public void result1(int[] arr) {
			if(arr[0] > arr[1]) {
			System.out.println(arr[0]);
		}else {
			System.out.println(arr[1]);
		}
	}
	
	
	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num1 = sc.nextInt();
		
		result2(num1);
	}
	public void result2(int n) {
		if(n % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
	public void input3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num1 = sc.nextInt();
		
		result3(num1);
	}
	public void result3(int n) {
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public void input4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num1 = sc.nextInt();
		
		result4(num1);
	}
	public void result4(int n) {
		for(int i = 2; i <= n; i++) {
			if() {
				System.out.println(i);
			}
			
		}
	}
}