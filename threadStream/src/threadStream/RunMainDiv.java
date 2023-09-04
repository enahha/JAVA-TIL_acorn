package threadStream;

public class RunMainDiv {
	public static void main(String[] args) {
		long lsum = 0;
		int iFirst = 200; int iSecound = 500;
		double dFirst = 200.123; double dSecound = 500.22;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i =0; i<300000; i++) {
			for(int j = 0;j<5000; j++) {
				lsum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();
		
		System.out.println("합계 : " + lsum);
		System.out.println("실행시간 : " + (lAfterTime - lBeforeTime));
	}
	
	// RunMainDiv1,2,3 의 실행시간을 모두 합하면 RunMain의 실행시간보다 조금 줄어든 것을 알 수 있다.
}
