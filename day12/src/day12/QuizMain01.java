package day12;

import java.util.Scanner;

public class QuizMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz01 Q = new Quiz01();
		String name;
		int age;
		System.out.print("이름 입력 : ");
		name = sc.next();
		Q.setName(name);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		Q.setAge(age);
		System.out.println(Q.getName() + "님의 나이는 만" + Q.getAge() + "살 입니다.");

		sc.close();
	}

}
