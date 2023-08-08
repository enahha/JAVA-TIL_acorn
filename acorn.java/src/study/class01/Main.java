package study.class01;

public class Main {
	public static void main(String[] args) {
		// 객체를 선언하고 초기화 : 클래스명(데이터타입) 객체명(변수명) = new 생성지(클래스명)();
		StudyClass student = new StudyClass();
		System.out.println(student);
		
		// GETTER / SETTER 사용
		String name = student.getsName();
		System.out.println(name);
		
		student.setsName("홀길동");
		name = student.getsName();
		System.out.println(name);
	}
}
