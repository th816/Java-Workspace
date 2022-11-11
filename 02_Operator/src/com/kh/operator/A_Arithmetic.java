package com.kh.operator;

public class A_Arithmetic {
	
	
	// 산술 연산자 (이항 연산자 == 두개의 값을 가지고 연산)
	// * / % + -
	
	public void method( ) {
		
		int num1 = 10;
		int num2 = 3;
		
		
		System.out.println("num1+num2 : "+(num1+num2));
		// num1+num2로 출력해 버리면 String 각각의 숫자 10과 3을 인식 하기때문에
		// 괄호로 묶어줘서 덧셈 연산이 먼저 실행 되도록 한다
		
		System.out.println("num1 - num2 : "+ (num1-num2));
		// 뺄셈의 경우 괄호로 묶어주지 않으면 String처럼 각가의 숫자로 인식 하기때문에 오류발생
		
		System.out.println("num1 * num2 : "+ num1*num2);
		
		System.out.println("num1 / num2 : "+ num1/num2);
		
		System.out.println("num1 % num2 : "+ num1 % num2);
		// 곱셈, 나눗셈, 모듈러의 경우 덧셈보다 우선순위가 높기 때문에 괄호로 묶어주지 않아도
		// 정확한 결과가 나온다. 단, 가독성을 위해 모든 연산시 괄호로 묶어주는 것을 권장.
		
		//System.out.println(10%0);
		//java.lang.ArithmeticException : / by zero 라는 오류가 발생
		//수학과 마찬가지로 0으로 나누기는 안됨.
		
		
		double a =35; //35.0
		double b =10; //10.0
		
		System.out.println(a / b); // 실수끼리의 실행 결과는? 3.5
		System.out.println(a % b); // 실수끼리의 실행 결과는 몪ㅅ은 3.0 나머지는 5.0
		
		
		
		
		
		
		
	}
	
	
	

}
