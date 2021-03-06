package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03_set {
	public static void main(String[] args) {
		/*
		HashSet
		- 순서가 없으며, 중복은 허용하지 않는다.
		- 16개의 공간을 미리 확보, 랜덤하게 넣음, index로 접근할 수 없다.
		*/
		HashSet set = new HashSet();
		ArrayList arr = new ArrayList();

		set.add("라면");
		set.add("진미김밥 질려");
		set.add("순대");
		set.add("라면");

		arr.add("라면");
		arr.add("진미김밥 질려");
		arr.add("순대");
		arr.add("라면");

		System.out.println("set : " + set); //순서가 랜덤하며, 중복불가능
		System.out.println("arr : " + arr); //순서가 유지되며, 중복가능
		
		Iterator it = set.iterator();
//		System.out.print(it.hasNext()+" : "); //다음 값이 있는지 확인,
//		System.out.println(it.next()); //arr.get(0).... 와 같음	
//		System.out.print(it.hasNext()+" : ");
//		System.out.println(it.next());
//		System.out.print(it.hasNext()+" : ");
//		System.out.println(it.next());
//		System.out.print(it.hasNext()+" : ");
//		System.out.println(it.next());
//		System.out.print(it.hasNext()+" : ");
//		System.out.println(it.next());
		//bof 시작위치 eof 끝나는 지점.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
