package day2;

import java.util.Arrays;
import java.util.Scanner;

public class substring_문자열자르기 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
	
		for(int i=0; i < str.length(); i++)
		{
			System.out.println(i + "번 째 문자 : " + str.substring(i, i+1));
			
		}
		
		// 문자열을 배열로 변환하기
		char[] strArr = str.toCharArray();
		// 배열 출력
		System.out.println(Arrays.toString(strArr));
		
		sc.close();
	}
}
