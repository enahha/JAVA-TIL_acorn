package day4_0804;

public class QuickSort_재귀함수 {
	private static void quickSort(int [] array, int low, int high)
	{
		if (low>high)
		{
			return;
		}
		int i = low;
		int j = high;
		int threshold = array[low];
		
		while (i < j)
		{
			while(i < j && array[j] > threshold) { j--; }
			
			if (i < j) {array[i++] = array[j];}
			
			while (i < j && array[i] <= threshold) { i++; }
			
			if (i < j) { array[j--] = array[i]; }
		}
		array[i] = threshold;
		quickSort(array, low, i - 1);
		quickSort(array, i + 1, high);
	}
	

	public static void quickSort(int [] array)
	{
		if(array.length > 0)
		{
			quickSort(array, 0, array.length -1);
		}
	}
	
	public static void main(String[] args)
	{
		int [] scores = {90, 60, 50, 80, 70, 100};
		quickSort(scores);
		for (int i = 0; i < scores.length; i++)
		{
			System.out.print(scores[i] + ",");
		}
	}
}
