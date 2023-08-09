package study.mainclass;

import java.util.Scanner;

import study.maintosub.Add;
import study.maintosub.Div;
import study.maintosub.Mul;
import study.maintosub.Sub;

public class Main2 {
	public static void main(String[] args) {
		// // 필드 영역 // //
		Scanner sc = new Scanner(System.in);
		// 공통 부분
//		System.out.print("메뉴입력(1. 더하기 / 2. 빼기 / 3. 곱하기/ 4. 나누기) >>>> ");
//		int menuNum = sc.nextInt();

		String firstNum = ""; String secoundNum = "";
		System.out.print("숫자를 입력하세요 (1/2) >>> ");
		firstNum = sc.nextLine();     // 값을 문자로 받는다.
		System.out.print("숫자를 입력하세요 (2/2) >>> ");
		secoundNum = sc.nextLine();
		
		// 문자를 int와 double타입으로 바꿔준다. (형변환)
//		int iFirstNum = Integer.parseInt(firstNum);
//		int iSecoundNum =Integer.parseInt(secoundNum);	
		
		double dfirstNum = Double.parseDouble(firstNum);
		double dSecoundNum = Double.parseDouble(secoundNum);
		
		
		// 결과 저장 부분
			//더하기, 빼기, 곱하기, 나누기등
//		int iAddResult = 0;
//		int iSubResult = 0;
//		int iMulResult = 0;
//		int iDivResult = 0;
		
		// // 오퍼레이션 영역 // //  ==>>  동적메소드 사용
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

//		if(menuNum == 1) {
			String addResult = String.valueOf(add.addOperation(dfirstNum, dSecoundNum));
			System.out.println("결과 ____" + addResult);
//		} 
//		else if(menuNum == 2) {
			String subResultValue = String.valueOf(sub.sudOperation(dfirstNum, dSecoundNum));
			System.out.println("결과 ____" + subResultValue);
//		}
//		else if(menuNum == 3) {
			String mulResultValue = String.valueOf(mul.sudOperation(dfirstNum, dSecoundNum));
			System.out.println("결과 ____" + mulResultValue);
//		}
//		else if(menuNum == 4) {
			  //객체 생성해서 하는 거는 동적 메소드 , 근데 스테틱은 전역 같은 느낌 그래서 이렇게 생성해서 쓰면 오류가 남.쓸려면 static 지우기.
			div.divOperation(dfirstNum, dSecoundNum);
//		}else {}
			
		sc.close();
		}
}
