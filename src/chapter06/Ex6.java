package chapter06;

import java.util.Random;

public class Ex6 {

	
	// ��ǥ ü�߿� ������ ������ ��� �Ѵ�. 
	// ���� ü���� ��ǥü�߿� �����߳��� ? (���ǽ�) �ڸ��� �����ڴ� <= ���Ϸ� ���������� 
	
	// ���� �ΰ��� ���� �� �ִ� (����  ü��, ��ǥü��) 
	
	//������ ����ؼ� ���� ���ڰ� ���� �븶�� ��� �ؼ� ���� ���ڰ� ��������
	
	Random random = new Random();
	
	
	int myWeight = 100; 
	int goalWeight = 70; 
	int loseWeight;
	
	while (myWeight >= goalWeight ) {
		System.out.println("��� �Ѵ�. ");
		
		// ��� �ؼ� ���� ������ 
		loseWeight = random.nextInt(6);
		
		// ��� �ϰ� �� �� ���� ���� ü���� ��� 
		myWeight = myWeight- loseWeight; 
		
		//���� �����Կ� �󸶳� ��Ű�ξ� �������� �𸣴ϱ� 
		// ������ �ϸ鼭 �ٲ���� 
		
		
	}
}
}