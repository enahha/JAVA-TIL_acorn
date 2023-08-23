package list_and_map;

import java.util.ArrayList;
import java.util.List;

public class LIstMain01 {

	public static void main(String[] args) {
		// 저장 할 수 있는 데이터 타입 고정
		// 처음애 지정한 사이즈를 변경할 수 없음
		// 데이터 검색에는 최적화되어있지만, 데이터 추가/삭제에는 비효율적

		
		// // List = 동적배열 생성
		List<String> sNames = new ArrayList<String>();
		// // s 리스트 추가
		sNames.add("aa");  // 클래스이기 때문에 . 을 찍고 사용한다.
		sNames.add("bb");
		sNames.add("cc");
		System.out.println(sNames.get(0));  	 // aa
		System.out.println(sNames.get(2));		//cc
		for(int i=0; i<sNames.size(); i++) {
			System.out.println(sNames.get(i));
		} //aabbcc
		
		System.out.println("--------------");
		
		// // s 리스트 삭제
		sNames.remove(0);
		for(int i=0; i<sNames.size(); i++) {
			System.out.println(sNames.get(i));
		} //bbcc
		
		System.out.println("============================");
		// // i 리스트
		List<Integer> iScore = new ArrayList<Integer>();
		iScore.add(1);
		iScore.add(10);
		iScore.add(100);
	}

}
