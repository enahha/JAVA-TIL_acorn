package day5_0807;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args)
	{
		// scanner
		Scanner sc = new Scanner(System.in);
		// 정수를 입력하세요
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 양수가 아니면 "양수만 입력해 주세요."
		// 입력받은 정수가 짝수이면 "짝수", 홀수이면 "홀수", 
		if(num <= 0) {
			System.out.println("양수만 입력해 주세요.");
		}else {
			if (num % 2 == 0) {
				System.out.println("짝수");
			}
			else{
				System.out.println("홀수");
			}
		}
		
		sc.close();
	}
}
