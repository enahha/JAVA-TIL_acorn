package day2;

import java.util.Scanner;

public class 변수_실습문제 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("성별을 입력하세요 : ");
//		String gender = sc.nextLine();
//		
//		System.out.print("나이를 입력하세요 : ");
//		byte age = sc.nextByte();
//		
//		System.out.print("키를 입력하세요 : ");
//		float height = sc.nextFloat();
//		
//		System.out.println("키" + height + "cm인 " + age + "살 " + name + "님 반갑습니다\\^^//");
//		
//		sc.close();    // 메서드를 사용하고나면 꼭 닫아줘야함.
		
//---------------------------------
		int option = 0;   // 계속 사용하기 위해 루프 바깥에 변수를 만들어둠.
		int nowOption = 0;
		int inputNum1 = 0;
		int inputNum2 = 0;
		
		while(true) 
		{
			System.out.print("더하기(1)/빼기(2)/곱하기(3)/나누기(4)/종료(99)");
			option = sc.nextInt();    // option변수 초기화.
			
			if(option == 99) {System.out.println("99. 프로그램을 종료합니다."); break;}
			else if((option < 1) || (option > 4)) {System.out.println("잘못된 선택입니다. 다시 선택하세요."); continue;}
			
			System.out.println("== 연산 타입 메뉴 ==");
			System.out.println("1. 정수");
			System.out.println("2. 실수");
			System.out.println("99. 뒤로");
			nowOption = sc.nextInt();
			
			if(nowOption == 99) {continue;}
			else if((nowOption < 1) || (nowOption > 2)) {System.out.println("잘못된 선택입니다. 다시 선택하세요."); continue;}
			
			
			System.out.print("숫자입력..");
			inputNum1 = sc.nextInt();
			System.out.print("숫자입력..");
			inputNum2 = sc.nextInt();
			
			
			if(option == 1)
			{
				System.out.println(inputNum1+inputNum2);
			}
			if(option == 2)
			{
				System.out.println(inputNum1-inputNum2);
			}
			if(option == 3)
			{
				System.out.println(inputNum1*inputNum2);
			}
			if(option == 4)
			{
				System.out.println(inputNum1/inputNum2);
			}
		}
		
		sc.close();
	}
}
