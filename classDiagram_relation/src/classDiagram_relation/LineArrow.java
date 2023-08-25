package classDiagram_relation;

public class LineArrow {
	private int Test01value01;
	private int Test01value02;
	
	public LineArrow() {				// 이때, LineArrow 와 LineArrow2의 관계는 association관계이다.
		LineArrow2 obj = new LineArrow2();
		System.out.println(obj.getTest02value01());
		System.out.println(obj.getTest02value02());
		obj.setTest02value01(1);
		obj.setTest02value02(2);
		System.out.println(obj.getTest02value01());
		System.out.println(obj.getTest02value02());
	}  // 이 구역을 탈출하는 순간 obj는 사라진다.

	public int getTest01value01() {
		return Test01value01;
	}
	public void setTest01value01(int test01value01) {
		Test01value01 = test01value01;
	}
	public int getTest01value02() {
		return Test01value02;
	}
	public void setTest01value02(int test01value02) {
		Test01value02 = test01value02;
	}
	////
	public void useLineArrow2() {
		LineArrow2 obj = new LineArrow2();
		System.out.println(obj.getTest02value01());
		System.out.println(obj.getTest02value02());
		obj.setTest02value01(1);
		obj.setTest02value02(2);
		System.out.println(obj.getTest02value01());
		System.out.println(obj.getTest02value02());
	}
	
}
