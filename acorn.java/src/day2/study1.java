package day2;

public class study1 {
	
	public static void main(String[] args) 
	{
		//JAVA 1
		//JAVA 2
		//JAVA 3
		
		System.out.println("JAVA 1 출력");
		System.out.println("JAVA 2 출력");
		System.out.println("JAVA 3 출력");
		
		//for문 JAVA + "일련번호" 출력
//		for (int i = 0; i < 3; i++)
//		{
//			System.out.println("JAVA " + (i+1));
//		}
		
		////////
		int[] iCountArr = {3, 4, 2, 2, 5, 6};
		////////
		
		char[] cInfoArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};    // '' => 문자는 이걸 사용해야함 || "" => 이건 문자열
		
		for (int i = 0; i < iCountArr.length; i++)
		{
			
			for (int j = 0; j < iCountArr[i]; j++)        // ? > 인덱스의 값을 어떻게 가져오나? 
			{
				System.out.print(cInfoArr[j]);
			}
			System.out.println();
		}
		
		// iCountArr의 인덱스값 만큼 출력하고 다음 출력은 앞 출력값의 끝지점에서 출력하는 for문을 만들어라.
		char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 't', 'w', 'x', 'd', 'e', 'w', 'j'};
		
		int iStartIndex = 0;
		
		for (int i = 0; i < iCountArr.length; i++) 
		{
			for (int j = iStartIndex; j < (iCountArr[i] + iStartIndex); j++)
			{
				System.out.print(charArr[j]);
			}
			System.out.println();
			
			iStartIndex = iStartIndex + iCountArr[i]; 
			
		}
	}
}
