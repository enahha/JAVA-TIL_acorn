package review_basic;

import java.util.Scanner;

public class Object {

	public static void main(String[] args) {
		// 키보드에서 생성하고자 하는 배열 사이즈를 받아 배열 생성 - int
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size >>>");
		int arraySize = sc.nextInt();
		
		arrayInsert(sc, arraySize);
		
		sc.close();
	}
	
	public static void arrayInsert(Scanner sc, int arraySize) {
		
		int mid;
		int[] iArray = new int[arraySize];
		
		//배열의 가운데 위치에 키보드 입력받은 값을 저장
		System.out.print("Insrert Number >>>");
		int insertNum = sc.nextInt();
		
		if(arraySize%2==0) mid = (arraySize/2) - 1;
		else mid = arraySize/2;
		
		iArray[mid] = insertNum;
		
		// 입력한 값을 출력
		System.out.println("중앙 인덱스값 : " + mid);
		System.out.println("배열의 중앙값 : " + iArray[mid]);
	}
}
