package class_inheritance_상속.class_inheritance_method;

public class Person {
	// 필드 영역
	private String name;
	
	// 생성자 영역
		// 기본생성자
	public Person() {System.out.println("Person() 기본 생성자");}
		// 인자있는 생성자
	public Person(String name) {
		System.out.println("Person() 인자 있는 생성자");
		this.name = name;
	} 
	
	// Getter, Setter 메소드 영역
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	// 오버라이드(재정의) 함수 : toString(): return "이름 : ";
	@Override
	public String toString() {
//		return "이름 : "+ name;    ⏸
		return String.format("이름 : %s", this.name);
	}
}
