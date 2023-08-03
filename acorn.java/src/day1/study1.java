package day1;

public class study1 {

	public static void main(String[] args)
	{
		// // 정수  // //
		byte bNumber = 0;
		System.out.println(bNumber);
		
		short sNumber = 0;
		System.out.println(sNumber);

		int iNumber;
		iNumber = 0;
		System.out.println(iNumber);
		
//		sNumber = iNumber;   //오류가 뜸. 이러한 것이 암묵적 변환, 더 큰수의 정수를 더 작은 사이즈의 타입에 넣었을 땐 오류가 뜸
		/*강제 변환(타입 케스팅)*/ sNumber = (short)iNumber;
		
		long lNumber = 0L;  //가장 긴 정수타입
		System.out.println(lNumber);
		
		
		// // 실수  // //
		float fNumber = 0.1F;   System.out.println(fNumber);
		
		// // 문자타입 // //
		char cChar = 'c';		System.out.println(cChar);
		String str = "쌍따옴표를 사용한다.";		System.out.println(str);
		//객체(인스턴스) 객체명  = String str
		
// ----------------------------------------------------
		// // 특수 변수 // //
		byte[] bNumberArr = {1,2,3,4,5};
		System.out.println(bNumberArr.length);   // 이때 lenght는 객체라고 부른다.
		int size = bNumberArr.length;  //이것은 int 타입이므로 이렇게도 가능.
		System.out.println(bNumberArr[4]);   // 대괄호에 배열의 위치를 적어준다
		System.out.println(bNumberArr[size-2]); // 위의 출력과 같은 내용이다.
		
// ----------------------------------------------------
//		// // 조건문 : if(){} else {} / switch-case
//		if(조건식) {}
//		else {}
//		
//		if(조건식) {}
//		else if(조건식){}
//		else {}
		
		//Q1. 1~10까지 짝수인지 홀수인지 판단하고 배수를 출력하라
		
		int[] iNumberArray = {1,2,3,4,5,6,7,8,9,10};
		int iindex = 0;
		if(iNumberArray[iindex] % 2 == 1) {
			System.out.println("홀수");
		}
		else if(iNumberArray[iindex] % 2 ==0) {
			System.out.println("짝수");
			if(iNumberArray[iindex] % 4 == 0) {System.out.println("4의 배수");}
			else if(iNumberArray[iindex] % 6 == 0) {System.out.println("6의 배수");}
			else if(iNumberArray[iindex] % 8 == 0) {System.out.println("8의 배수");}
			else if(iNumberArray[iindex] % 10 == 0) {System.out.println("10의 배수");}
		}
		else if(iNumberArray[iindex] % 3 == 0) {System.out.println("3의 배수");}
		
		else if(iNumberArray[iindex] % 5 == 0) {System.out.println("5의 배수");}
		
		else if(iNumberArray[iindex] % 7 == 0) {System.out.println("7의 배수");}
		
		else if(iNumberArray[iindex] % 9 == 0) {System.out.println("9의 배수");}
		    
		iindex++;		//// 너무 이상하고 긴 코드가 나옴...
		
//		강사님 코드
	//		if(iNumberArr[iIndex] % 1 == 0){
	//		System.out.println("1의 배수");
	//	} else if(iNumberArr[iIndex] % 2  == 0){
	//		System.out.println("even");
	//		if(iNumberArr[iIndex] % 4  == 0){
	//			System.out.println("4의 배수");
	//		} else if(iNumberArr[iIndex] % 6  == 0) {
	//			System.out.println("6의 배수");
	//		} else if(iNumberArr[iIndex] % 8  == 0) {
	//			System.out.println("8의 배수");
	//		} else if(iNumberArr[iIndex] % 10 == 0) {
	//			System.out.println("10의 배수");
	//		} else {
	//			System.out.println("2의 배수");
	//		}			
	//	}
	//	else if(iNumberArr[iIndex] % 3  == 0){
	//		System.out.println("3의 배수");
	//	}
	//	else if(iNumberArr[iIndex] % 5  == 0){
	//		System.out.println("5의 배수");
	//	}
	//	else if(iNumberArr[iIndex] % 7  == 0){
	//		System.out.println("7의 배수");
	//	}
	//	else if(iNumberArr[iIndex] % 9  == 0){
	//		System.out.println("9의 배수");
	//	}
	//	
	//	iIndex++;
		
		// if else 를 사용하면 해당되는 곳에서 코드실행이 멈추지만 한 줄씩 새로 실행시키기위해 if문만 사용할 수도 있다.
		if(iNumberArray[iindex] % 1 == 0) {}
		if(iNumberArray[iindex] % 2 == 0) {}
		//....
		iindex++;
		
// ----------------------------------------------------
		
	}
}

