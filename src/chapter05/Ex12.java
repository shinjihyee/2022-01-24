package chapter05;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner (System.in);
		
		System.out.print("����� ������>>");
		double weight = scanf.nextDouble();
		System.out.print("����� Ű>>");
		double height = scanf.nextDouble();
		
		double BMI = (weight/ (height)) * 10000;
		
		System.out.println("����� BMI�� " + BMI + "�Դϴ�.");
		
		// ȿ������ ���α׷��̶�� �� ������ ����Ƚ���� ���� ���α׷��� �ƴ϶� 
		// ����Ƚ���� ���� ���α׷��� ������ ������ ���α׷��� 
		if (BMI < 18.5) {
			System.out.println("��ü��");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("����");
		} else if (BMI >= 23 && BMI < 25 ) {
			System.out.println("��ü�� �ǽ�");
		} else if (BMI >= 25 && BMI >= 30) {
			System.out.println("�����" + "��" + " �Դϴ�");
			
		} else if (BMI >= 30) {
			System.out.println("�� ��");
		}
	}

}
 
// ����� ~ �Դϴٰ� �ǵ��� ������¸� �ٲټ��� 
// if�� ���� print�� ����Ͽ��� ("�����")
// if�� �Ʒ� print�� ����Ͽ� ("�Դϴ�")