package list_and_map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		// map객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 데이터 삽입
		map.put("seoul", 5000);
		map.put("newyork", 2000);
		map.put("england", 1000);
		
		// 데이터 꺼내오기
		map.get("seoul");   // 5000
		System.out.println(map.get("seoul"));
		for(String x : map.keySet()) {
			System.out.println(map.get(x));   // 5000/n2000/n1000
		}
		
		// 사이즈
		int size = map.size();		//3
		System.out.println(size);
		
		// 데이터 키값으로 지우기
		map.remove("england");
		for(String x : map.keySet()) {
			System.out.println(map.get(x));		//5000/n2000
		}
		
		// 맵 데이터 모두 지우기
		map.clear();
		
	}
}
