package Final.nonInheritance;

public class NonInheritance {
	private int iNon;
	
	public NonInheritance() {}
	public NonInheritance(int iNon) {
		this.iNon = iNon;
	}
	
	
	public int getiNon() {
		return iNon;
	}
	public void setiNon(int iNon) {
		this.iNon = iNon;
	}
	
	// 위치가 같은 패키지 내가 아닌 별도의 패키지내의 클래스(상속관계에 있지 않은 클래스)일 경우 public으로 처리해 줄 수도 잇다.
//	public void printParentObj() {
//		Parent parent = new Parent(1,2);
//		System.out.println(parent.parent01);
//		System.out.println(parent.parent02);
//	}
}

