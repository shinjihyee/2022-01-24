package chapter14;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub	
		// �� ���α׷��� ���ܰ� �߻��ϴ� ���α׷��Դϴ�. 
		// ���ܰ� ���� �߻��ϴ��� ã��
		// ���ܰ� �߻����� �ʵ��� ó���غ����� 
		Scanner scanf = new Scanner (System.in);
		
		int [] arr = {3,2,1};
		// 3,2,1�� ����ִ� �迭�� �ִ�. 
		
		System.out.println("�ε��� ��ȣ >>");
		int index = scanf.nextInt();
		// �ε��� ��ȣ�� �޴� �κ�
		
		
		try {	
			System.out.println("arr[" + index + "]=" + arr[index]);
			}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("�ε��� ��ȣ�� �߸��Ǿ����ϴ�.");} 



		
	}

}
