package day09;

public class Ex03_String {
	public static void main(String[] args) {
		String str;
		str = "test";
		System.out.println(str);

		String str2 = new String();
		str2 = "test222";
		System.out.println(str2);
		//str. String 의 기능들 확인 필요..
		
		str2 = "java is Easy. 그리고 programming 할만하다";
		System.out.println("기본 : " + str2);

		str2 = str2.toUpperCase(); 
		
		//System.out.println(str2.toUpperCase()); // 대문자
		System.out.println("확인 : " + str2);

		System.out.println(str2.toLowerCase()); // 소문자
		//변경된 결과 값을 보여 줄 뿐, 결과값이 바뀌는게 아님.
		
		str = "abcde";
		     //01234
		System.out.println(str.length());  //문자열의 길이 
		System.out.println(str.charAt(0)); //인덱스 0번의 값
		System.out.println(str.charAt(0) - 32); //a라는 아스키코드 값 - 32
		System.out.println((char)(str.charAt(0) - 32));  //a아스키코드 값 - 32 => 65를 char로 변환시 A 
		System.out.println(str.charAt(1) == 'b'); //문자를 비교 할 경우 ' 따옴표를 써야함.
		System.out.println(str.charAt(1) == 'c'); 
	}

}
