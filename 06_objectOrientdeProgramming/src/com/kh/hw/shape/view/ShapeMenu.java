package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scl = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형 ");
		System.out.println("4. 사각형 ");
		System.out.println("9. 프로그램 종료 ");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum !=3 || menuNum != 4) {
			
			inputMenu();
			
		}
		
		
		
	}
	
	public void triangleMenu() {
		
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적 ");
		System.out.println("2. 삼각형 색칠 ");
		System.out.println("3. 삼각형 정보 ");
		System.out.println("9. 메인으로 ");
		System.out.print("메뉴 번호 : ");
		int MenuNum = sc.nextInt();
		
		if(MenuNum == 9 || MenuNum != 1 || MenuNum != 2 || MenuNum != 3) {
			
			inputMenu();
			
		}
		
		if(MenuNum == 1)
		{
		
		}
		
		System.out.print("높이 : ");
		
		System.out.print("너비 : ");
		
		System.out.println("삼각형 면적 : ");
		
		
		
	}
	
	public void squareMenu() {
		
		
		
	}
	
	
	public void inputSize(int type, int menuNum) {
		
		
		
		
		
		
		
	}
	
	public void printInformation(int type) {
		
		
		
		
	}
	

	

}
