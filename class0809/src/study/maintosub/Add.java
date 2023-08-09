package study.maintosub;

public class Add {
	// 필드(속성) 영역
	// 생성자 영역 : public 클래스명()  : 기본 생성자/ 인자가 있는 생성자
	public Add() {}
	// getter, setter 메소드 영역
	
	// 일반 메소드 영역
//''''''''''''''''''''''''
	// // 정적(static) 메소드 영역
	public static int addOperationStat(int numOne, int numTwo) {
		int iAddResult = 0;
		iAddResult = numOne + numTwo;
		return iAddResult;
	}
//''''''''''''''''''''''''
	// // 동적 메소드 영역
	public int addOperation(int inumOne, int inumTwo) {
		int iAddResult = 0;
		iAddResult = inumOne + inumTwo;
		return iAddResult;
	}
	
//''''''''''''''''''''''''
	// 메소드 오버로딩 영역
	public double addOperation(double dnumOne, double dnumTwo) {
		double iAddResult = 0;
		iAddResult = dnumOne + dnumTwo;
		return iAddResult;
	}
	public double addOperation(double dnumOne, int inumTwo) {
		double iAddResult = 0;
		iAddResult = dnumOne + inumTwo;
		return iAddResult;
	}
	public double addOperation(int inumOne, double dnumTwo) {
		double iAddResult = 0;
		iAddResult = inumOne + dnumTwo;
		return iAddResult;
	}



}
