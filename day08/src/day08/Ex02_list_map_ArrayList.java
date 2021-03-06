package day08;

import java.util.ArrayList;

public class Ex02_list_map_ArrayList {
	public static void main(String[] args) {
		/*
		컬렉션
		-자료구조
		프레임워크
		-뼈대, 틀 형식에 맞춰져 있다.
		*/
		/*
		ArrayList  
		- 순서가 유지 되는 자료형
		- 배열과 비슷하게 사용된다
		- 가변적인 크기를 가지고 있다
		*/
		ArrayList arr = new ArrayList();
		//import
		//class 들은 기능을 가지고 있다.
		int a;
		arr.add("aaa"); // add 로 값을 추가 할 수 있다 
		arr.add("111"); // 순차적으로 저장.
		arr.add("222");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		// 자바에서는 메서드 , 함수기능 
		
		System.out.println(arr.size());
		//ArrayList의 경우 .length 대신 .size()가 사용된다.
		System.out.println(arr.contains("aaa"));
		System.out.println(arr.contains("aaa11"));
		//(내용) 값이 존재 하는지 확인하는 명령어
		System.out.println("remove : " + arr.remove("aaa"));
		//(내용) 값을 삭제하는 명령어 삭제성공 할 경우 true 값이 없을 경우 false
		//boolean bool = arr.remove("aaa");
		//if(bool == true) 삭제 성공 
		System.out.println(arr.contains("aaa"));
		System.out.println("=====삭제후 확인 =====");
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		arr.clear();
		//저장된 데이터 삭제.
		System.out.println(arr.size());
		
		arr.add("aaa");
		arr.add("111");
		arr.add("222");
		
		System.out.println(arr.indexOf("aaa"));
		System.out.println(arr.indexOf("aaa1"));
		//indexOf (내용) 해당하는 값이 있다면 값에 대한 위치를, 없다면 -1을 가져옴
		arr.set(0, "안녕하세요");
		//값을 변경하는 명령어.
		System.out.println(arr.get(0));
	}

}
