package day06;

import java.util.Scanner;

public class Ex03_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String id=null, saveid = null, pass=null, savepass = null;
		while(num != 3) {
			System.out.println("1.로그인\n2.회원가입\n3.나가기");
			num = sc.nextInt();
			switch (num) { 
			case 1 :
				System.out.print("아이디 입력 : ");
				id = sc.next();
				System.out.print("비밀번호 입력 : ");
				pass = sc.next();
				if(id.equals(saveid) && pass.equals(savepass)) {
					System.out.println("로그인 성공!!\n");
				}else
					System.out.println("인증 실패\n");
				break;
			case 2 :
				System.out.print("아이디 입력 : ");
				saveid = sc.next();
				System.out.print("비밀번호 입력 : ");
				savepass = sc.next();
				System.out.print("가입 완료!!\n");
				break;
			case 3 :
				System.out.println("종료");
				break;
			default :
				System.out.println("정확한 값을 입력하세요(1 - 3)");
				
			}
		}
		sc.close();
	}

}
