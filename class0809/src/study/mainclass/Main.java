package study.mainclass;

import java.util.Scanner;

import study.maintosub.Add;
import study.maintosub.Div;
import study.maintosub.Mul;
import study.maintosub.Sub;

public class Main {
	public static void main(String[] args) {
		// // 필드 영역 // //
		Scanner sc = new Scanner(System.in);
		// 공통 부분
		System.out.print("메뉴입력(1. 더하기 / 2. 빼기 / 3. 곱하기/ 4. 나누기) >>>> ");
		int menuNum = sc.nextInt();

		int firstNum = 0; int secoundNum = 0;
		System.out.print("숫자를 입력하세요 (1/2) >>> ");
		firstNum = sc.nextInt();
		System.out.print("숫자를 입력하세요 (2/2) >>> ");
		secoundNum = sc.nextInt();
		
		// 결과 저장 부분
			//더하기, 빼기, 곱하기, 나누기등
//		int iAddResult = 0;
//		int iSubResult = 0;
//		int iMulResult = 0;
//		int iDivResult = 0;
		
		// // 오퍼레이션 영역 // //   ===>> 정적 메소드 사용
		if(menuNum == 1) {
		int addResultValue = Add.addOperationStat(firstNum, secoundNum);
		System.out.println("결과 ____" + addResultValue);
		} 
		else if(menuNum == 2) {
		int subResultValue = Sub.sudOperationStat(firstNum, secoundNum);
		System.out.println("결과 ____" + subResultValue);
		}
		else if(menuNum == 3) {
		int mulResultValue = Mul.sudOperationStat(firstNum, secoundNum);
		System.out.println("결과 ____" + mulResultValue);
		}
		else if(menuNum == 4) {
//		Div div = new Div();  //객체 생성해서 하는 거는 동적 메소드 , 근데 스테틱은 전역 같은 느낌 그래서 이렇게 생성해서 쓰면 오류가 남.쓸려면 static 지우기.
		Div.divOperationStat(firstNum, secoundNum);
		}else {}
		sc.close();
		}
		
//		public static int addOperation(int numOne, int numTwo) {
//			int iAddResult = 0;
//			iAddResult = numOne + numTwo;
//			return iAddResult;
//		}
		
//		public static int sudOperation(int numOne, int numTwo) {
//			int iSubResult = 0;
//			iSubResult = numOne + numTwo;
//			return iSubResult;
//		}
		
//		public static int mulOperation(int numOne, int numTwo) {
//			int iMulResult = 0;
//			iMulResult = numOne + numTwo;
//			return iMulResult;
//		}
		
//		public static void divOperation(int numOne, int numTwo) {
//			int iDivResult = 0;
//			if(numOne == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과 0임");}
//			else if(numTwo == 0) {iDivResult = 0;System.out.println("분모가 0이므로 연산불가");}
//			else {iDivResult = numOne / numTwo; System.out.println("결과 ____" + iDivResult);}
//		}
	
}
