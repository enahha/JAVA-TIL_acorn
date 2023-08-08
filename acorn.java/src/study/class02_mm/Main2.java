package study.class02_mm;

import java.util.Scanner;

public class Main2 {
	private double mSalary;    // oop의 원칙에 의해 private으로 바꿔줘야 함.
	private double mratio;
	private double mrate;
	
	// 클래스를 작성할 때 생성자를 만들지 않으면 자바 컴파일러가 기본 사=ㅐㅇ성자를 자동으로 생성
	// 생성자는 리턴타입이 없고 클래스 이름과 동일.
	// 기본 생성자 : 필드값을 필드의 데이터 타입 기본값을 초기화
	public double getmSalary() {
		return mSalary;
	}
	public void setmSalary(double mSalary) {
		this.mSalary = mSalary;
	}
	public double getmrate() {
		return mrate;
	}
	public void setmrate(double mrate) {
		this.mrate = mrate;
	}
	public double getmratio() {
		return mratio;
	}
	public void setmratio(double mratio) {
		this.mratio = mratio;
	}
	
	public double getReturnTax(double mSalary, double mratio) {
		double result = mSalary * mratio;
				return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요>>..");
		double jsalary = sc.nextDouble();
		System.out.print("세금비율을 입력하세요>>..");
		double jratio = sc.nextDouble();
		
		Main2 main = new Main2();
		//set
		main.setmSalary(jsalary);
		main.setmratio(jratio);
		//get
		
		System.out.println(main.getReturnTax(jsalary, jratio));
		
		sc.close();
	}
}
