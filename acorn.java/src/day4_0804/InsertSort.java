package day4_0804;

public class InsertSort {
	public static void main(String[] args)
	{
		int [] scores = { 80, 70, 60, 50, 95};
		sort (scores);
		for (int score : scores)    // for score in scores(python)랑 똑같은 말이다.
		{
			System.out.print(score + ",");
		}
	}
	
	public static void sort(int [] arrays) {
		for (int i = 1; i < arrays.length; i++)
		{
			int insertElement = arrays[i];
			int insertPosition = i;
			
			for (int j = insertPosition - 1; j >= 0; j--)
			{
				if(insertElement < arrays[j])
				{
					arrays[j + 1] = arrays[j];
					insertPosition--;
				}
				else
				{
					break;
				}
			}
			arrays[insertPosition] = insertElement;
		}
	}

}
