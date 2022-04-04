package day12;

public class MainClass03_setter_getter {
	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.setting(100);
		int a = ex.getter();
		System.out.println(a - 1);
	}
}
