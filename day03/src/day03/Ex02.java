package day03;

public class Ex02 {
	public static void main(String[] args) {
		
		/* 단항 연산자
		 * 사칙연산자 
		 * +, -, *, /, %      // = 대입연산자   오른쪽값을 왼쪽에 대입
		 * / : 정수 / 정수 => 정수 
		 * 실수 결과를 원한다면 연산값들 중 하나라도 실수값 있어야함 
		 * %(mod) : 정수 % 정수 => 나머지 값
		 */
		int num1 = 10, num2 = 3;
		System.out.println(num1 / num2); // 정수 / 정수 나머지 값 제거
		System.out.println(num1 / (float) num2); // 정수 / 실수 = 실수표현  float의 경우 소수점 6자리까지 표현 
		System.out.println(num1 / 3.0);
		System.out.println(num1 % num2); // 나누기 후 나머지 값 표현
		
		/* 
		 * 복합연산자
		 * a = 10;
		 * a += 10; => a + 10
		 * a *= 10; => a * 10
		 */
		int su1 = 5, su2 = 5;
		su1 += 1; // su1 = su1(5) + 1
		System.out.println(su1);
		su1 -= 1;  // su1 = su1(6) - 1
		System.out.println(su1);
		su1 *= su2;  // su1 = su1(5) * su2(5)
		System.out.println(su1);
		su1 /= su2;  // su1 = su1(25) / su2(5)
		System.out.println(su1);
		su1 %= su2;  // su1 = su1(5) % su2(5)
		System.out.println(su1);
		
		/* 2항 연산자
		 * 관계연산자
		 * <, >, <=, >=, ==, !=
		 * 결과적으로 참(true) 또는 거짓(false) 표현
		 * 10 < 20 => true, 10 > 20 => false
		*/		
		double do01 = 3.0, do02 = 3.1;
		System.out.println(do01 >= do02);
		System.out.println(do01 <= do02);
		System.out.println(do01 == do02); // 두 값이 같은가
		System.out.println(do01 != do02); // 두 값이 다른가
		
		System.out.println();
		
		/*
		 * 논리연산자 
		 * 참(true) 또는 거짓(false)를 표현 
		 * 앞에 있는 값과 뒤에 있는 값을 연산 ( 값 || 값 => )
		 * ||(or) : 값들 중 하나라도 참이면 결과는 참(true)
		 * &&(and) : 하나라도 거짓이면 거짓(false)
		 * !반전 : !참 => 거짓으로 변경, !거짓 => 참으로 변경
		*/
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		// % : 범위 구할떄, 또는 짝, 홀, 배수 
		su1 = 10;
		// boolean : 참 또는 거짓만 저장 가능하다.
		boolean bool;
		int result = su1 % 2;
		
		System.out.println("result : " + result);
		bool = result == 0;
		//짝수를 찾겠다. 홀수를 찾기 bool = result == 1;
		System.out.println("true면 짝수 false면 홀수 : " + bool);
		
		System.out.println(su1 % 2 == 0);
		System.out.println((su1 % 2 == 0) && su1 > 5);
		
		su1 = 9;
		System.out.println((su1 % 2 == 0) || su1 > 5);
		
		/*
		 * 증감연산자
		 * 자기 자신을 1증가 또는 감소 시킨다 
		 * a = 10;
		 * a++, ++a, --a, a--    전위, 전치, 후위, 우치
		 * => a = a + 1, a = a - 1
		*/
		su1 = 10;
		su2 = ++su1; // 가장 먼저 연산
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
	
		su1 = 10;
		su2 = su1++;  // 모든 연산이 끝난 후 연산
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		/* 3항 연산자
		 * 조건연산자
		 * (명령어)? : 명령어;  앞에 있는 명령어가 참일경우 ?조건식 실행 거짓일경우 : 뒤쪽 명령어 실행 
		*/		
		su1 = 8;
		String s = (su1 % 2 == 0)?"짝수" : "홀수" ;
		System.out.println( s );
	}

}
