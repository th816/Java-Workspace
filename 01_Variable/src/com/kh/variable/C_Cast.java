package com.kh.variable;

public class C_Cast {
	/*
	 * 형 변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서의 값 처리 규칙
	 * 1. 대입 연산자(=) 를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야함
	 * => 즉, 같은 자료형에 해당하는 값만 대입이 가능합니다.
	 * => 다른 자료형의 값을 대입 하고자 한다면 "형 변환"이 필수.
	 *  [표현법] 자료형 변수명 = (바꿀 자료형) 값;
	 * 
	 * 2. 같은 자료형끼리만 연산 가능.
	 *  => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 한 구문은 "형 변환"을 해야함.
	 *  [표현법] 값+(바꿀 자료형) 값;
	 * 
	 * 형 변환의 종류
	 * 1. 자동 형 변환 => 자동으로 형 변환이 진행되기 때문에 내가 직접 형 변환할 필요가 없음.
	 *              => 작은 바이트의 자료형 -> 큰 바이트의 자료형
	 * 2. 강제(명시적)형 변환 => 자동 형 변환이 되지 않아 내가 직접 강제로 형 변환을 해야 하는 경우.
	 *                   => 큰 바이트의 자료형 -> 작은 바이트의 자료형
	 *  [표현법] (바꿀 자료 형) 값;
	 * 
	 * (바꿀 자료형) == 형 변환 연산자 == cast 연산자
	 * 
	 * **boolean은 형 변환 불가.
	 * 
	 * 
	 * 
	 */
	
	//자동 형 변환 : 작은 바이트의 자료형이 큰 바이트의 자료형으로 형 변환 되는 경우
	public void autoCasting() {
		
		//1. int 자료형 (4byte) -> double(8byte)
		int i1 = 10;
		double d1 =/*(double) */ i1; // 자동으로 형 변환됨
                                     //	컴퓨터 포장용 상자에 휴대폰을 담은 꼴과 비슷함.	
		                             // 그런데 int는 정수, double는 실수 자료형
		                             // d1은 10 -> 10.0으로 형 변환이 된다.
		
		System.out.println("d1 : "+d1);
				
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		
		System.out.println("result :"+result);
		
		//2. int(4byte) -> long(8byte)
		int i3= 1000;
		long l3 = /*long*/i3; //1000
		
		long l4 = 2000L; //L을 붙이지 않아도 문제가 없는 이유 : 자동 형 변환이 되기 때문에.
		
		//3. 특이 케이스 long(8byte) -> float(4byte)
		// 정수가 실수로 담길 때는 큰 사이즈의 정수여도 작은 사이즈의 실수 변수에 대입 가능.
		// 아무리 4byte float라고 해도 long형 보다 담을 수 있는 값의 법위가 더 크기 때문에.
		// float형이 실수이기 때문에 long형 보다 표현 가능한 범위의수가 더 커서 자동 형변환이 이루어짐.
		
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5; //자동으로 형 변환
		
		
		System.out.println("f5 : "+f5);
		
		
		// 4. 특이 케이스 char(2byte) <-> int(4byte) : 양방향 형 변환 가능.
		
		char ch = 65;
		
		System.out.println("ch :"+ch);
		
		int num = 'A';
		
		System.out.println("num : "+num);
		
		
		/*
		 * char의 범위 0~65xxx : 각 문자마다 고유의 정수 값이 정해져있다. 따라서 쌍방향 변환이
		 * 가능하다. 음수 값은 오류가 난다.
		 * 참고 : 아스키 코드표(0~127, 영문자 대소문자, 숫자, 특수문자)
		 *       유니 코드표(0~65xxx, 영어, 숫자, 특수문자, 한글, 그 외 언어들)
		 *  
		 *
		 * 
		 */
		
		System.out.println((int)'민');
		
		char sum = 'A'+10; //65 문자와 정수 사이에 연산이 가능하다.
		
		System.out.println(sum);
		
		//5. 특이 케이스 byte와 short간의 연산
		
		byte b1 = 1;
		byte b2 = 10;
		
		// byte로 연산 시 연산 결과의 정수 값은 무조건 int로 취급한다.
		byte b3 = (byte)(b1+b2); // 강제로 형 변환을 해줘야함.
		
		
		System.out.println("b3 : "+b3);

		
	}
	
	
	
	// 강제(명시적) 형 변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형 변환할 경우.
	public void forceCasting( ) {
		// 1. double(8byte) -> float(4byte)
		
		float f1 = 4.0f; // 반드시 f를 붙여 줘야 한다.
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10.89 -> 10 큰 데이터에서 작은 데이터로 변환되어 데이터 손실 일어남
		
		System.out.println("i3 : "+i3);
		
		
		int iNum = 10;
		double dNum = 5.89;
		
		//iNum이 double형으로 우선 변환이 됨. 10 -> 10.0
		// 10.0+5.89= 15.89 실수 값이 반환됨.
		// 연산 결과가 실수(double) 자료 형이므로 int형에 대입이 불가능함.
		// 해결 방법 1. 연산 결과를 int형으로 맞춰서 강제 형 변환됨.
		
		int iSum = (int)(iNum + dNum); 
		
		//해결방법 2. 덧셈 연산 전에 dNum 변수를 미리 int 형으로 강제 형 변환
		//          자동 형 변환은 작은 바이트 변수가 큰 바이트 변수로 형 변환 되기 때문에
		//          큰 바이트인 dNum변수를 강제로 int 형으로 변환 시킨것 
		
		int iSum2 = iNum + (int)dNum;
		
		// 실수 값을 정수형으로 강제 형 변환 시 소수점 아래 부분은 버려짐(데이터 손실 발생.)
		
		//해결방법3. 애초에 결과 값을 double형 변수에 담기.(데이터 손실 없이 정확한 값이 담김)
		
		double dSum = iNum + dNum;
		System.out.println("iSum :"+iSum+", iSum2 :"+iSum2+", dSum :"+dSum);
		
		
		// 데이터 손실 테스트
		int iNum2 = 290;
		byte bNum2 = (byte) iNum2;
		
		//-128~127
		// 290-34 256 데이터 손실
		System.out.println("bNum2 :"+bNum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
