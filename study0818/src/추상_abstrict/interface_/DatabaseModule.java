package 추상_abstrict.interface_;

// 자바 버전에 따른 변화
// 1. jdk 7
//- public static final 필드(상수필드)
//- public abstract 메서드(추상메서드)
//1.  JDK 8
//- public static final 필드(상수필드)
//- public abstract 메서드(추상메서드)
//- public default 메서드
//- public static  메서드
//3. JDK 9 
//- public static final 필드(상수필드)
//- public abstract 메서드(추상메서드)
//- public default 메서드
//- public static  메서드
//-private static 메서드

public interface DatabaseModule {
	// public static final int DB_VERSION = 1;  와 같은 말임.
	int DB_VERSION = 1;
	
	// 추상메소드
	int insert(String s);    // public abstract int insert(String s)
	
	String select();		// public abstract String select()
	
	public static int add(int a, int b) {    
//		int iRet = a + b;
		int iRet = subAdd(a,b);
		return iRet;
	}
	
	default int add(int a, int b, int c) {
		int iRet = a + b + c;
		return iRet;
	}
	
	// jdk9 이상부터 사용가능
	private static int subAdd(int a, int b) {    // Private Method 가 쓰일 수 있는 곳은 default method, static method, private method 뿐입니다.
		return a + b;
	}
}
