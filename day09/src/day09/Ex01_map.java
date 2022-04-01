package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex01_map {
	public static void main(String[] args) {
		/*
		map
		- 키와 값의 쌍으로 이루어진 데이터의 집합
		- 순서는 유지되지 않는다
		- 키의 중복은 허용하지 않으며, 값의 중복은 허용
		*/
		
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();
		//키의 순서를 유지하려고할 때, LinkedHashMap 사용.
		
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "1만원");
		// ( 키 , 값 )
		System.out.println("선풍기 : " + map.get("선풍기"));
		System.out.println("에어컨 : " + map.get("에어컨"));
		System.out.println("자동차 : " + map.get("자동차"));
		System.out.println("없는값 : " + map.get("없는값"));
		// 해당하는 키의 값을 가져오겠다. map.get(키);

		System.out.println("결과 : " + map.containsKey("선풍기"));
		// 해당 키 값이 있는지 확인.
		System.out.println("결과 : " + map.containsKey("없는값"));
		
		Object bool = map.remove("선풍기");
		System.out.println("해당값이 나오면 잘 삭제, null 해당 키 없음" + bool);
		if(bool == null) {
			System.out.println("삭제 실패");
		}else {
			System.out.println("삭제 성공");
		}
		System.out.println("키 목록 : " + map.keySet());
		System.out.println("값 목록 : " + map.values());
		
//		Set s = map.keySet();
//		Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj + " : " + map.get(obj));
			
		}
	}

}
