package study.class02_mm;

public class Main3 {
	public static void main(String[] args) {
		int iempNo = 1;
		String sEmpName = "홍길동";
		double dSalsry = 500000;
		double ratio = 0.075;
		
		// 1안
		//	리턴세금 = 월급 * 비율;
		double returnTex = dSalsry * ratio;
		
		// 2안: 정적 메소드 사용 
		// 메소드명
		double returnTex2 =  getReturnTax(500000, 0.075);
		
		// 3안: Main02 객체를 생성  new로!!!
		// 메인객체.메소드명
		Main3 main = new Main3();
		double returnTex3 = main.getReturnTaxRetio(500000, 0.075);
	}
	
	public static double getReturnTax(double pay, double ratio) {   // 정적인 메소드 영역은 빠르지만 제한적임
		double result = pay * ratio;
		return result;
	}
	
	public double getReturnTaxRetio(double pay, double ratio) {
		double result = pay * ratio;
		return result;
	}
}
