package day04;

import java.util.Scanner;

public class Ex01_Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 USB 개수를 입력해주세요.");
		int a = sc.nextInt();
		int usb = 5000;
		if (a <= 10) {
			System.out.println(a+"개의 usb 가격 : "+ a * usb);
		}else if(a < 100) {
			System.out.println(a+"개의 usb 가격 : "+ a * (usb*0.9));
		}else {
			System.out.printf(a+"개의 usb 가격 : "+ a * (usb*0.88));
		}
		sc.close();
		
	}

}
