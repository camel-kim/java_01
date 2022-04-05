package test;

// import test2.Test01;
// import test2.Test02;
// 나와 다른 패키지에 있는 것들은 import를 해주어야 사용 가능하다.
import test2.*;
// .* test2 패키지에 있는 모든 값을 import 하겠다.

//import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		MainClass01 m = new MainClass01();
		m.test();
		Test01 t = new Test01();
		t.test();
		
		Test02 t02 = new Test02();
		t02.test();
	}

}
