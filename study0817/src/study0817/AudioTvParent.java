package study0817;

public class AudioTvParent {
	
	private boolean power;
	private int volumn;
	
	public AudioTvParent() {}
	public AudioTvParent(boolean power, int volumn) {
		this.power = power;
		this.volumn = volumn;
	}
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
}
