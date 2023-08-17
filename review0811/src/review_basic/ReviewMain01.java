package review_basic;

import java.util.Scanner;

public class ReviewMain01 {
	public static void main(String[] args) {
		// 입력된 네 개의 수가 있다.
		// 두 개는 실수, 두 개는 정수
		// 네 수를 검사해서 5보다 작은 수를 출력
		Scanner sc = new Scanner(System.in);
		
		int iType = 0;
		
		System.out.print("1. 정수 / 2. 실수 : ");
		iType = sc.nextInt();
		
		keyResult(sc, iType);
				
	}
	//키 입력 처리 함수
	public static void keyResult (Scanner sc, int iType) {		
		if (iType == 1) {
			int ia;
			int ib;
			int ic;
			
			System.out.print("입력1.");
			ia = sc.nextInt();
			System.out.print("입력2.");
			ib = sc.nextInt();
			System.out.print("입력3.");
			ic = sc.nextInt();
			
			if(ia<5) {System.out.println(ia);}
			else if(ib<5) {System.out.println(ib);}
			else if(ic<5) {System.out.println(ic);}
			else {System.out.println("nonnne");}
		}
		if (iType ==2) {
			double da;
			double db;
			double dc;
			
			System.out.print("입력1.");
			da = sc.nextDouble();
			System.out.print("입력2.");
			db = sc.nextDouble();
			System.out.print("입력3.");
			dc = sc.nextDouble();
			
			if(da<5) {System.out.println(da);}
			else if(db<5) {System.out.println(db);}
			else if(dc<5) {System.out.println(dc);}
			else {System.out.println("nonnne");}

		} else System.out.println("정해진 타입아님.");
	}
}