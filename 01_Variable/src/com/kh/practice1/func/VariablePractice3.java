package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 :");
		double le = sc.nextDouble();
		
		System.out.print("세로 :");
		double br = sc.nextDouble();
		
		System.out.println("면적 : "+(le*br));
		System.out.println("둘레 : "+((le+br)*2));
		
	}
	
	
	

}
