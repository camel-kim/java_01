package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public ArrayList item(){
		ArrayList it = new ArrayList();
		it.add("100원");		it.add("200원");
		it.add("500원");		it.add("전설의 검");
		return it;
	}
	public int MyRandom(int pro){
		return (int)(Math.random()*pro);
	}
	public void display(){
		Scanner input = new Scanner(System.in);
		int probability=6;
		while(true){
			System.out.println("1.몬스터 잡기");
			System.out.println("2.종료 하기");
			System.out.print("입력 : ");
			int num = input.nextInt();
			if(num==1){
				ArrayList it = item();
				int ran = MyRandom(probability);
				System.out.println("몬스터를 잡았습니다");
				if(ran ==0 ||ran ==1 || ran ==2 || ran == 3){
					System.out.println(it.get(ran)+"획득 하였습니다");
				}else{
					System.out.println("몬스터가 회피 하였습니다 ㅋㅋㅋ!!");
				}
			}else{
				System.out.println("프로그램 종료 합니다");
				return ;
			}
		}
	}

}
