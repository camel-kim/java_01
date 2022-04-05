package day13;
/*
생성자
- 반환타입은 없으며 클래스 이름과 동일하게 만든다
- 초기화 목적으로 만들어 사용한다
- 객체 생성시 자동으로 호출된다.
*/
class AAA{
	public AAA() {
		System.out.println("생성자 실행");
	
	}
	public AAA(String s) {
		System.out.println(s + "생성자 실행");
		
	}
	public void test() {
		System.out.println("test");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		// 생성자를 안 쓰더라도  default 생성자를 만들어주어야 오류가 없다...
		AAA a = new AAA();  // 생성자 호출
		AAA aa = new AAA("초기화 진행 ");
		
	}

}
