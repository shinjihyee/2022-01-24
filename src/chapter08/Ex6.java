package chapter08;

public class Ex6 {
	// �޼���� ������ ����������
	// �⺻������ �ߺ��ؼ� ������ ���� ����. 
	// ������ ������ Ÿ���� �޶� �̸��� ���� ������ �ߺ� ������ �Ǿ ����� �� ����.
	// �޼���� �޼��� �̸��� ���Ƶ� �Ű������� ������ Ÿ���� �ٸ��� �ߺ����� �Ǵ����� �ʾƼ� ����� �� �ִ�. 
	
	void func() {
		System.out.println("func");
	}
	
	void func (int num) {
		System.out.println("func");
	}
	
	void func (double num) {
		System.out.println("func");
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 1;
	
		Ex6 ex = new Ex6() ;
		
		ex.func();
		
		ex.func(3.14);
	
		ex.func(3);
	
	}
	
	

}
