package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
	
	int arr [] = new int[10];
	
	
	for(int i=0; i<arr.length; i++) {
		
		arr[i] = i+1;
		
	}
	for(int i=0; i<arr.length; i++) {
	System.out.printf(arr[i]+" ");
	}
	
	
}
	public void practice2() {
		
		int arr [] = new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = 10-i;
			
		}
		for(int i=0; i<arr.length; i++) {
		System.out.printf(arr[i] +" ");
		}
		
		
	}
	
	public void practice3() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		

		
	}
	
	public void practice4() {
		
		String[] arr = new String[5];
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		System.out.println(arr[1]);
		
		
		
	}
		
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수 : ");
		int size = sc.nextInt();
	
		int arr[] = new int [size];
		for(int i=0; i<arr.length; i++) {
		
		System.out.printf("배열의 %d번째 인덱스에 넣을 값 : ",i);
		arr[i] = sc.nextInt();
		}
	
		int sum = 0;
	
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n총 합 : "+sum);

	
		}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		if(size <3 || size %2 ==0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}else {
			int arr[] = new int[size];
			for(int index=0; index<=size/2; index++) {
				arr[index] = 1+index;
				
			}
			int value=1;
			for(int index = size/2+1;index<=arr.length;index++) {
				arr[index] = size/2+1-value;
				value++;
			}
			
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+ (i == arr.length-1 ? "" : ", "));
			}
			
		}
	
}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String menu[] = {"양념","후라이드","고추바사삭","레드콤보"};
		String chiken = sc.nextLine();
		
		for(int i=0; i<menu.length;i++) {
			if(menu[i].equals(chiken)){
				System.out.println(chiken+"치킨 배달 가능");
				return;
			}
		}
	
		System.out.println(chiken+"치킨은 없는 메뉴입니다.");
	
	
	
}
	
}