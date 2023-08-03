package day3;

import java.util.Scanner;

public class arr_practice01 {
	public static void main(String[] args)
	{
		// // 배열 생성 후 원하는 숫자 입력 후 해당 숫자에 해당하는 배열 인덱스 반환 // //
		
		String[] weekend = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~7까지 숫자입력 : ");
		int weekPickIndex = sc.nextInt();
		
		if(weekPickIndex > weekend.length)
		{
			System.out.println("잘못입력하셨슴니다.");
		}else {System.out.println(weekend[weekPickIndex-1]);}
		
		sc.close();
		
	}
}
