package day12;

public class Ex03 {
	private int age;
	private int name;
	// private 정보 은닉 (캡슐화)
	public void printA() {
		System.out.println(age);
	}

	public void setAge() {
		// 기본적으로 set / get 변수명으로 저장함 
	}
	public void setName() {
		
	}
	public void getAge() {
		
	}
	public void getName() {
		
	}
	
	public void setting(int a) {
		age = a;
		// age 값을 private 로 만들었기 때문에 접근 불가능
		// 이런 경우 내부에 메서드를 이용해서 접근하는 방식
		// 해당하는 값을 전달하는 방식
		// setter 
	}
	public int getter() {
		return age;
		// age 라는 변수를 return 을 이용해서 받는 방식
		// 해당 하는 값을 얻어오는 방식
		// getter 
	}
}
