package day10;
/*
method
- 하나의 독립적인 기능
function(함수) vs method(메서드)
- 보통 함수라고 표현하는 곳은 객체를 사용하지 않는 경우
- 메서드라고 표현하는 곳은 클래스 내부 함수로 존재할 때

- method 형식
접근제한자 반환자료형 메서드이름(매개변수(아규먼트)){
	내용
	return 사용 또는 사용안함
}
*/
public class Ex02_method {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Test02 t02 = new Test02();
		//Class 파일 불러와서 t02라는 변수 지정.
		t02.test();
		//public void test 값 가져옴.
		System.out.println("main 끝");
	}

}
