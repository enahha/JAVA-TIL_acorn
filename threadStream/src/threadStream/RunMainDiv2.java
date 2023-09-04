package threadStream;

public class RunMainDiv2 {
	public static void main(String[] args) {
		long lsum = 0;
		int iFirst = 200; int iSecound = 500;
		double dFirst = 200.123; double dSecound = 500.22;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i = 300001; i<650000; i++) {
			for(int j = 0;j<5000; j++) {
				lsum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();
		
		System.out.println("합계 : " + lsum);
		System.out.println("실행시간 : " + (lAfterTime - lBeforeTime));
	}
}
