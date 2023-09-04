package Thread;


public class RunnableThread implements Runnable{

	private int iStart;
	private int iEnd;
	private int iFlag;
	
	public RunnableThread(int iStart, int iEnd, int iFlag) {
		this.iStart = iStart;
		this.iEnd = iEnd;
		this.iFlag = iFlag;
	}
	// 여기서부터 >>
	@Override
	public void run() {
		
		long lsum = 0;
//		long lBeforTime = System.currentTimeMillis();
		for(int i = iStart; i <iEnd ; i++) {
			for(int j = 0;j<5000; j++) {
				lsum += i * j;
			}
		}
//		long lAfterTime = System.currentTimeMillis();
		
		if(iFlag == 1) {
			Main_RunnableThread.lsum1 = lsum;
		}else if(iFlag == 2) {
			Main_RunnableThread.lsum2 = lsum;
		}else if(iFlag == 3) {
			Main_RunnableThread.lsum3 = lsum;
		}else {
			Main_RunnableThread.lsum4 = lsum;
		}
	
	}
	// 여기까지가 쓰레드 실행영역임.
	
}
