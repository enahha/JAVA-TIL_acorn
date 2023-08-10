package class_inheritance_상속.class_inheritance_method;

public class BusinessPerson extends Person {
	// //필드 영역
	private String company;
	
	// //생성자 영역
	public BusinessPerson() {
//		super();  // 부모요소 생성 = 요즘엔 알아서 생성해줌 ,,, 생략가능
		System.out.println("BusinessPerson() 기본 생성자");
	}
	public BusinessPerson(String company, String name) {
		super(name);   //name 을 받아 부모 name을 초기화하는데 사용된다.
		System.out.println("BusinessPerson() 인자 있는 생성자");
		this.company = company;
	}
	// 메소드 영역
	// getter/setter 영역
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름 : %s , 화사 : %s", this.getName(), this.getCompany());
	}
	
}
