package chapter13;


// �߻� Ŭ���� : �θ� Ŭ������ �����Ѵ�. 
// �߻� Ŭ������ �θ�� ��� �ڽ� Ŭ������
// �߻� Ŭ������ ����� �߻� �޼��带 �ݵ�� �����ؾߵȴ�.
// �÷��̾��� Ŭ������ XX ����� Ŭ������ �θ�Ŭ���� ������ �� ���̴�.
// ���������, ������ �����, ... 
public abstract class Player {
	public abstract void play (int pos);
	public abstract void stop ();
	
	public void volUp() {
		System.out.println("������ �ø��ϴ�.")
	}	
}
