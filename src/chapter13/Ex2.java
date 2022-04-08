package chapter13;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이 프로그램의 동작 원리를 파악하세요.
		Player player = new AudioPlay ();
		player.play(0);
		
		player = new VideoPlayer ();
		player.play(0);
		
		
		
//		AudioPlay ap = new AudioPlay ();
//		ap.play(0);
//		ap.stop();
//		ap.volUp();
//		
//		VideoPlayer vp = new VideoPlayer ();
//		vp.play(0);
//		vp.stop();
//		vp.volUp();
	}

}
