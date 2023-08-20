package Final;


// 상수 : 초기화 한번만 가능
// final 데이터 타입 상수명 = 초기값
// 상수명 : 대문자로 만듦
public class final_basic {
	
//	private final String NAME = "ena";
	private static final String NAME = "ena";  // static을 붙였기 때문에 main 영역에서 바로 불러서 사용할 수 있음
	
	public static void main(String[] args) {
		int n = 1;
		final int m = 2;
		n=2;
		
		System.out.println(n);
		System.out.println(m);
		// m을 바꿀려하면 오류가 뜬다.
		
//		Main main = new Main();
//		System.out.println(main.name);
		
		System.out.println(NAME);

	}
}
