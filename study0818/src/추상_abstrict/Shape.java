package 추상_abstrict;

// 상속될 걸 목적으로 하는 클래스이다.  추상 class
// 클래스내에 하나라도 추상메소드가 존재하면 추상클래스
// 예약어 : abstract
// 추상메소드 : 메소드의 선언만 존재, 접근 제한자를 public
// 추상클래스는 직접 객체생성을 할 수 없다.
// 다른 클래스가 추상클래스를 상속받아 객체를 생성
// 자식 클래스에서 추상메소드와 반드시 동일한 이름의 메소드를 정의해야 함.
public abstract class Shape {
	
	private String name;
	
	public Shape() {}
	public Shape(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public  abstract double area(); 
	public abstract double perimeter();
	
	public void draw() {
//		String info = "ena";
//		int iinfo = 1;
//		double dinfo = 1.1;
//		System.out.printf("%s : %d , %f", info, iinfo, dinfo);
		String info01 = String.format("%s(넓이=%f, 둘레=%f)", name, area(), perimeter());
		System.out.println(info01);
	}
}
