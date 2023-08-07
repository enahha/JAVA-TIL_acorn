package day4_0804;

public class min {
	public static void main(String[] args) {

		int [] scores = { 60, 50, 95, 80, 70 };
		int minValue = min(scores);
		System.out.println(minValue);
		
	}
	
	public static int min(int[] arrays)
	{
		int minindex = 0;
		for(int j = 0; j < arrays.length-1; j++)
		{

			if(arrays[minindex] > arrays[j])
			{
				if(arrays[minindex] > arrays[j]) { minindex = j; }
			}
		}
		return arrays[minindex];
	}
}
