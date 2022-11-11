package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int fi = sc.nextInt();
		
		System.out.print("두 번재 정수 : ");
		int se = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(fi+se));
		System.out.println("빼기 결과 : "+(fi-se));
		System.out.println("곱하기 결과 : "+(fi*se));
		System.out.println("나누기 결과 : "+(fi/se));
		
	}
	
}
