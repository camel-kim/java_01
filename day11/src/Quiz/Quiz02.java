package Quiz;

public class Quiz02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		while(true) {
			System.out.println("===로또 번호 생성기===");
			System.out.println("1. 번호 생성");
			System.out.println("2. 종료");
			int num = t.num();
			switch(num) {
			case 1 :
				
			case 2 :
				break;
			default : 
				System.out.println("정확한 값을 입력하세요 1 - 2");
			}
			System.out.println("종료 합니다");
			break;
		}
		
	}

}
