package chapter08;

public class Calculator {

	// �޼��� ȣ���ϴ� �ڵ带 ������ ��ǻ�Ͱ� �޼��� ������ ������ �Ǹ�
	// �޸� �ȿ� (RAM ) �޼����� ������ �����. 
	double study1 (int kor, int Eng, int math) { 
		int total = kor + Eng + math; 
		
		double avg = (double) total/3;
		
		return avg;
		
}

	
	
	
	void swap (int num1, int num2 ) { 
		int temp = num1;
		num1 = num2 ; 
		num2 = temp;
	}
	
	public static void main (String[] args ) {
		Calculator cal = new Calculator (); 
		
		int num1 = 10; 
		int num2 = 20; 
		
		cal.swap(num1, num2);
		
		// �� ���α׷��� ���� ������ �޸𸮿� �׷��� �ľ��ϼ��� 
		// Calculator �޼��忡�� swap �޼��常 �ִٰ� �����ϸ鼭 �ľ��ϸ� �ȴ�. 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main (String[] args) {
//		Calculator cal = new Calculator();
//		
//		cal.study1(85, 87, 90); // �Է��� ���� ó���� �ְ� ���߿��� ���� ���� ������� �ڸ��� �´�
//		
//	}
	
	
	
}
