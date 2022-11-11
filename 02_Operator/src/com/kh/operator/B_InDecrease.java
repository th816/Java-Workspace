package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감 연산자(단항 연산자) ++ --
	 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
	 * ++변수 (전위 연산자) 변수 ++(후위 연산자)
	 * 
	 * -- : 값을 1 감소 시키는 연산자
	 * --변수 (전위 연산자) 변수 --(후위 연산자)
	 * 
	 * (증감 연산자) 변수 : 전위 연산 -> 선 증감 후 처리.
	 * 변수(증감 연산자) : 후위 연산 -> 선 처리 후 증감.
	 * 
	 */
	
	public void method1( ) {
		
		int num = 10;
		System.out.println("전위 연산 적용 전 num :"+num); // 10
		System.out.println("1회 수행 후 결과 :"+ ++num); // 10에서 증감연산을 먼저 실행하여
		//11로 num값을 증가 시키고 최종적으로 11이 출력됨
		
		System.out.println("2회 수행 후 결과 :"+ ++num); //현재 num=11이 담겨있음 따라서 12가 출력됨

		System.out.println("3회 수행 후 결과 :"+ ++num); // 13이 출력됨
		
		System.out.println("최종 num :"+ num);
		
		System.out.println("===================================");
		
		
		
		// 후위 연산 테스트
		
		int num2 = 10;
		System.out.println("후위 연산 적용 전 :"+num2); // 10
		System.out.println("1회 수행 후 결과 : "+ num2++);// 10출력 후 1증가 즉 출력 당시에는
		// 10이 출력되고 출력처리가 끝나고 나서 11로 증감 처리됨.
		
		System.out.println("2회 수행 후 결과 :"+ num2++);// 11이 출력되고 1증가 -> 12
		
		System.out.println("3회 수행 후 결과 :"+ num2++);//12출력 후 1증가 -> 13
		
		System.out.println("최종 num :"+ num);
		
		
		
		
		
	}
	
	
	public void method2( ) {
		
		// 전위 연산
		int a = 10;
		int b = ++a;
		
		
		System.out.println("a : "+a+", b: "+b);//11,11
		
		int c = 10;
		int d = c++;
		
		System.out.printf("c : %d, d : %d,", c,d);// 11,10
		
		//예측
		int num = 20;
		System.out.println("현재 num :"+num); //20
		System.out.println("++num ?"+ ++num);//21
		System.out.println("num++"+ num++);//21
		System.out.println("++num ?"+ --num);//21
		System.out.println("num++"+ num--);//21
		System.out.println("최종 num :"+ num);//20
		
		
		
		
	}
	
	
	public void method3( ) {
		
		int num1 = 20;
		int result1 = num1++ *3; // result1 = 20*3 연산 작업 후 num1= num1+1
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2 = num2+1 연산 후 result2 = 21*3 -> 63

		System.out.println("num2 :"+num2);
		System.out.println("result2 :"+result2);
		
		
		
		
		
	}
	
	public void method4( ) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		// 주석으로 어떻게 값이 출력될지 예상해보기
		
		System.out.println(a++); //10
		System.out.println((++a)+(b++)); //32 
		System.out.println((a++)+(--b)+(--c)); //61 
		System.out.println("a :"+a+"b :"+b+"c :"+c); // a:13, b:20, c:29
		
		
	}
	
	
	public void quiz( ) {
		
		int a = 5; //5
		int b = 10; //10
		
		int c = (++a) +b; // a=6 + b=10 => 16 
		int d = c / a; // 16 / 6 =>2
		int e = c % a; // 4
		
		int f = e++; // f -> 4 / e=>3
		int g = (--b) + (d--); //9+2 -> 11 d->1
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // a:6(7), b=9,
		//연산자 우선 순위가 동일하다면 앞에꺼 먼저 실행시킴.
		// 6+3 * 10 % 8
		
		
		System.out.println("a : "+a); //7
		System.out.println("b : "+b); // 9
		System.out.println("c : "+c);//15
		System.out.println("d : "+d);// 1
		System.out.println("e : "+e); //6
		System.out.println("f : "+f);//4
		System.out.println("g : "+g);//10
		System.out.println("h : "+h);//2
		System.out.println("i : "+i);// 12
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
