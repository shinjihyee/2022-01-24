package chapter08;

import java.util.Arrays;

public class Object6 {

	
	void func ( int num ) {
		num = num + 1; 
		
		System.out.println("num = " + num);
	}
	
	void func2 (int [] param) {
		param[0] = param[0] +1;
		
		System.out.println(Arrays.toString(param));
 	}
	
	void func3 (Object7 param) {
	param.value = param.value +1; 
	
	System.out.println("param.value =" + param.value);
}
}
