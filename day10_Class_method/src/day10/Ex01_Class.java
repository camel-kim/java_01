package day10;
// 하나의 기능별로 사용할 수 있게 만든 객체를 이용 객체지향언어
//- 가벼움 / 처리속도가 느리다. 각자 위치를 찾아줘야 한다.
// 하나의 틀안에 작동을 위한것들을 넣어 놓은 절차지향언어 
//- 무거움 / 처리속도가 빠르다
		/*
		class
		- 하나의 자료형이다
		- 반복적으로 사용하기 위한 툴
		- class 형으로 변수를 만들면 보통 객체라고 표현한다
		
		접근제한자  // 키워드 
		- public : 내부, 외부의 접근 가능     // 외부에서 접근 가능
		- private : 내부에서만 접근 가능      // 내부에서만 접근 가능
		- protected : 상속받은 자식에서 보통 사용
		- default(기본값:없음) : 같은 패키지 안에서만 접근 (같은 폴더)
 		*/
public class Ex01_Class {
	public static void main(String[] args) {
		Member m = new Member();
		// 만들어져있는 틀,(Class 파일) 가져옴.
		// 파일명 변수명 = new 파일명();
		m.age = 123;
		m.name = "aaaa";
		System.out.println(m.age);
		System.out.println(m.name);
		// class 파일에 변수와 기능이 있을때 객체라고 부름.
	}

}
