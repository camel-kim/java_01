package day09;

public class Ex04_String {

	public static void main(String[] args) {
		String id = "   test   ";
		String idChk = "test";
		System.out.println(id);
		System.out.println(idChk);
		System.out.println(id.equals(idChk));
		
		System.out.println(id.trim());
		//trim 양쪽에 있는 공백을 삭제해줌.
		System.out.println(idChk.equals(id.trim()));
		
		String str = "031245/서울/종로3";
		String[] s = str.split("/");
		//split("") 배열에서 "" 내용 기준으로 나누는 기능.
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		s[2] = "주소변경";
		str = s[0]+"/"+s[1]+"/"+s[2];
		System.out.println(str);
		
		String re = str.replace("/", ":");
		//replace(A, B)  A값을 B로 변경
		System.out.println(re);
	}

}
