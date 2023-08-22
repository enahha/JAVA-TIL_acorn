package study0821;

import java.util.Scanner;
import java.util.Arrays;

public class SArray_to_iArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    //입력받아서 split으로 나누어 리스트에 저장하기
		System.out.print("배열요소를 입력하세요.");
		String sTargetNum = sc.nextLine();
		String[] sArr = sTargetNum.split(" ");
		
		int[] iFindMaxValArr = new int[sArr.length];
		for(int i=0; i<sArr.length; i++) {
			iFindMaxValArr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(iFindMaxValArr);
		for(int a : iFindMaxValArr) System.out.print(a + " || ");
		
		sc.close();
	}
}
