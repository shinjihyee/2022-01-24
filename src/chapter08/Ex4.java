package chapter08;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object5 obj = new Object5() ; 
		
		System.out.println(obj.big(5, 6));
		
		
		// obj ��ü�� �����ִ� comp �޼��带 ȣ���ϰ� 
		// comp �޼��尡 ��ȯ�ϴ� ���� ������ Ÿ���� ������ �����ϼ��� 
		
		
//		String val = obj.comp(5); 
//		
//		System.out.println(obj.comp(5));
		
		
		Calculator obj1 = new Calculator();
		
		double avg1 = obj1.study1(65, 98, 62);
		System.out.println(avg1);
		
		
		
		
	}

}
