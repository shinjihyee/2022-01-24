package chapter08;

public class Object3 {

	
	// �Ű������� ? : �� �޼��带 ȣ���� �� �ݵ�� �����ؾ��ϴ� ���� Ÿ�԰� ������ ��Ÿ��.
	
		void printLines1() {	
			// �̰��� ���� �������� �ʾƾ��Ѵ�. 
			// �Ű������� ����ִ� �޼���
			System.out.println("printLines1 �޼��� ȣ��");
		}
		
		void printLines2(int n) {	
			// printLines2 �޼����
			// �Ű������� �ϳ� ¥���� �޼��带 ȣ���� ���� ���� �ϳ��� ȣ���ؾߵȴٶ�� ������ �� ��. 
			System.out.println("printLines2 �޼��� ȣ��");
			System.out.println("�Ű� ���� n = " + n );
		}
		
		void printLines3(double n) {
			// printLines3 �޼����
			// �Ű������� �ϳ� ¥���� �޼��带 ȣ���� ���� �Ǽ� �ϳ��� ȣ���ؾߵȴٶ�� ������ �� ��. 
			System.out.println("printLines. �޼��� ȣ��");
			System.out.println("�Ű� ���� n = " + n );
		}
		
		void printLines4(int x, int y) { 
			// printLines4 �޼����
			// �Ű������� �ΰ�¥���� �޼��带 ȣ���� ���� ���� �ΰ��� ȣ���ؾߵȴٶ�� ������ �� ��. 
			System.out.println("printLines4�޼��� ȣ��");
			System.out.println("�Ű� ���� x = " + x );
			System.out.println("�Ű� ���� y = " + y );
		}
}
