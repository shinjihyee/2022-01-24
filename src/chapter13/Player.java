package chapter13;


// 추상 클래스 : 부모 클래스로 동작한다. 
// 추상 클래스를 부모로 삼는 자식 클래스는
// 추상 클래스에 선언된 추상 메서드를 반드시 구현해야된다.
// 플레이어라는 클래스는 XX 재생기 클래스의 부모클래스 역할을 할 것이다.
// 음악재생기, 동영상 재생기, ... 
public abstract class Player {
	public abstract void play (int pos);
	public abstract void stop ();
	
	public void volUp() {
		System.out.println("볼륨을 올립니다.")
	}	
}
