package study0817;

public class AudioTvMain {
	public static void main(String[] args) {
		Audio audio = new Audio(true, 20);
		Tv tv = new Tv(false, 10,10);
		
		audio.setVolumn(10);
		audio.tune();
		
		tv.setPower(true);
		tv.watch();
	}
}
