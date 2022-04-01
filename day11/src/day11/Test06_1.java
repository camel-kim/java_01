package day11;

public class Test06_1 {
	
	public void BBBB() {
		System.out.println(Test06.path2 + " 파일의 내용을 불러온다");
		//특정값만 필요 할 경우 static 으로 생성 = 클래스 이름으로 바로 접근가능하다.
		Test06 t = new Test06();
		// static 으로 사용 안했을 경우 객체 선먼.
		System.out.println(t.path);
	}

}
