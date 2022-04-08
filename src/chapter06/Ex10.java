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
		 * for 반복문으로 바꾸세요
		 */
		
		// 처음은 초기식 조건식 증감식을 모르니까 
		// 굳이 처음부터 할 그게 없다xxx 퍼즐 맞추는 거처럼 아는거부터하면됌
		
//		int[] numberList = {5,4,3,2,1};
//		
//		for (int index = 0; index <= 4; index++) {
//			System.out.println(numberList[index]);
//		}
//		
//		// 배열의 수가 늘어나면 수천개를 일일히 다 세기 힘드니
//		//배열의 길이를 배웠으니 0부터 시작하니까 길이 -1
//		// numberList(배열안에).length라는 멤버 변수를 통해서 사용할수있다
//		// 미만 이니까 index<numberList.length 
//		// 인덱스 안에 수가 길이 -1이니까
		
		//ageArray 안에는 네 학생의 나이가 들어있습니다.
		// 네 학생의 평균 나이를 계산해 출력하는 프로그램을 개발하세요. 
		
	
		
		

		
		int [] ageArray = {21,21,23,22};
		// 평균 나이를 구별할려면 나이의 합계가 필요함
		// (평균을 구별할려면 합계가 필요하다)
		
		// 이 단계를 잘 기억해야함
			 
		int totalAge = ageArray[0] + ageArray[1] + ageArray[2] +ageArray[3] ;
		
		// 가로로 풀어져있는 배열의 합계 식을
		// 세로로 바꾸면 
		
		totalAge = ageArray[0];
		tatalAge = totalAge + ageArray[0];
		tatalAge = totalAge + ageArray[1];
		tatalAge = totalAge + ageArray[2];
		tatalAge = totalAge + ageArray[3];

		
		for (int i = 0; i<=3; i++) {
			System.out.println(totalAge = totalAge + ageArray[i]);
		}	
		// 합계를 활용해서 평균 나이 계산
		double averageAge = (double) totalAge/ageArray.length;
		
		System.out.println("평균 나이는 :" + averageAge);
		
	}
		
	

}
