package day10;

public class Member {
	private String name;
	public String addr;
	public int age;
	public void 회원정보출력() {
		System.out.println("회원정보 출력");
	}
	public void 저장하는기능() {
		System.out.println("저장하는 기능");
	}
	public void 수정하는기능() {
		System.out.println("수정하는 기능");
	}
	private void 관리자만접근() {
		System.out.println("관리자만접근");
	}
}
