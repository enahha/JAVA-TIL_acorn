package day4_0804;

public class max {
	public static void main(String[] args) {

		int [] scores = { 60, 50, 95, 80, 70 };

		int maxValue = max (scores);

		System.out.println("Max Value = " + maxValue);

	}

		public static int max(int [] arrays) {

		// Maximum initialization value is 0

		for (int i = 0; i < arrays.length - 1; i++) {

			if (arrays[i] > arrays[i + 1]) { // swap
	
				int temp = arrays[i];
		
				arrays[i] = arrays[i + 1];     // i 를 i+1의 자리로
		
				arrays[i + 1] = temp;}    // i+1을 temp(i) 의 자리로;
		}

		int maxValue = arrays[arrays.length - 1];    // 총 길이는 5니까 4번인덱스(마지막인덱스)를 반환하려면 -1을 해주어야함. 

		return maxValue;

	}
}
