package chapter08;

public class Object5 {
	
	
	// �� ������ ���� �޾� �� ���� �� ū ���� ȣ���� ������ �ǵ����ִ� �޼���
	int big (int num1, int num2) {
		if (num1 >= num2) {
			return num1; 
		} else {
			return num2;
		}
	}
	
	// �ϳ��� ������ ���� �޾� 
	// �� ���� ¦����� ¦�� 
	// Ȧ����� Ȧ�� 
	// ȣ���� ������ �ǵ����ִ� �޼��� 
	
	
	String num (int su) {
		if (su % 2==0) {
			return "¦��";
		}
		else { return "Ȧ��" ; }
	}
		
	int comp (int su) { 
		return su; 
	}
	
	

	
//	void sum () {
//		System.out.println(1+1);
//	
//	}
//	
//	
//	// �޼����� ��ȯŸ���� void�� �ƴϸ�
//	// ��ȯŸ���� �ִ� �޼����� ǥ��
//	
//	// ��ȯŸ�� : �޼��带 ȣ���ϸ� ��ȯ Ÿ�԰� ��ġ�ϴ� Ÿ���� �����Ͱ� ��ȯ�ȴ�. 
//	int sum2 () {return 3;  
//	}
//	
//	double sum3 () {
//		return 12.3;
//	}
	

	}
