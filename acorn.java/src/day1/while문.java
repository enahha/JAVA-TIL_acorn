package day1;

public class while문 {

	public static void main(String[] args) 
	{
//		int iWhileValue = 1;
//		while(iWhileValue <= 10) {
//			System.out.println(iWhileValue);
//			iWhileValue++;
//		}
// -----------------------------
		//Q2.
		// 1. 배열의 요소들을 0으로 초기화한다.
		int[] iEvenOddCountArr = {0,0};
		//iEvenOddCountArr[0] : 짝수의 개수, iEvenOddCountArr[1] : 홀수의 개수
		int i = 1;
		
		while(i <= 31) {
			if (i % 2 ==1) {iEvenOddCountArr[0]++;}    // 리스트의 요소에 ++하는 
				else {iEvenOddCountArr[1]++;}
			
			i++;
		}
		
		System.out.println(iEvenOddCountArr[0]);
		System.out.println(iEvenOddCountArr[1]);
	}
}
