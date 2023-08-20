package Final;

public class Child extends Parent {

	private int child01;
	
	public Child() {}    //super();    // 기본 생성자에 자동적으로 들어가 잇음.
	public Child(int child01, int parent01, int parent02) {  // 만약 인자가 있는 생성자를 호출 할 경우 인자를 작성해줘야 함.
		super(parent01,parent02);
		this.child01 = child01;
	}
	
	
	public int getChild01() {
		return child01;
	}
	public void setChild01(int child01) {
		this.child01 = child01;
	}
	
	
}
