package chapter06;

import java.util.Random;

public class Ex4 {

	public static void main (String[] args) {
	
		// ���� 1� ��÷�� ������ ������ �ݺ����� ���.
		// 1 ~ 6����� �ִ� ���� / ��÷�� ����. 
		// �׷� 1 ~ 6����� �ְ� ��÷�� �ֱ⿡ �� 7���� ���� �ִ� 
		
		// ������ ���� ���̱� ������ ���� ���̺귯�� ���
		
		Random random = new Random();
		
		// ������ �缭 ��÷�� ����� �����ϴ� ���� 
		// ������ ���� �� random.nextInt�� ������ ��ٴ� ���� �ȴ�.
		 int rank = random.nextInt(7) + 1;
		// 1~7��  ���̸� �������� �̾ƴ޶� 
		
		// ��÷�� ����� != (�ƴ϶��) 1���� �ƴ϶��
		// 
		while (true) {
			rank = random.nextInt(7) + 1; // ������ �缭 ��÷�� ����� �����ϰ� �ƴϸ� �� ����� ���� �ƴ϶�� ������ �ϰ� (sysout ��/�Ʒ� ���xx)
			// �̰� ��÷�� ��ٴ� �Ŵϱ� ������ �־������ ������ ���� ��� 
			System.out.println("������ ���. ");
			System.out.println(rank);
			
			
			if(rank == 1) {
				break;
			}
		}
	}
}
