package study0817;

public class Audio extends AudioTvParent{
	
	public Audio() {}
	public Audio(boolean power, int volumn) {
		super(power, volumn);
	}

	public void tune() {
		String sOnOff = isPower() ? "ha ha ah..." : "turn it on";
			System.out.println(sOnOff);
	}
}
