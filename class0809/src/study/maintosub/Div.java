package study.maintosub;

public class Div {
	public Div() {}
	
	public static void divOperationStat(int numOne, int numTwo) {
		int iDivResult = 0;
		if(numOne == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과 0임");}
		else if(numTwo == 0) {iDivResult = 0;System.out.println("분모가 0이므로 연산불가");}
		else {iDivResult = numOne / numTwo; System.out.println("결과 ____" + iDivResult);}
	}
	// 동적 메소드
	public void divOperation(int inumOne, int inumTwo) {
		String iDivResult = "";
		if(inumOne == 0) {iDivResult = ""; System.out.println("분자가 0이므로 연산결과 0임");}
		else if(inumTwo == 0) {iDivResult = "";System.out.println("분모가 0이므로 연산불가");}
		else {iDivResult = String.valueOf((double)inumOne / inumTwo); System.out.println("결과 ____" + iDivResult);}
	}
	// 메소드 오버로딩
	public void divOperation(double dnumOne, double dnumTwo) {
		double iDivResult = 0;
		if(dnumOne == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과 0임");}
		else if(dnumTwo == 0) {iDivResult = 0;System.out.println("분모가 0이므로 연산불가");}
		else {iDivResult = dnumOne / dnumTwo; System.out.println("결과 ____" + iDivResult);}
	}
	public void divOperation(int numOne, double numTwo) {
		double iDivResult = 0;
		if(numOne == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과 0임");}
		else if(numTwo == 0) {iDivResult = 0;System.out.println("분모가 0이므로 연산불가");}
		else {iDivResult = numOne / numTwo; System.out.println("결과 ____" + iDivResult);}
	}
	public void divOperation(double numOne, int numTwo) {
		double iDivResult = 0;
		if(numOne == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과 0임");}
		else if(numTwo == 0) {iDivResult = 0;System.out.println("분모가 0이므로 연산불가");}
		else {iDivResult = numOne / numTwo; System.out.println("결과 ____" + iDivResult);}
	}

}
