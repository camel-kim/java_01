package day12;

public class QuizMain02 {
	public static void main(String[] args) {
		Quiz02 Q = new Quiz02();
		int k = 100, e = 90, m = 80;
		Q.setKor(k);
		Q.setEng(e);
		Q.setMath(m);
		System.out.println(Q.getKor());
		System.out.println(Q.getEng());
		System.out.println(Q.getMath());
		System.out.println(Q.getSum());
		System.out.println(Q.getAvg());

	}

}
