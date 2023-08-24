package study0823.Summary;

public class Calc {
	// 필드영역
	private int iFirstVal; private int iSecondVal;
	private int iStartNum; private int iEndNum;
	private int[] iArrValue1;
	
	// 생성자
	public Calc() {}
	public Calc(int iFirstVal, int iSecondVal, int iStartNum, int iEndNum, int[] iArrValue1) {
		this.iFirstVal = iFirstVal;
		this.iSecondVal = iSecondVal;
		this.iStartNum = iStartNum;
		this.iEndNum = iEndNum;
		this.iArrValue1 = iArrValue1;
	}
	
	// 메소드 영역
	// // 정적메소드
	public static void printArray(int[] iArrValue1) {
		iArrValue1[2] = 90;
		System.out.println(iArrValue1[2]);		
	}
	
	public static void printAcumVal(int iStartNum, int iEndNum) {
		while(iStartNum <= iEndNum) {
			System.out.print(iStartNum + " ");
			iStartNum++;
		}
	}
	// // 동적메소드
	public int add(int iFirstVal, int iSecondVal) {
		int iRet01 = 0;
		iRet01 = iFirstVal + iSecondVal;
		return iRet01;
	}
	
	public int sub(int iFirstVal, int iSecondVal) {
		int iRet02 = 0;
		if(iFirstVal >= iSecondVal) { iRet02 = iFirstVal - iSecondVal; } 
		else { iRet02 = iSecondVal - iFirstVal; }
		return iRet02;
	}
	
	public int mul(int iFirstVal, int iSecondVal) {
		int iRet03 = iFirstVal * iSecondVal; 
		return iRet03;
	}
	
	public double div(int iFirstVal, int iSecondVal) {
		double dRet04 = 0.0;
		if(iFirstVal == 0) dRet04 = 0;
		else if(iSecondVal == 0) dRet04 = 0;
		else dRet04 = iFirstVal / iSecondVal;
		return dRet04;
	}
}
