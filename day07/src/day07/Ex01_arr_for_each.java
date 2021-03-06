package day07;

import java.util.Scanner;

public class Ex01_arr_for_each {
	public static void main(String[] args) {
		/*	
			배열
			- 같은 자료형으로 여러개의 공간을 만드는 것
			형식
			자료형[] 변수명 = new 자료형[개수] 보편적으로 자료형[]을 많이 씀
			자료형 변수명[] = new 자료형[개수]
		*/	
		
		int[] arr = new int[5]; //객체 관련 new라는 연산자가 들어와야 함
		arr[2] = 100; 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		//length = 해당하는 배열의 크기 (공간)을 알려주는 기능
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 * i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("출력 : " + arr[i]);
		}
		double[] d = new double[] { 10.1, 20.2, 30.3 }; 
		// {} 사이에 값을 직접 입력하는경우 []의 공간 자동으로 만들어 줌
		for (int i = 0; i < 3; i++) {
			System.out.println("d : " + d[i]);
		}
		for (double d2 : d) {
		//d의 값을 순차적으로 d2에 입력해 줌 for each문
			System.out.println(d2);
		}
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + ".이름 입렵 : ");
			names[i] = sc.next();
		}
		System.out.println("------출력------");
		for (String s : names) {
			System.out.println(s);
		}
		sc.close();
	}

}
