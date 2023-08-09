package singleton.static0;

public class Main {
	public static void main(String[] args) {
//		int a;
//		int b;
//		int c;
		
//		SingleTonTest singleton = new SingleTonTest();    // SingleTonTest는 지금 private으로 생성되어 있으므로 오류가 발생.
		
		// 객체 힙에 생성됩니다. (메모리) : 주소값으로 표현(레퍼런스)
		SingleTonTest st1 = SingleTonTest.getInstance("ena");
		System.out.println(st1);
		SingleTonTest st2 = SingleTonTest.getInstance("enaaags");
		System.out.println(st2);
		SingleTonTest st3 = SingleTonTest.getInstance("enaaags");
		System.out.println(st3);
		SingleTonTest st4 = SingleTonTest.getInstance("enaaagsdfdf");
		System.out.println(st4);
	}
}
