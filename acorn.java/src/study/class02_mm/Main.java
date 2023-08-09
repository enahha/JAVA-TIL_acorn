package study.class02_mm;

public class Main {
	public static void main(String[] args) {
		// 기본생성자
		Employee employee = new Employee();
		System.out.println(employee);
		System.out.println(employee.iempNo);
		System.out.println(employee.sEmpName);
		System.out.println(employee.dSalsry);
		
		// 인자 있는 생성자
		Employee employee1 = new Employee(1, "홍길", 50000);
		System.out.println(employee1.iempNo);
		System.out.println(employee1.sEmpName);
		System.out.println(employee1.dSalsry);
	}
}
