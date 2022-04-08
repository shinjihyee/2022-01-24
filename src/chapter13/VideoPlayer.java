package chapter13;

public class VideoPlayer extends Player{

	@Override
	public void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("동영상을 재생한다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("동영상을 정지한다.");
	}

}
