package day02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 변수 - 데이터를 저장하기 위한 공간 저장하기 위한 공간이기에 언제든지 값의 변경이 가능 저장공간(변수) 이름을 지울때 공백은 허용하지
		 * 않는다.
		 * 
		 * 자료형 (type) int : 정수를 표현 : 4byte char : 문자 표현 : 1byte float : 실수 표현 : 4byte
		 * 소수점 6자리 까지 저장 가능 double : 실수 표현 : 8byte 소수점 13자리? 까지 저장 가능
		 */
//		int age = 30;
//		double weight = 55.0;
//		double height = 163.0;
//		System.out.println("나의 나이는" + age);
//		System.out.println("나의 몸무게는" + weight);
//		System.out.println("나의 키는" + height);

		// 문자 하나는 '(작은 따옴표) 표현
		char ch = 'A'; // 아스키코드, 유니코드 65
//		int num = 5;
//		int ret; 
		int num = 5, ret;
		ret = ch + num;
		System.out.println("ret = " + ret);

		System.out.println("ch : " + ch);
		System.out.println("num : " + num);

		ch = 'B';
		num = 1;

		System.out.println("변경 후");

		System.out.println("ret = " + ret);

		System.out.println("ch : " + ch);
		System.out.println("num : " + num);

		System.out.println("ret = " + (char) ret);
		System.out.println("ch : " + (int) ch);
//		형 병환    (변환 할 type)type
//		- 자료형에 대하여 변환
//		- 형변환 -> type-casting
	}

}
