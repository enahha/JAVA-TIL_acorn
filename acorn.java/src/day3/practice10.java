package day3;

import java.util.Scanner;

public class practice10 {
	public static void main(String[] args)
	{
//		// // ASCII CODE
//		String str = "1234";
//		int iNum01 = str.charAt(0);
//		System.out.println(iNum01);     // 49 출력 (ASCII CODE로 출력되기 때문에)
//		System.out.println((iNum01) - 48);    // 1 출력됨.
//		int iNum02 = str.charAt(1);
//		System.out.println(iNum02);
//		System.out.println((iNum02) - 48);
		
// =======================================		
			
		boolean matchflag = false;
		
		Scanner sc = new Scanner(System.in);
		// 4자리 정수 비밀번호 입력받기
		System.out.print("비밀번호 입력 : ");
		String inputPassword = sc.nextLine();
		
		// 제일 앞자리 수의 값은 1~9 사이 정수(앞자리는 0이 될 수 없다.)
		if(inputPassword.charAt(0) < 48 && inputPassword.charAt(0) > 57)  // ASCII사용
		{
			System.out.println("비밀번호 첫자리가 1~9사이의 값이 아닙니다.");
		}
		else
		{
			// 자리수 판단
			if(inputPassword.length() == 4)
			{
				// 중복체크
				for(int i = 1; i<inputPassword.length(); i++)  // 첫번째 값은 중복될 일이 없기 때문에 1부터 가져온다.
				{
					for(int j = i-0; j>=0; j--)
					{
						if(inputPassword.charAt(i) == inputPassword.charAt(j))
						{
							matchflag= true;
							break;
						}
					}
					if(matchflag) { System.out.println("일치하는 값이 있습니다."); break; }
				}
				// for문을 중복해서 사용하는식으로 중복체크하는 것은 추천하지 않음
			}
			else
			{
				System.out.println("비밀번호가 정해진 자리수에 부하지 않습니다.");
			}
		}
		
		// 입력받은 정수 각 자리 수에 중복되는 값이 없을 경우 '생성 성공'
		// 중복 값이 있으면 '중복 값 있음' and 자리수가 안 맞으면 '자리 수 안 맞음'
		
		sc.close();
		
	}
}
