package module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 이중hashMap {

	public static void main(String[] args) {
		// 일반변수: 데이터타입 변수 = 값
		// 특수변수: 데이터타입[] 배열명 = new 데이터타입[사이즈]
		//   요소1 요소2 요소3.... 요소N
		//   배열명[위치값]
		//   배열의 문제점: 저장할 수 있는 데이터 타입이 한 가지 -> 다형성
		//                  배열의 사이즈가 고정 -> List, HashMap
		// 리스트: public interface List<E>
		// public class ArrayList<E> implements List: 동적 배열
		// E: 객체만
		// String sValue; ArrayList<String> -> O
		// int, double: ArrayList<int> -> X -> ArrayList<Integer>: Wrapper 클래스
		List<String> objStrList1 = new ArrayList<String>(); // 다형성
//		System.out.println(objStrList.size());
		objStrList1.add("str1");  objStrList1.add("str2");
		for(int i = 0; i < objStrList1.size(); i++) { /*System.out.println(objStrList1.get(i));*/ }
		// 맵: public interface Map<K, V>
		// public class HashMap<K,V> implements Map<K,V>
		Map<String, String> objStrMap1 = new HashMap<String, String>();
//		System.out.println(objStrMap1.size());
		objStrMap1.put("서울", "홍길동"); objStrMap1.put("대전", "허균");
//		System.out.println(objStrMap1.get("서울"));

		
		// hashmap안에 hashmap을 넣어주는 법
		ArrayList<HashMap<Integer, String>> objStrList2 = 
				new ArrayList<HashMap<Integer, String>>();
		HashMap<Integer, String> objStrMap2 = new HashMap<Integer, String>();
		HashMap<Integer, String> objStrMap3 = new HashMap<Integer, String>();
		objStrMap2.put(1, "홍길동1"); objStrMap2.put(2, "홍길동2"); objStrMap2.put(3, "홍길동3"); 
		objStrMap3.put(1, "허균1"); objStrMap3.put(2, "허균2"); objStrMap3.put(3, "허균3");
		
		objStrList2.add(objStrMap2); 
		objStrList2.add(objStrMap3); 
		
		for(int i = 0; i < objStrList2.size(); i++) {
			System.out.println(objStrList2.get(i));
			
			for(int j = 1; j<=objStrList2.get(i).size(); j++) {
			System.out.println(objStrList2.get(i).get(j));
			}
		}

	}
}
