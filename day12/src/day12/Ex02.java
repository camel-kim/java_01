package day12;

public class Ex02 {
	int a = 10;

	public void setA(int a) {
		// a = a;
		System.out.println(this);
		this.a = a;
		// this.사용시 상위 괄호에 내용을 저장 할 수 있음..?? 
		// 자기 자신의 정보를 저장
		// class a에 변수 저장
	}

	public void print() {
		System.out.println("a : " + a);
	}
}
