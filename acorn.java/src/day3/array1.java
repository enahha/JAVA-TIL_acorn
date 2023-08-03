package day3;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args)
	{
//		// 1~10 까지 숫자 배열에 추가
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; ++i)
//		{	
//			arr[i] = i + 1;
//		}
//		// 값을 출력
//		for (int i = 0; i < arr.length; ++i)
//		{	
//			System.out.println(arr[i]);
//		}
		
		// // 역순으로 출력 // //
//		int[] arr = new int[10];
//		
//		for (int i = 9, j = 0; i >= 0; --i, j++)
//		{
//			arr[j] = i + 1;
//		}
//		// 값을 출력
//		for (int i = 0; i < 10; ++i)
//		{	
//			System.out.println(arr[i]);
//		}
		
// =======================================		
		//  // String 배열 생성 후 인덱스를 활용해 해당 단어 출력. // //
//		String[] sArr = new String[5];
//		
//		sArr[0] = "사과";
//		sArr[1] = "사과";
//		sArr[2] = "사과";
//		sArr[3] = "귤";
//		sArr[4] = "사과";
//		
//		for(int i = 0; i < sArr.length; i++)
//		{
//			if(sArr[i].equals("귤")) {
//				System.out.println(sArr[i]);
////				break;
//			}else {
//				System.out.println("귤이 아닙니다.");
//			}
//		}
// =======================================
		// 문자열을 입력 받아
		// 문자 하나하나를 배열에 넣고 : str.charAt(인덱스)
		// 검색할 문자를 입력 받아
		// 일치 문자열 갯수
		// 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String inputString = sc.nextLine();
		
		char[] cArr = new char[inputString.length()];
		
		for(int i=0; i < inputString.length(); i++)
		{
			cArr[i] = inputString.charAt(i);
		}
		
		System.out.print("검색할 문자 입력 : ");
		char serchStr = sc.nextLine().charAt(0);
		
		int matchCount = 0;
		
		for(int i=0; i<cArr.length; i++)
		{
			// 일치 문자열 갯수 : 증감 연산자
			if(serchStr == cArr[i]) {matchCount++;}
		}
		
		System.out.println("일치문자갯수 : " + matchCount);
		
		sc.close();
	}
}
