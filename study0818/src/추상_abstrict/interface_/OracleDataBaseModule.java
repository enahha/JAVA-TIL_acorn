package 추상_abstrict.interface_;

public class OracleDataBaseModule implements DatabaseModule {

	@Override
	public int insert(String s) {
		System.out.println("Oracle Insert" + s);
		return 1;
	}

	@Override
	public String select() {
		String sRet = "Oracle select result";
		return sRet;
	}

}
