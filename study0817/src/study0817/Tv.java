package study0817;

public class Tv extends AudioTvParent{
	
	private int size;
	
	public Tv() {}
	public Tv(boolean power, int volumn, int size) {
		super(power, volumn);
		this.size = size;
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
	
}
