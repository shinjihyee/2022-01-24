package chapter06;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int [] numberList{5,4,6,7,8}
		 * 
		 * sysout(numberList[0])
		 * .
		 * .
		 * .
		 * for �ݺ������� �ٲټ���
		 */
		
		// ó���� �ʱ�� ���ǽ� �������� �𸣴ϱ� 
		// ���� ó������ �� �װ� ����xxx ���� ���ߴ� ��ó�� �ƴ°ź����ϸ��
		
//		int[] numberList = {5,4,3,2,1};
//		
//		for (int index = 0; index <= 4; index++) {
//			System.out.println(numberList[index]);
//		}
//		
//		// �迭�� ���� �þ�� ��õ���� ������ �� ���� �����
//		//�迭�� ���̸� ������� 0���� �����ϴϱ� ���� -1
//		// numberList(�迭�ȿ�).length��� ��� ������ ���ؼ� ����Ҽ��ִ�
//		// �̸� �̴ϱ� index<numberList.length 
//		// �ε��� �ȿ� ���� ���� -1�̴ϱ�
		
		//ageArray �ȿ��� �� �л��� ���̰� ����ֽ��ϴ�.
		// �� �л��� ��� ���̸� ����� ����ϴ� ���α׷��� �����ϼ���. 
		
	
		
		

		
		int [] ageArray = {21,21,23,22};
		// ��� ���̸� �����ҷ��� ������ �հ谡 �ʿ���
		// (����� �����ҷ��� �հ谡 �ʿ��ϴ�)
		
		// �� �ܰ踦 �� ����ؾ���
			 
		int totalAge = ageArray[0] + ageArray[1] + ageArray[2] +ageArray[3] ;
		
		// ���η� Ǯ�����ִ� �迭�� �հ� ����
		// ���η� �ٲٸ� 
		
		totalAge = ageArray[0];
		tatalAge = totalAge + ageArray[0];
		tatalAge = totalAge + ageArray[1];
		tatalAge = totalAge + ageArray[2];
		tatalAge = totalAge + ageArray[3];

		
		for (int i = 0; i<=3; i++) {
			System.out.println(totalAge = totalAge + ageArray[i]);
		}	
		// �հ踦 Ȱ���ؼ� ��� ���� ���
		double averageAge = (double) totalAge/ageArray.length;
		
		System.out.println("��� ���̴� :" + averageAge);
		
	}
		
	

}
