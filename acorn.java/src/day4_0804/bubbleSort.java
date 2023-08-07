package day4_0804;

public class bubbleSort {
	public static void main(String[] args) 
	{
		int [] scores = { 60, 50, 95, 80, 70 }; 
		sort (scores);
		for (int i = 0; i < scores.length ; i++) 
		{
		System.out .print(scores[i] + "," );
		}
	}
	
	public static void sort(int [] arrays) 
	{
		for(int i = 0; i < arrays.length - 1; i++)
		{
			boolean isSwap = false;
			for (int j = 0; j < arrays.length -i -1;)
			{
				if(arrays[j] > arrays[j + 1])
				{
					int temp = arrays[j];
					arrays[j] = arrays[j + 1];
					
				}
			}
		}
	}
}
