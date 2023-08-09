package study.static01;

public class StaticTest {
	// 필드 영역
	static int number1;
	int number2;
	
	// 생성자
	public StaticTest() {}
	
	// // 메소드
	// 정적 메소드  :  프로그램이 완전히 종료하기 전까지는 사라지지 않는다.
	public static void printInfo() {    // static은 객체를 생성하지 않고 메소드를 불러올 수 있다.
		System.out.println("num1 = " + number1);
//		System.out.println("num2 = " + number2);   // 오류나는 이유 : 스테틱 영역에서 int number2;는 사용하지못한다.
	}
	
	// 동적 메소드
	public void printInfo2() {
		System.out.println("num1 = " + number1);
		System.out.println("num2 = " + number2);
	}
}
