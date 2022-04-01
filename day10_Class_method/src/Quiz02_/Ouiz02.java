package Quiz02_;

import java.util.Scanner;

public class Ouiz02 {
	public static void main(String[] args) {
		/*
		int num = 10;
		if(true) {
			num += 100;
		}
		System.out.println(num);
		
		if(true) {
			int num = 10;
			num += 100;
		}
		System.out.println(num);
		*/
		
		
		Test01 t01 = new Test01();
		
		//t03.input();
		Scanner input = new Scanner(System.in);
		int num1, num2 = 0;
		
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		System.out.print("수 입력 : ");
		num2 = input.nextInt();
		
		int a = t01.sumFunc(num1, num2);
		
		System.out.println("두 수 합 : "+ a );
		int[] b = t01.input();
		System.out.println("배열 0 : "+b[0]);
		System.out.println("배열 1 : "+b[1]);
		
		input.close();
		
		
	}
	}
