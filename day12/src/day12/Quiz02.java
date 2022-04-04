package day12;

public class Quiz02 {
	private int kor, eng, math, sum;
	private double avg;

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		int sum = kor + eng + math;
		return sum;
	}

	public double getAvg() {
		double avg = (double)(kor + eng + math) / 3;
		return avg;
	}
}
