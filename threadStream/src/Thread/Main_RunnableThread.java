package Thread;

public class Main_RunnableThread {
	static long lsum1 = 0L;
	static long lsum2 = 0L;
	static long lsum3 = 0L;
	static long lsum4 = 0L;
	
	static long ltime1 = 0L;
	static long ltime2 = 0L;
	static long ltime3 = 0L;
	static long ltime4 = 0L;
	
	public static void main(String[] args) {
		Runnable runnablethread01 = new RunnableThread(1, 250000, 1);
		Runnable runnablethread02 = new RunnableThread(250001, 500000, 2);
		Runnable runnablethread03 = new RunnableThread(500001, 750000, 3);
		Runnable runnablethread04 = new RunnableThread(750001,1000000, 4);
		
		Thread thread1 = new Thread(runnablethread01);
		Thread thread2 = new Thread(runnablethread02);
		Thread thread3 = new Thread(runnablethread03);
		Thread thread4 = new Thread(runnablethread04);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		long lBeforTime = System.currentTimeMillis();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long lAfterTime = System.currentTimeMillis();
		
		System.out.println("연산합계: " + (lsum1 + lsum2 + lsum3 + lsum4));
		System.out.println("실행시간: " + (lAfterTime - lBeforTime));
	}
}
