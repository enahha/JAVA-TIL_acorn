package review_basic;

import java.util.Scanner;

public class Object2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size >>>");
		int arraySize = sc.nextInt();
		
		int[] iArray01 = new int[arraySize];
		int[] iArray02 = new int[arraySize];
		
		System.out.print("Insrert Number >>>");
		int insertNum = sc.nextInt();
		
		iArray01 = arrayInsert(iArray01, insertNum);
		
		samePlace01(iArray01, iArray02);
		
		sc.close();
		
	}
	
	public static int[] arrayInsert(int[] iArray01, int insertNum) {
		
		for(int i = 0; i < iArray01.length; i++)
		{
			if(i % 2 == 0)iArray01[i] = insertNum;
		}
		
		return iArray01;
	}
	
	public static void samePlace(int[] iArray01, int[]iArray02) {
		
		for (int i=0; i<iArray01.length; i+=2) 
		{
			iArray02[i] = iArray01[i];
		}
		
		for(int a: iArray01) System.out.print(a);    // int a: iArray01   ==> 배열 안에있는 인덱스값을 하나씩 넣어서 돌리는 거
		System.out.println();
		for(int a: iArray02) System.out.print(a);
	}
	
	public static void samePlace01(int[] iArray01, int[]iArray02) {
				
		for (int i=0; i<iArray01.length; i++) 
		{
			if(i % 2 == 0) {
				if(i > 0) {       // 예외처리. 인덱스값이 0부터 시작인데 -1을 해주면 인덱스 오류가 남.
					iArray02[i-1] = iArray01[i];
				}
			}
		}
		
		for(int a: iArray01) System.out.print(a);    // int a: iArray01   ==> 배열 안에있는 인덱스값을 하나씩 넣어서 돌리는 거
		System.out.println();
		for(int a: iArray02) System.out.print(a);
	}
}
