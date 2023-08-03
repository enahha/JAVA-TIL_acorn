package day2;

import java.util.Scanner;

public class random {
	
	public static void main(String[] args) 
	{
		// 우승 타입 생성(player = 1 , com =2)
//		byte iType = 1;
//		// 키보드 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
//		// 두 개의 숫자를 키보드 입력 (사용자측 숫자)
//		System.out.print("1~100사이의 숫자를 입력하새요(1/2)");
//		int playerKryNum1 = sc.nextInt();
//		System.out.print("1~100사이의 숫자를 입력하새요(2/2)");
//		int playerKryNum2 = sc.nextInt();
		
//		// 두 개의 난수를 생성  Ramdm  (컴퓨터측 숫자)
//		int randomNum1 = (int)(Math.random()*100)+1;    // 1~100까지의 자연수중 랜덤
//		int randomNum2 = (int)(Math.random()*100)+1;
//		// 우승조건 : 두 개의 수의 차가 가장 적은 수
//		
//		int player = Math.abs(playerKryNum1 - playerKryNum2);    // Math.abs() :  절대값 구하는 함수
//		int com =  Math.abs(randomNum1 - randomNum2);
//		
//		
//		System.out.println(player + ":" + com);
//		
//		if(player < com)
//		{
//			System.out.println("우승입니다.");
//		}
//		else if(player < com){
//			System.out.println("패배입니다.");
//		} else {System.out.println("무승부입니다.");}
		
		
// -----------------------\
		
		// 요소 없는 배열 생성 : 데이터타입[] 변수명 = {};
		int[] Rng = new int[100];
		
		// 난수 생성 후 배열에 넣기
		for(int i = 0; i < 100; i++)
		{
			Rng[i] = (int)((Math.random()*100))+1;     // 빈 배열에 값 집어 넣기
		}
		
		// 두 개의 난수를 생성  Random  (컴퓨터측 숫자)
		int randomNum1 = (int)(Math.random()*100)+1;    // 1~100까지의 자연수중 랜덤
		int randomNum2 = (int)(Math.random()*100)+1;
		
		//
		while(true) 
		{
			//우승조건 메뉴출력
			System.out.print("우승조건을 입력하세요.(1 or 2 or 99[종료])");
			int winOption = sc.nextInt();
			
			//종료여부 확인
			if(winOption == 99) {System.out.println("99. 프로그램을 종료합니다."); break;}
			
			// 두 개의 숫자를 키보드 입력 (사용자측 숫자)
			System.out.print("1~100사이의 숫자를 입력하새요(1/2)");
			int playerKryNum1 = Rng[sc.nextInt()];
			System.out.print("1~100사이의 숫자를 입력하새요(2/2)");
			int playerKryNum2 = Rng[sc.nextInt()];
			
	
			// 사용자와 컴퓨터의 결과값을 저장한다.
			int random1Player = Math.abs(Rng[playerKryNum1] - Rng[playerKryNum2]);   //  Math.abs() 로 절대값으로 구해준다.
			int random1Com1 =  Math.abs(randomNum1 - randomNum2);
			int random2Player = Math.abs(Rng[playerKryNum1] - Rng[playerKryNum2]);   //  Math.abs() 로 절대값으로 구해준다.
			int random2Com1 =  Math.abs(randomNum1 - randomNum2);
			
			
			// 두 수를 비교해서 우승 출력
			cal(winOption, random1Player, random1Com1, random2Player, random2Com1);
			
			
		}
		
		sc.close();
		
	}
	
	public static void cal(int winOption, int random1Player, int random1Com1, int random2Player, int random2Com1)
	{
		// 우승 타입 생성(player = 1 , com =2)
		byte iType = 1;
		
		if(winOption == 1)
		{
			if(random1Player > random1Com1)
			{
				iType = 2;
			}
			else if(random1Player < random1Com1)
			{
				iType = 1;
			}
			else
			{
				iType = 0;
			}
		}
		else if(winOption == 2)
		{
			if(random2Player > random2Com1)
			{
				iType = 2;
			}
			else if(random2Player < random2Com1)
			{
				iType = 1;
			}
			else
			{
				iType = 0;
			}
		
		}
		// 우승자를 출력한다.
		if(iType == 2) System.out.println("컴퓨터우승");
		else if(iType == 1) System.out.println("사람 우승");
		else System.out.println("무승부입니다.");
	}
	
}
