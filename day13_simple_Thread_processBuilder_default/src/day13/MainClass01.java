package day13;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		// int형태와 비슷하다.
		// 현재시간에 대한 데이터 값 가져옴
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 이다");
		// 형식을 변경..?
		
		
		String s = simple.format(time);
		System.out.println(s);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(simple.format(date));
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);
				// sleep 1000 = 1 초   500 = 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Thread.slepp 사용 시 try catch로 묶어줘야함. 
			// 예외 처리
		}
		String ss = "calc";
		ProcessBuilder pb = new ProcessBuilder(ss); 
		// calc 계산기  mspaint 그림판 등..
		// 파일을 실행 시켜준다. 
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
