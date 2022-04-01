package day11;

public class Test03 {
	public int test1() {
		int var = 100;
		// 지역 변수
		System.out.println("test : " + var);
		return var;
		// 지역 변수를 반환
		// 반환 타입 일치시켜야 한다.
	}
	public void test2(int var) {
		// 넘겨주는 값, 받는 자료형 일치시켜야 한다.
		System.out.println("test2 : " + var);
	}
	public void test3() {
		for(int i = 0 ; i < 10000; i++) {
			System.out.println("test3 : " + i);
			if(i == 3) {
				//break;
				return;
				//break; 와 return;  
				//break; 의 경우 반복문을 빠져나옴. 메서드 안 다음 문장 실행.
				//return; 의 경우 메서드를 빠져나옴.
			}
		}
		System.out.println("for 다음문장");
	}
	public int test04() {
		int num = 3;
		if (num % 3 == 0) {
			return num;
		} else {
			return -1;
		}
		// else if (조건식) 으로 끝날 경우 return 0;값을 넣어주어야 함
	}

}
