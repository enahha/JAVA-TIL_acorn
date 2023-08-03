package day2;

import java.util.Scanner;

public class 연산연습 {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{	
			System.out.print("인원수를 입력하세요 : ");
			int people = sc.nextInt();
			System.out.print("사탕개수를 입력하세요 : ");
			int candyNum = sc.nextInt();
			
			if(candyNum < people) {System.out.println("사탕의 개수가 인원수 보다 작습니다. 다시 입력하세요."); break;}
			
			float result = candyNum / people;
			int resultB = candyNum % people;
			
			int peopleOne = (int)result;
			System.out.println("1인당 사탕개수 : " + peopleOne + "  남은 사탕 : " + resultB);
		}
		sc.close();
	}	
}
