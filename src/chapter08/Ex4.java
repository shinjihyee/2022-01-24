package chapter08;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object5 obj = new Object5() ; 
		
		System.out.println(obj.big(5, 6));
		
		
		// obj 객체가 갖고있는 comp 메서드를 호출하고 
		// comp 메서드가 반환하는 값을 적절한 타입의 변수에 저장하세요 
		
		
//		String val = obj.comp(5); 
//		
//		System.out.println(obj.comp(5));
		
		
		Calculator obj1 = new Calculator();
		
		double avg1 = obj1.study1(65, 98, 62);
		System.out.println(avg1);
		
		
		
		
	}

}
