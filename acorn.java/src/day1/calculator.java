package day1;

import java.util.Scanner;


public class calculator {
	public static void main(String[] args)
	{
		// 계산기 프로그램
		// 메뉴
//		1. 더하기
//		2. 뺴기
//		3. 곱하기
//		4. 나누기
//		99. 종료
//		원하는 메뉴를 선택하세요:>>>
//		선택된 기능으로 이동
//		첫번째 숫자를 입력하세요
//		두번째 숫자를 입력하세요
//		결과 출력
//		메뉴로 이동
//		메뉴
//		//1. 더하기
//		//2. 빼기
//		//3. 곱하기
//		//4. 나누기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
		
			//1. 메뉴선택 (1: 더하기, 2: 빼기, 3:곱하기, 4:나누기, 99:종료)
			System.out.println(" 메뉴선택 (1: 더하기, 2: 빼기, 3:곱하기, 4:나누기, 99:종료) || 원하는 메뉴를 선택하세요! >>>>");
			int keySelect = sc.nextInt();
			
			// ㅇㅖ외처리
			if(keySelect == 99) 
			{
				break;
				// 만약 while문을 사용하지 않는다면 System.exit(0); 로 종료했다.
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(0);
			}
			if((keySelect != 1) && (keySelect != 2) && (keySelect != 3) && (keySelect != 4))
			{
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				System.out.print("다시 선택하세요.>>>");
			}
			
			
			System.out.print("숫자를 입력하세요(1/2) >>");
			int num1 = sc.nextInt();
			System.out.print("숫자를 입력하세요(2/2) >>");
			int num2 = sc.nextInt();
			
			if(keySelect == 1)
			{
				add(num1, num2);
			}
			if(keySelect == 2)
			{
				minus(num1, num2);
			}
			if(keySelect == 3)
			{
				multi(num1, num2);
			}
			if(keySelect == 4)
			{
				div(num1, num2);
			}
			System.out.println("/n/n/n/n/n/n/n/n");  //clear가 안되서 전거가 안보이게 위료 올려버림.
		}
		System.out.println("프로그램 실행을 종료합니다.");
	}
// -----------------------------
		public static void add(int number1, int number2)
		{
			System.out.println("result : " + number1 + number2);
		}
		public static void minus(int number1, int number2)
		{
			System.out.println("result : " +( number1 - number2));
		}
		public static void multi(int number1, int number2)
		{
			System.out.println("result : " + number1 * number2);
		}
		public static void div(int number1, int number2)
		{
			System.out.println("result : " + number1 / number2);
		}


	
}
