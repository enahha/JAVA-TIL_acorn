package study.access;

public class AcessTest {
	// 필드 (속성) 영역
	private int a;
	int b;
	public int c;
	protected int d;
	
	// 생성자 : 기본생성자, 인자 있는 생성자
	public AcessTest() {}

	// getter, setter 메소드 영역
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
