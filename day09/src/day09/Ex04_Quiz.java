package day09;

import java.util.ArrayList;

public class Ex04_Quiz {
	public static void main(String [] args){
//		String str = new String("Have a nice day Have a nice day Have a nice day");
//		int i=0;
//		ArrayList arr = new ArrayList();
//		while(i < str.length()) {
//			if(str.charAt(i) == 'a')
//				arr.add(i);
//			i++;
//		}
//		System.out.println(arr);
//		
		
		
//		String str = new String("Have a nice day Have a nice day Have a nice day");
//		ArrayList arr = new ArrayList();
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				arr.add(i);
//			}
//		}
//		System.out.println(arr);
		//
		
//		String str = new String("It is a fun java programming");
//		int i=0;
//		int cnt_a=0,cnt_g=0,cnt=0;
//		while(i < str.length()) {
//			if(str.charAt(i) == 'a')
//				cnt_a++;
//			else if(str.charAt(i) == 'g')
//				cnt_g++;
//			i++;
//		}
//		System.out.println("총 개수 : "+str.length());
//		System.out.println("a 개수 : "+cnt_a);
//		System.out.println("g 개수 : "+cnt_g);
		
		
//		String str = new String("It is a fun java programming");
//		int cnt_a = 0, cnt_g = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a') {
//				cnt_a++;
//			} else if (str.charAt(i) == 'g') {
//				cnt_g++;
//			}
//		}
//		System.out.println("총 개수 : " + str.length());
//		System.out.println("a의 개수 : " + cnt_a);
//		System.out.println("g의 개수 : " + cnt_g);
		//
		
		
//		String str = new String("tESt  sTring  change   first");
//		String changeStr = new String();
//		int i=0;
//
//		str = str.toLowerCase();
//		// 전부 소문자로 만들어 줌 :  test  string  change   first 로 변경.
//		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
//			// 문자 연산의 경우 'a' 작은 따옴표 안에 넣어 사용 
//			// str의 (인덱스 0번) 첫 문자가 a 보다 같거나 크고
//			// 첫 문자가 z 보다 작거나 같다면 실행 && 연산자 사용 (a~z 사이 값)
//			// str.charAt(0) = t 
//			changeStr+=(char)(str.charAt(i)-32);
//			// i = 0;  (char)(str.charAt(0)-32);
//			//     (char형변환)(t-32);  => t = 아스키코드 값 116 이므로
//			//     (char형변환)(116-32);  =>   (char형변환)(84)  
//			//      *일반적으로 아스키코드 값 소문자 -32는 대문자임
//			//     (char)84  = > 아스키코드 84 T 
//			// changeStr += T ;  T라는 값을 changeStr 이라는 변수에 넣음 
//			i++;
//			// i++; i 는 1이 되므로 이후 if 실행 x 
//		}
//		while(i<str.length()) {
//			// i < str.length() 문자열의 길이보다 작다면 반복.
//			if(str.charAt(i) != ' ') {
//				// 만약 인덱스 i 가 띄어쓰기가 아니라면 
//				changeStr+=str.charAt(i);
//				// changeStr 에 넣음.
//				i++;  // i+=1;
//				continue;  
//				// 위쪽 while문 다시 실행 
//			}
//			while(str.charAt(i) == ' ') {
//				// 인덱스 i 번재가 띄어쓰기라면 
//				changeStr+=str.charAt(i);
//				// changeStr 에 띄어쓰기 넣음
//				i++;
//				// i+=1;
//			}
//			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
//				// 띄어쓰기일 경우 if문 실행 띄어쓰기 실행 후 a-z 사이의 값이라면 
//				changeStr+=(char)(str.charAt(i)-32);
//				//			(char형변환)(인덱스i번재 값의 아스키코드 - 32)    *일반적으로 아스키코드 값 소문자 -32는 대문자임
//			 	// 대문자로 바꿔서 changeStr에 입력 
//			i++;
//			// i+=1;  이후 가장 위쪽 while문 다시 실해 
//		}
//		System.out.println(changeStr);
		

	}

}
