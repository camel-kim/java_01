package day11;

public class Ex02_method_overloding {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test();
		t.test(111);
		t.test('c');
		// 메서드 오버로딩
		// () 안의 자료형과 같은 형태의 메서드 출력
	}
}
