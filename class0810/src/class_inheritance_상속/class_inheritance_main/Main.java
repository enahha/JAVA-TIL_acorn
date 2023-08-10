package class_inheritance_상속.class_inheritance_main;

import class_inheritance_상속.class_inheritance_method.BusinessPerson;
//import class_inheritance_상속.class_inheritance_method.Person;


// 상속 : 상위 클래스의 맴버들을 확장해서 하위 클래스를 설계하는 방법
// 상위 클래스(super class), 부모클래스(parent class), 기본클래스(base class)
// 하위 클래스(sub class), 자식 클래스(child class), 유도 클래스(derived class)
// is-a 관계가 성립할 때 , 상속을 사용해서 클래스를 설계
	// 회사원은 사람이다. => 이때 사람이 상위클래스, 부모 클래스, 기본클래스가 되고 / 회사원은 하위클래스,자식클래스,유도클래스가 된다.
// 자바의 모든 클래스 object 클래스를 상속함.   			 표현법 :  B(하위) extends A(상위클래스)
// 자바는 다중 상속이 금지되어있음.
// 상속관계에서의 생성자 호출 순서

// 부모(상위) - 자식(하위) 관계 : 상속
// 상속 표기 방법 : public class 클래스명(자식) extends 클래스명(부모)
// 자식 is-a 부모
// 자식객체와 부모객체는 힙 영역내에 동일한 곳에 위치
// 자식은 부모가 허용한 모든 필드와  허용한 메서드에 접근 가능
	// 의미: 자식객체.(부모메소드와 자신의 메소드를 호출가능)

// // 🔺오버라이드 
// 부모와 자식이 동일한 메소드를 가지고 있는 경우
// : 자식메소드가 우선적으로 실행
// : 애노테이션(@Override)은 자식메소드를 먼저 실행 , 명시적으로 지시
// 부모의 메소드와 자식의 메소드는 일치해야함

public class Main {
	public static void main(String[] args) {
//		Person p1 = new Person();
//		System.out.println(p1);
//		
//		Person p2 = new Person("홍길동");
//		System.out.println(p2);
		
		BusinessPerson p3 = new BusinessPerson();
		System.out.println(p3);
		
		BusinessPerson p4 = new BusinessPerson("홍길동", "에이콘");
		System.out.println(p4);
	}
}
