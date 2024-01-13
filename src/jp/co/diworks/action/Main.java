package jp.co.diworks.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello,World.");
		System.out.println(hikizan(10,10));
		System.out.println(kakezan(10,10));
		System.out.println(warizan(10,10));
	}
	
	public static int hikizan(int num1,int num2) {
		return num1 - num2;
	}
	
	public static int kakezan(int num1,int num2) {
		return num1 * num2;
	}
	
	public static int warizan(int num1,int num2) {
		return num1 / num2;
	}
}
