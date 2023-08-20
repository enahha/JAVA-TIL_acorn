package study0817;

public class Tv extends AudioTvParent{
	
	private int size;
	private boolean power1;     // 오버라이딩용 필드
	
	public Tv() {}
	public Tv(boolean power, int volumn, int size) {
		super(power, volumn);
		this.size = size;
		this.power1 = true;     // 오버라이딩용 생성자
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void watch() {
		String sOnOff = isPower() ? "Have fun" : "Switch on";
			System.out.println(sOnOff);
	}
	// 메서드 오버로딩
	// // 들어가는 인자에 따라 호출되는 (동일이름을 가진)함수가 달라진다. 
	public void watch(int count) {
		System.out.println("count : " + count );
	}
	
	
	@Override
	public boolean isPower() {return power1;}
	// override : 부모와 자긷이 동일한 이름의 메소드를 가지고 있다면 자식클래스 > 부모클래스
}
