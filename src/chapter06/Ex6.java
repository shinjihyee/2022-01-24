package chapter06;

import java.util.Random;

public class Ex6 {

	
	// 목표 체중에 도달할 때까지 운동을 한다. 
	// 나의 체중이 목표체중에 도달했나요 ? (조건식) 자리에 연산자는 <= 이하로 내려갔나요 
	
	// 변수 두개를 뽑을 수 있다 (나의  체중, 목표체중) 
	
	//랜덤을 사용해서 일정 숫자가 나올 대마다 운동을 해서 일정 숫자가 빠지도록
	
	Random random = new Random();
	
	
	int myWeight = 100; 
	int goalWeight = 70; 
	int loseWeight;
	
	while (myWeight >= goalWeight ) {
		System.out.println("운동을 한다. ");
		
		// 운동을 해서 빠질 몸무게 
		loseWeight = random.nextInt(6);
		
		// 운동을 하고 난 뒤 빠진 나의 체중을 계산 
		myWeight = myWeight- loseWeight; 
		
		//빠진 몸무게와 얼마나 몇키로씩 빠진건지 모르니까 
		// 복습을 하면서 바꿔봐라 
		
		
	}
}
}