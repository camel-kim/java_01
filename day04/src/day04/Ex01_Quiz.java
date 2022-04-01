package day04;

import java.util.Scanner;

public class Ex01_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력 : ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.print("요리에 필요한 시간 입력 : ");
		int C = sc.nextInt();
		
		if((B + C) >= 60 ) {
			A = (A+(B+C)/60);
			B = ((B+C)%60);
			if(A >= 24) {
				A = (((B+C)/60)-1);
				System.out.println(A+":"+B);
			}else {
				System.out.println(A+":"+B);
			}
		}else System.out.println(A+":"+B);
		sc.close();
	}
}
