package review_basic;

import java.util.Scanner;

public class ReviewMain2 {
	public static void main(String[] args) {
		// 입력된 네 개의 수가 있다.
		// 두 개는 실수, 두 개는 정수
		// 네 수를 검사해서 5보다 작은 수를 출력
		Scanner sc = new Scanner(System.in);
		
		int iType = 1;
		
		int iRetNum01 = keyInputProcess(sc);
		int iRetNum02 = keyInputProcess(sc);
		
		compareNum(iRetNum01, iRetNum02);
	}
	//키 입력 처리 함수
	public static int keyInputProcess (Scanner sc) {		
		int iInputValue;
		System.out.println("정수 >>>");
		iInputValue = sc.nextInt();
		
		return iInputValue;
	}
	
	// 비교 처리 함수
	public static void compareNum(int numi01, int numi02) {
		if(numi01 < numi02) {System.out.println(numi02 + "더 큼.");}
		if(numi01 > numi02) {System.out.println(numi01 + "더 큼.");}
		if(numi01 == numi02) {System.out.println(numi01 + "=" + numi02);}		
	}
}