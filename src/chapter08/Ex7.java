package chapter08;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numArr = {1, 2,3};
		
		System.out.println(Arrays.toString(numArr));
		
		Object6 obj = new Object6();
		
		obj.func2(numArr);
		
		System.out.println(Arrays.toString(numArr));
		
		
		Object7 obj = new Object7();
		
		obj.value = 10;
				
		System.out.println("obj.value =" + obj.value);
		
		Object6 obj1 = new Object6(); 
		obj.func3(obj1);
		
		System.out.println("obj1.value =" + obj1.value);
		
		
//		int num = 10; 
//		
//		System.out.println("num = " + num);
//		
//		
//		Object6 obj = new Object6 () ; 
//		obj.func(num);
//	
//		System.out.println("num=" + num);
		
		
	}

}
