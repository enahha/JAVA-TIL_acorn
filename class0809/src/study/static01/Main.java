package study.static01;

public class Main {

	public static void main(String[] args) {
		System.out.println(StaticTest.number1);    // number1은 static 메소드이므로 객체를 생성하지 않고 사용할 수 있다.
		StaticTest.number1 = 100;   // static 메소드이므로 초기화도 가능하다.
		StaticTest.printInfo();
		
		// 객체 생성
		StaticTest sTest = new StaticTest();
		sTest.printInfo2();
	}

}
