package day6_0808;

import java.util.Scanner;

public class arrayPractice3_hard {
	public static void main(String[] args) {
		// // charAt을 사용해 문자 하나하나를 배열에 저장하기. // //
		Scanner sc = new Scanner(System.in);
			//문자열을 입력 받아:
				// String sInputMsg;
				// sInput.length()
			//문자 배열을 선언 : 
				// 문자 하나하나를 저장: charAt(인덱스);
			// 검색할 문자가 : 미리 검색문자
				// 변수 선언과 초기화 or 키보드 입력
			// 문자열에 몇 개 들어가있는지 개수를 출력
		String sInputMsg = "";
		char[] cArray;
		int arraySize = 0;
		
		char cChar = 'p';
		int iCount = 0;
		
		System.out.println("문자열을 입력하세요. >>>");   // application 을 입력했을 때 중복된 문자가 몇 개 들어가 있는지 ,,?
		sInputMsg = sc.nextLine();
		arraySize = sInputMsg.length();
		
		cArray = new char[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			cArray[i] = sInputMsg.charAt(i);
		}
		
		for(int i = 0; i < arraySize; i++) {
			System.out.print(cArray[i] + "^");
		}
		
		for(int i = 0; i < arraySize; i++) {
			if (cArray[i] == cChar) iCount++;
		}
		
		System.out.println("일치하는 문자 개수는 : " + iCount);
		
		sc.close();
	}
}
