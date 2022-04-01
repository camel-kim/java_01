package day09;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_HashMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		String key = null, value = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장 키 입력");
		key = sc.next();
		System.out.println("저장 값 입력");
		value = sc.next();
		
		map.put(key, value);
		System.out.println(map);
		
		
		sc.close();
	}

}
