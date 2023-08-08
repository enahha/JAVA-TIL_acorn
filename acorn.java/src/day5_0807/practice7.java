package day5_0807;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args)
	{
		// 1. 정수 입력
		// 2. 조건
			// -1부터 입력한 수보다 작거나 같아야 한다.
			// 예외사항.((( 가장 먼저 체크해야 한다. ))
				// 2. 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"가 출력 
		// 예외 사항이 발생하면 
			// 다시 사용자가 값을 입력
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		while(true) {
			System.out.print("숫자를 입력하세요 >>>>> ");
			int inNum = sc.nextInt();
			
			if (inNum <= 0) {System.out.println("1이상의 숫자를 입력해주세요"); continue;}
			else 
			{
				for (int i=1; i <= inNum; i++) {System.out.print(i + " ");} 
				stop = true;
			}
			if (stop) break;
		}
		sc.close();
	}
}
