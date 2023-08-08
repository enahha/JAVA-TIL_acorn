package day5_0807;

import java.util.Scanner;

public class practice4_switch문 {
	public static void main(String[] args)
	{
		// // 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력 // //
		// 1~12 사이의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int monthNum = sc.nextInt();
		
		// 공백 문자열로 계절이 들어올 변수 설정
		String monthString = "";
		
		// switch/ case문으로 작성
		switch (monthNum) {
		case 1: {monthString = "January"; break;}
		case 2: {monthString = "February"; break;}
		case 3: {monthString = "March"; break;}
		case 4: {monthString = "April"; break;}
		case 5: {monthString = "May"; break;}
		case 6: {monthString = "June"; break;}
		case 7: {monthString = "July"; break;}
		case 8: {monthString = "August"; break;}
		case 9: {monthString = "September"; break;}
		case 10: {monthString = "October"; break;}
		case 11: {monthString = "November"; break;}
		case 12: {monthString = "December"; break;}
		default:
			monthString = "Invalid month";
            break;
		}
//		switch (monthNum) {
//		case 1:
//		case 2:
//		case 3:
//		case 4: {System.out.println("봄입니다."); break;}
//		case 5: 
//		case 6: 
//		case 7: 
//		case 8: {System.out.println("여름입니다."); break;}
//		case 9: 
//		case 10:
//		case 11:
//		case 12: {System.out.println("겨울입니다."); break;}
//		default:
//			monthString = "Invalid month";
//            break;
//		}
		
		// 변수 monthString 출력
		System.out.println(monthString);
		
		sc.close();
	}
}
