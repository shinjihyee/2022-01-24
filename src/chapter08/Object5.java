package chapter08;

public class Object5 {
	
	
	// 두 정수를 전달 받아 두 정수 중 큰 수를 호출한 쪽으로 되돌려주는 메서드
	int big (int num1, int num2) {
		if (num1 >= num2) {
			return num1; 
		} else {
			return num2;
		}
	}
	
	// 하나의 정수를 전달 받아 
	// 그 수가 짝수라면 짝수 
	// 홀수라면 홀수 
	// 호출한 쪽으로 되돌려주는 메서드 
	
	
	String num (int su) {
		if (su % 2==0) {
			return "짝수";
		}
		else { return "홀수" ; }
	}
		
	int comp (int su) { 
		return su; 
	}
	
	

	
//	void sum () {
//		System.out.println(1+1);
//	
//	}
//	
//	
//	// 메서드의 반환타입이 void가 아니면
//	// 반환타입이 있는 메서드라고 표현
//	
//	// 반환타입 : 메서드를 호출하면 반환 타입과 일치하는 타입의 데이터가 반환된다. 
//	int sum2 () {return 3;  
//	}
//	
//	double sum3 () {
//		return 12.3;
//	}
	

	}
