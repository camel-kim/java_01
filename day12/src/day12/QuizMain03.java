package day12;

import java.util.Scanner;

public class QuizMain03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, result=0;
		Quiz03 login = new Quiz03();
		String inputId=null, inputPwd=null, 
								saveId=null, savePwd=null;
		/*
		if(inputId != null) {
			inputId.charAt(0);
		}
		*/
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.가입");
			System.out.println("3.종료");
			num = input.nextInt();
			switch(num) {
			case 1:
				//login.userChk();//1번째 방법
				
				//2번째방법
				System.out.println("아이디입력");
				inputId = input.next();
				System.out.println("비밀번호입력");
				inputPwd = input.next();
				result=login.userChk(inputId, inputPwd);
				if(result == 0) {
					System.out.println("인증통과");
				}else {
					System.out.println("인증실패");
				}
				break;
			case 2:
				login.register();
				break;
			case 3:break;
			}
		}
	}
}
