package com.kh.variable;

// 시급과 근무시간과 근무일수를 곱해서 월급을 계산하여 출력하는 메소드

public class A_Variable {

	public void printVariable() {
		
		System.out.println("변수 사용 전");
		
		System.out.println("시급 : 11000");
		System.out.println("근무시간 : 4");
		System.out.println("근무일 : 5");
		
		//월급 = 시급 x 근무시간 x 근무일
		//홍길동 : 00000입니다
		//서로 다른 자료형 값 여러개를 출력문 하나에 동시에 출력시 +로 붙여줘야함

		System.out.println("엄태환 : "+ (11000 * 4 * 5) + "원 입니다");
		System.out.println("홍길동 : "+ (11000 * 7 * 20)+"원 입니다");
		System.out.println("고길동 : "+ (11000 * 8 * 23)+"원 입니다");
		
		System.out.println("변수 사용 후");
		int pay = 11000;
		int time = 7;
		int day = 15;
		
		System.out.println("시급 :"+pay);
		System.out.println("근무시간 :"+time);
		System.out.println("근무일 :"+day);
		
		//변수를 사용하여 월급 측정(시급 * 근무시간 * 근무일)
		
		System.out.println("엄태환 :"+(pay * time * day)+"원입니다");
		System.out.println("홍길동 :"+(pay * time * day)+"원입니다");
		System.out.println("고길동 :"+(pay * time * (day+5))+"원입니다");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이 좋음)
		 * 2. 단 한번 값을 기록해두고 필요할때마다 꺼내서 계속 사용할 목적(재사용)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
		
		
	}
	
	
	// 변수의 선언
	public void declareVariable() {
	/*
	 * 변수의 선언(값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다 = 박스를 만들겠다
	 * [표현법] 자료형 변수명; 
	 * 
	 * 자료형 : 어떤값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라서 변수의 크기 및 모양을 지정하는 부분.
	 * 변수명 : 변수의 이름을 정하는 부분.
	 * 
	 * 주의할 점
	 * 1. 변수명은 소문자로 시작하게끔 지어줄것.(닥, 낙타등표기법지키기)
	 * ex) String userName; (0)
	 *     String username; (x)
	 *     String user_name;
	 * 2. 같은 영역({})안에서는 동일한 변수명으로 선언 불가
	 * 3. 해당 영역에 선언된 변수는 해당 영역안에서만 사용 가능(다른 메소드에서는 불가능)
	 *    => 지역변수라는 개념
	 * 
	 */
		// 자료형에 대한 개념
		
		// 1. 논리형(논리값 = true / false)
		boolean isTrue; // 1byte
		
		//2. 숫자형
		//2_1. 정수형
		byte bNum; //1byte(-128 ~ 127)
		short sNum; //2byte
		int iNum; //4byte(-21억..~21억...) => 정수형 대표 자료형
		long lNum; //8byte
		
		//2_2. 실수형
		float fNum; //4byte => 소수점 아래 7자리까지 표현가능.
		double dNum; //8byte => 소수점 아래 15자리까지 표현가능.
		//실수형 대표 자료형 => 보다 정확한 실수값을 담을 수 있기 때문에.
		
		//3. 문자형
		char ch; //2byte
		
		// 여기까지가 총 8개의 기본 자료형
		
		//4. 문자열(참조형) => 나중에 좀 더 자세히 다룰 예정
		String str;
		
		// 여기까지 총 9개의 박스(변수)가 메모리 공간에 생성됨
		
		/*
		 * 변수에 값 대입
		 * [표현법] 변수명 = 값(literal);
		 */
		
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long 자료형임을 알려주기 위해 소문자나 대문자 L 을 표기해줌(L을 더 권장)
		
		fNum = 4.0f; // 반드시 f를 붙여줘야 한다.
		dNum = 8.0;
		
		ch = 'A'; // 반드시 ''(작은따옴표)안에 넣어줘야함
		str = "ABC"; // 반드시 ""(쌍따옴표)안에 넣어줘야함
		
		//각 변수에 담긴 값 출력
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	public void initVariable() {
		
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴);
		 */
		// 1.논리형
		boolean isTrue = true; //1byte
				
		//2_1. 정수형
		byte bNum = 1; //1byte
		short sNum = 2; //2byte
		int iNum = 4;		
		long lNum = 8L;
		
		//2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		//3. 문자형
		char ch = '민';
		
		//4. 문자열(참조자료형)
		String str = "자바 공부중..";
		
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		

		int longInterger = 999_999_999;
		System.out.println(longInterger);
		
				
	}
	
	public void constantVairable() {
		
		int age = 20;
		System.out.println("age :"+age);
		
		age = 25;
		System.out.println("변경된 age : "+age);
		
		final int AGE = 20;
		System.out.println("상수 AGE : "+AGE);
		
		//AGE = 25;
		System.out.println("변경된 AGE : "+AGE);
		
		
		
		
	}
	
	
}
