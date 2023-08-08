package study.class02_mm;

public class Employee {
	// 필드(속성) 영역
	int iempNo;
	String sEmpName;
	double dSalsry;
	
	// 기본 생성자  반듯이 기본생성자를 함께 만들어놔야 함.
	public Employee() {}
	
	// 인자가 있는 생성자. )) 받은 인자를 초기화 해주는 생성자 생성할 것이다.
	public Employee(int iempNo, String sEmpName, double dSalsry) // 인자를 받은 이유?? => 초기화해주기 위해서
	{
		this.iempNo = iempNo;
		this.sEmpName = sEmpName;
		this.dSalsry = dSalsry;
	}
	public int getIempNo() {
		return iempNo;
	}

	public void setIempNo(int iempNo) {
		this.iempNo = iempNo;
	}

	public String getsEmpName() {
		return sEmpName;
	}

	public void setsEmpName(String sEmpName) {
		this.sEmpName = sEmpName;
	}

	public double getdSalsry() {
		return dSalsry;
	}

	public void setdSalsry(double dSalsry) {
		this.dSalsry = dSalsry;
	}

	// 메소드 영역 - 동적 메소드
	public double getReturnTax(double ratio, int type)
	{
		
		double returnTaxResult = 0.0;
		
		if(type == 1) returnTaxResult = dSalsry * ratio; 
		else if(type == 2) returnTaxResult = ((dSalsry*12) + (dSalsry * 1.13)) *ratio;
		// 계산된 결과를 변수에 저장
		return returnTaxResult;
	}
}
