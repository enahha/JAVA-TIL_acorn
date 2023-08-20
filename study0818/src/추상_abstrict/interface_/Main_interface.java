package 추상_abstrict.interface_;

public class Main_interface {

	public static void main(String[] args) {
		DatabaseModule db = new OracleDataBaseModule();       // 다형성이 적용됨. 타입케스팅이 필요없기 때문에 추상클래스에서 활용이 용이함.
		
		int iRet = db.insert("@@test@@");
		System.out.println(iRet);
		
		System.out.println("===================");
		
		String SRet = db.select();
		System.out.println(SRet);
		
		System.out.println(">>>==>>>>>>>>>==>>>");
		
		System.out.println(DatabaseModule.DB_VERSION);    // DB_VERSION은 static 메소드임 그래서 스테틱으로 들어가야 해서 DatabaseModule을 써준거.
		
		System.out.println("===================");
		
		System.out.println(DatabaseModule.add(1,2));
		
		int iRet2 = db.add(1, 2, 3);    // 동적메소드라 db로 불러온다.
		System.out.println(iRet2);
	}
}
