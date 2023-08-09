package study.maintosub;

public class Mul {
	public Mul() {}
	
	public static int sudOperationStat(int numOne, int numTwo) {
		int iSubResult = 0;
		iSubResult = numOne * numTwo;
		return iSubResult;
	}

	public int sudOperation(int inumOne, int inumTwo) {
		int iSubResult = 0;
		iSubResult = inumOne * inumTwo;
		return iSubResult;
	}
	
	// 오버로딩
	public double sudOperation(double dnumOne, double dnumTwo) {
		double iSubResult = 0;
		iSubResult = dnumOne * dnumTwo;
		return iSubResult;
	}
	public double sudOperation(double dnumOne, int inumTwo) {
		double iSubResult = 0;
		iSubResult = dnumOne * inumTwo;
		return iSubResult;
	}
	public double sudOperation(int inumOne, double dnumTwo) {
		double iSubResult = 0;
		iSubResult = inumOne * dnumTwo;
		return iSubResult;
	}

}
