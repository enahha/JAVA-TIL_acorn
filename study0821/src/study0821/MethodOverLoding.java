package study0821;

public class MethodOverLoding {

	public static void main(String[] args) {
		overLodingTest();
		overLodingTest("korea");
		overLodingTest(2023);
		overLodingTest("global", 2024);
		
	}
	
	public static void overLodingTest() {
		System.out.println("오버로딩");
	}
	public static void overLodingTest(String str) {
		System.out.println("들어가는 인자의 타입과 계수에 따라 동일한 이름이지만 실행되는 함수가 달라짐");
	}
	public static void overLodingTest(int i) {
		System.out.println("금년 : " + i);
	}
	public static void overLodingTest(String str, int i) {
		System.out.println(str + " || "  + i);
	}
}
