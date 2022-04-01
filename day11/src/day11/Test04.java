package day11;

public class Test04 {
	public int cnt = 100;
	// 인스턴스 변수 = 공통적으로 사용하는 경우
	//객체를 만들때 생성됨.?
	public void test1() {
		System.out.println("test01 : " + cnt);
		cnt += 10000;
	}

	public void test2() {
		System.out.println("test02 : " + cnt);
	}

}
