package day1;

public class for반복문 {

	public static void main(String[] args) {
//		// // 반복문 : for((선언된 변수를 )초기화; 조건식; 증감값){} // //
//		for(int i=1; i <= 10; i++) {System.out.println(i);}
//			System.out.println("\n끝났습니다.");
//			
//		// 구구단
//		for(int i=1; i<=9; i++) {
//			System.out.print("\n" + i + "단 :");
//			for(int j=1; j<=9; j++) {
//				System.out.print(i*j +" ");
//			}
//		}
//			System.out.println("\n끝났습니다.");
//			
//// -------------------같음 ||
//			
//		for(int i=2; i<=9; i++) {
//			System.out.print(i + "단 :");
//			for(int j=1; j<=9; j++) {
//				System.out.print(i*j +" ");
//			}
//			System.out.println();
//		}
//		System.out.println("출력이 종료되었습니다.");
//		
//// -------------------
//		
//		for(int i = 1; i <= 5 ; i++) {
//			for(int x = 5 ; x >= i; x--) {
//				System.out.print(" ");
//			}
//
//			for(int j = 1 ; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//// for 만 쓰면 코드의 유연성이 떨어진다.
//		for(int i = 1; i <= 5 ; i++) 
//		{
//			if(i == 1) System.out.print(" ");
//			if(i == 2) System.out.print("  ");
//			if(i == 3) System.out.print("   ");
//			if(i == 4) System.out.print("    ");
//			if(i == 5) System.out.print("     ");
//			for(int j = 1 ; j <= i; j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
				
// -------------------------
		int iIndex = 0;
		// 이렇게 호출해서 사용할 수 있다.
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		printVerityNumber(iIndex++);
		
	}
//===================================
	public static void printVerityNumber(int iIndex)   //// 함수임
	{   
		System.out.println("iIndex : " + iIndex);
		int[] iNumberArray = {1,2,3,4,5,6,7,8,9,10};
		
		if(iNumberArray[iIndex] % 2  == 0)
		{
			System.out.println("even");
			if(iNumberArray[iIndex] % 4  == 0)
			{
				System.out.println("4의 배수");
				} else if(iNumberArray[iIndex] % 6  == 0) {
					System.out.println("6의 배수");
				} else if(iNumberArray[iIndex] % 8  == 0) {
					System.out.println("8의 배수");
				} else if(iNumberArray[iIndex] % 10 == 0) {
					System.out.println("10의 배수");
				} else {
					System.out.println("2의 배수");
				}			
		}
		else if(iNumberArray[iIndex] % 3  == 0){
			System.out.println("3의 배수");
		}
		else if(iNumberArray[iIndex] % 5  == 0){
			System.out.println("5의 배수");
		}
		else if(iNumberArray[iIndex] % 7  == 0){
			System.out.println("7의 배수");
		}
		else if(iNumberArray[iIndex] % 9  == 0){
			System.out.println("9의 배수");
		}

	}
}

