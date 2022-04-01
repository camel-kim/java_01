package day02;

public class Ex02 {
	public static void main(String[] args) {
//		상수화 final = 변형되면 안되는것들로 변경 안되게 만듬
//		상수화 시킬것들을 구분짓기 위해서 보편적으로 대문자로 작성.\
//		final double PI = 3.14;
//		final String KOREA = "대한민국";
//		System.out.println("KOREA : "+KOREA);

		String name = "김말이";
		int age = 20, iq = 120;
		double height = 173.3; // float로 쓸 경우 float height = 173.3f; or float height = (float)173.3;
		String grade = "B";

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("아이큐 : " + iq);
		System.out.println("등급 : " + grade);

	}

}
