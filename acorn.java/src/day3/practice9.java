package day3;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args)
	{
		// do ~ while문을 사용해 1을 입력시 다시입력, 0을 입력시 프로그램 종료를 하게 만들었다.
		// boolean을 이용해 flag의 초기값을 false로 정의하였다. 만약 flag가 true가 되면 while 문에서 참 혹은 거짓을 받아 실행한다.
		// do~while문에 대한 이해가 더 필요할거같다.
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("중간고사 점수 입력 : ");
			int midterm = sc.nextInt();
			System.out.print("기말고사 점수 입력 : ");
			int finalterm = sc.nextInt();
			System.out.print("과제점수 입력 : ");
			int task = sc.nextInt();
			System.out.print("출석회수 입력 : ");
			int attend = sc.nextInt();
			
			// 출석비율 계산 20회중 출석한 날  30%이상 결석 fail
			if(attend <= 20) 
			{
				if(attend <= 20 * 0.3) {System.out.println("결석률 30%이하입니다. 재수강하세요.");}
			}else 
			{
				System.out.println("출석회수는 20회 미만으로 입력해야 합니다.");
				System.out.println("Enter 1 for go Back or 0 for program-end.");
				byte input = sc.nextByte();
				if(input == 1) {flag=true;} else {flag=false; System.out.println("program-end.");}
			}

			// 평가 점수 계산 (비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%)
			Double assesmentTot = (midterm * 0.2) + (finalterm * 0.3) + (task * 0.3) + (attend * 0.2);
			
			// 평가 점수 70점 이상 pass, 이하 fail or 출석률 30%이상 결석시 fail
			if(assesmentTot>=70) 
			{System.out.println("통과");}
			
		}while(flag);
		sc.close();
	}
}
