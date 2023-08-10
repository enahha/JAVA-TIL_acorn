package javaBasic_정리;

public class Main {
	public static void main(String[] args) {
// 		new Main02;
		// 변수선언 : 데이터타입 변수명; 초기화 데이터타입 변수명 = 값;,변수명 = 값
		// 원시 데이터타입 : int, long(주의 : long lValue = 12L), double, float(주의 : float fValue = 0.0F;)
		// 객체형 데이터타입 : String str = "aaa";
		// 동일 변수명을 가진 변수는 선언을 한 번 밖에 할 수 없다.
		// int a;  -> (int) a;
		// 함수 : 함수명()
		int a = 2; int b =3; int c = a + b;
		c = add(a,b);   // 함수호출 a,b를 아규먼트(함수인자(변수))
		System.out.println(c);	// result - 5

		// 🟣 반복문
		for (int i = 0; i < 10; i++) {
			System.out.println(10);
		}
		
		// 🟣 조건문
		int i = 10;
		if(i<20) {
			
		}
		else {
			
		}
		
		// 🟣 배열
		// int[] iArray = new int[size];
		// double[] dArray = new double[size];
		// String[] sArray = new String[size];
		
	}
	
	public static int add(int a, int b){		// 함수호출 받은 쪽 : 파라메터(함수인자(변수)); 리턴값 함수명(함수인자)
		int c;
		c = a + b;
		return c;
	}
}
