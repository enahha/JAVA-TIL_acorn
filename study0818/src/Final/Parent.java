package Final;

public class Parent {

	protected final int parent01 = 10;
	protected int parent02;
	
	public Parent() {}
	public Parent(int parent01, int parent02) {
//		this.parent01 = parent01;       // 이건 final이므로 인자 생성자 this 가 필요없다
		this.parent02 = parent02;
	}
	public int getParent01() {
		return parent01;
	}
//	public void setParent01(int parent01) {
//		this.parent01 = parent01;
//	}
	public int getParent02() {
		return parent02;
	}
	public void setParent02(int parent02) {
		this.parent02 = parent02;
	}
	
	public void printobj() {
		System.out.println("parent01 : " + parent01 + "  |  " + "parnet02 : " + parent02);
	}
}
