package day6_0808;

import java.util.Scanner;

public class arrayPractice {
	// 배열
	// 선언 : 데이터 타입 배열명(변수명);
	// 초기화 : 배열명 = {}, new 데이터타입[사이즈];
	// 초기화시점의 기본값
	// 대입 :배열요소(배열명[인덱스]: 시작(0)
	// 배열명[0] = 값
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 // 배열 크기 변수 설정, 배열 선언
		 int[] iArray;
		 int iArraySize = 0;
		 // 사용자에게 입력 받은
		 System.out.println("Enter iArraySize >>>");
		 iArraySize = sc.nextInt();
		 // 양의 정수만큼 배열 크기를 할당
		 iArray = new int[iArraySize];
		 // 1부터 입력 받은 값까지 배열에 저장
		 for (int i = 0; i < iArraySize; i++)
		 {
			 iArray[i] = i + 1;
		 }
		 // 출력
		 for (int i = 0; i < iArraySize; i++)
		 {
			  System.out.print(iArray[i] +" ");
		 }
		 
		 sc.close();
	}
}
