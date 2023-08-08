package day6_0808;

import java.util.Scanner;

public class arrayPractice2 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String[] sArray = new String[5];
		 String sInputMsg = "";
		 
		 // 문자열 값을 저장
		 sArray[0] = "사과";	sArray[1] = "귤";
		 sArray[2] = "포도";	sArray[3] = "복숭아";
		 sArray[4] = "참외";
		 
		 // 배열 인덱스를 활용해서 귤을 출력
		 System.out.println(sArray[1]);
		 
		 System.out.print("좋아하는 과일은?");
		 sInputMsg = sc.nextLine();
		 for(int i = 0; i < sArray.length; i++) {
			 if(sInputMsg.equals(sArray[i])) {System.out.println("당신이 좋아하는 과일 : " + sArray[i]);}
			 else System.out.println(sArray[i] + "은 당신이 좋아하지 않는 과일");
		 }
		 
		 sc.close();
	}
}
