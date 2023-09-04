package threadStream;

public class RunMain {
	public static void main(String[] args) {
		long lsum = 0;
		int iFirst = 200; int iSecound = 500;
		double dFirst = 200.123; double dSecound = 500.22;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i =0; i<1000000; i++) {
			for(int j = 0;j<5000; j++) {
				lsum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();
		
		System.out.println("합계 : " + lsum);
		System.out.println("실행시간 : " + (lAfterTime - lBeforeTime));
		
		// 실행시간이 3.628가 걸렸다. 이것을 쪼게서 실행시간을 줄여보자.
	}
}
