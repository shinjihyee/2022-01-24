package chapter06;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڿ��� ���ڿ��� �Է� �޾� ������ �����ϰ�
		
		// ����ڰ� �Է��� ���ڿ��� ó������ ������ 
		//���� �ϳ��� �����ؼ�
		
		//����ڰ� �Է��� ���ڿ��� n(char n)��° ���ڰ�
		// �빮�ڸ� �ҹ��ڷ�
		// �ҹ��ڸ� �빮�ڷ� 
		// ��ȯ�ϴ� ���α׷��� �����ϼ���. 
		
		Scanner scanf = new Scanner (System.in);
		System.out.println("���ڿ��� �Է��ϼ��� -> ");
		
		String str = scanf.next(); 
		
		
		for (int i=0; i<=str.length(); i++) { 
			char n = str.charAt(i); 
			
			//n��° ���ڰ� �빮���ΰ���?
			if (n >= 'A' && n <= 'Z') {
				// �빮�ڸ� �ҹ��ڷ� �ٲٴ� ����
				n = (char)  (n +  32); // 32�� int Ÿ���� �����̰� n�� char Ÿ���� �����̱� ������ 
				// ����� ����ȯ �ϰ� ������ ���� ���� ������ϰ�
				//char�� �տ� ���̸� n�� ���ؼ� 32�� ���ض� �Ǽ� �ȵȴ�
				// �׷��� ������� ����ȯ �� �� (������ ����) (��� ��) 
				
				
		}	// n��° ���ڰ� �ҹ��� �ΰ���?
			else if (n >= 'a' && n <= 'z' ) {
			n = (char) (n - 32);
			// �ҹ��ڸ� �빮�ڷ� �ٲٴ� ����
		}
		
		
	}
	}

}
