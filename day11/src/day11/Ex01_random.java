package day11;

public class Ex01_random {
	public static void main(String[] args) {
		/*
		- 변수
		- 클래스 변수 : 클래스 영역에서 만드는 변수
		- 인스턴스(객체) 변수 : 인스턴스(객체)가 생성될 떄 만들어 지는 변수
		- 지역 변수 : 특정 지역에서 생성되는 변수
		*/
		int num = 123;
		if(true) {
			System.out.println(num);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random()*3));
			//Math.random(); 0.0x~0.9x사이의 랜덤 값.
			//*3 int 0~2 의 정수 출력
		}
	}

}
