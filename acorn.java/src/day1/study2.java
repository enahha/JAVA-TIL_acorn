package day1;

import java.util.Scanner;

public class study2 {
	public static void main(String[] args) 
	{
		// // Scanner class란..?
		//- 객체를 사용하여 입력값을 받는다. 입력받을 데이터의 타입에 따라 Scanner 클래스의 메서드를 달리한다.
		
		// 객체 생성법 sc는 객체명이다.
		Scanner sc = new Scanner(System.in);
//		System.out.println("국어점수 : >>>>");
//		int kscore = sc.nextInt();
//		System.out.println("영어점수 : >>>>");
//		int Escore = sc.nextInt();
//		System.out.println("수학점수 : >>>>");
//		int Mscore = sc.nextInt();
//		
//		System.out.println("전체 점수의 합:" + (kscore+Escore+Mscore));
		
		//Q1.
		//// 과목별 과락 점수를 지정
		//// 임의의 과목 3개에 대해 각각의 점수를 입력받는다
		//// 모든 점수를 합산
		//// 모든 점수의 평균을 구한다.
		//// 합산 점수의 합격/불합격 여부 결정한다.
		//// 평균 점수의 합격/불합격 여부 결정한다.
		//// 과락 기준 여부에 따른 합격/불합격 여부 결정
		//// 합격 여부 출력 또는 불합격 여부 및 이유 출력
		
		//> 과목별 과락 점수 지정(함수안에서 지정해줬음 >> EachPassScore())
		int sumDropPoint = 240;
		int avgDropPoint = 80;
		int eachDropPoint = 80;
		
		// 합산 , 평균점수 저장
		// int sumpoint = 0;  > 이건 함수안에서해줌
		int avgPoint = 0;
		
		//> 과목별 입력 점수
		System.out.println("국어점수 : >>>>");
		int kScore = sc.nextInt();
		System.out.println("영어점수 : >>>>");
		int eScore = sc.nextInt();
		System.out.println("수학점수 : >>>>");
		int mScore = sc.nextInt();
		
		// 총점 계산
		
		// 평균 계산
		avgPoint = (kScore + eScore + mScore)/ 3;
		
		//> 만들어준 함수를 이용해 합산점수와 평균점수를 구하고 합격/불합격을 나눠줌.
		judgePassTot(kScore,eScore,mScore,sumDropPoint);
		judgePassAvg(avgPoint, avgDropPoint);
		//> 만약 세 점수중 하나라도 기준미달이면 불합격
		EachPassScore(kScore,eScore,mScore, eachDropPoint);
		
		sc.close();
	}
// ---------------------사용 함수-----------------//
		// 평균 합산에 따른 합격여부
//		public static void judgePassTotAndAvg(int kScore, int eScore, int mScore) 
//		{
//			int scoretot = kScore + eScore + mScore;
//			int scoreavg = scoretot / 3;
//			if(scoretot >= 240) System.out.println(scoretot + ": tot 합격입니다."); 
//			else System.out.println(scoretot + ": tot 불합격입니다.");
//			if(scoreavg >= 80) System.out.println(scoreavg + ": avg 합격입니다.");
//			else System.out.println(scoreavg + ": avg 불합격입니다.");
//		}
		// 총점에 따른 합격여부
		public static void judgePassTot(int kScore, int eScore, int mScore, int passLine)
		{
			int scoretot = 0;
			scoretot = kScore + eScore + mScore;
			if(scoretot >= passLine) System.out.println(scoretot + ": tot 합격입니다."); 
			else System.out.println(scoretot + ": tot 불합격입니다.");
		}
		// 평균에 따른 합격여부
		public static void judgePassAvg(int scoreResult, int passLine) 
		{
			if(scoreResult > passLine) System.out.println("합격:평균점수초과");
			else System.out.println("불합격:평균점수미만");	
		}
		
		// 과락에 따른 합격여부
		public static void EachPassScore(int kScore, int eScore, int mScore, int passLine)
		{
			if(kScore>=passLine && eScore>=passLine && mScore>=passLine) System.out.println("drop 합격입니다.");
			else System.out.println("drop 불합격(과목별 과락점수 미달)입니다.");
		}
		
}
