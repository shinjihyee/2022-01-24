package chapter06;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = " apple"; 
		
		System.out.println("���ڿ��� ���̴� 5�� �Դϴ�. ");
		
		str.length();
		int strLength = str.length();
		System.out.println("�� ���ڿ��� ���̴�" + str.length()+ "�� �Դϴ�.");
		
		// �� ���ڿ��� ù�� ° ���ں��� ������ �L���� �ϳ��� �̾Ƽ� ����ϼ���.
		
//		char firstChar = str.length(0);
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5));
		
		for (int i=0; i<=4; i++) { 
			System.out.println(str.charAt(i));
		}
		// ó������ ������ ���� ���ڿ� �ݺ��� 
	}

}
