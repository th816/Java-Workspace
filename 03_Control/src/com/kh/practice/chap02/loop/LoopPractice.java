package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void method1() {
	      
	      
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("1이상의 숫자를 입력하세요 : ");
	      int num = sc.nextInt();
	      
	      int sum = 0;
	      
	      if(num>0) {
	      for(int i =1; i<=num; i++) {
	         
	         sum+=1;
	         System.out.printf(sum+" ");
	         
	         
	      }
	      
	      }else {
	         
	         method1();
	         return;
	         
	         
	      }
	      
	      System.out.println();
	   
	}
	   
	   
	   public void method3() {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("정수를 하나 입력하세요 : ");
		   int num = sc.nextInt();
		   
		   int sum = 0;
		   for (int i = 1; i<=num; i++) {
			   if(i == num) {
				  System.out.print(i);}
			   else {
			   System.out.print(i+"+ ");
			   }
			   sum+=i;
		   }
		   System.out.print("="+sum);
			   
			   
			   
		   }
	   
	   public void method6() {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("시작 숫자 : ");
		   int num = sc.nextInt();
		   
		   System.out.print("공차 : ");
		   int gong = sc.nextInt();
		   
		   
		   for(int i =1; i<=10; i++) {
			   
			   System.out.print(num+" ");
			   num += gong;
			   
		   }
		   
}
	   
	   
	   public void method8() {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("정수 입력 : ");
		   int num = sc.nextInt();
		   for(int i =1; i<=num; i++) {
			   for(int j=0; j<i; j++) {
				   System.out.print("*");
		   }
		   System.out.println();
		   
		  
		   }
		   
		   
		   }
	   
	   	public void method9() {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("정수 입력 : ");
		   int num = sc.nextInt();
		   
		   for(int i =num; i>=1; i--) {
			   
		   for(int j=1; j<=i; j++) {
			   
			   System.out.print("*");
			   
		   }
		   System.out.println();
	   
		   
		   }
	   	}
	   	
	   	
	   	
	   	public void method10() {
	   		
	   		Scanner sc = new Scanner(System.in);
	   		
	   		System.out.print("정수 입력 : ");
	   		int num = sc.nextInt();
	   		
	   		
	   		for(int i =0; i<num; i++) {
	   		
	   		for(int j=1; j<num - i; j++) {
	   		System.out.print(" ");
	   		}
	   		
	   		for(int j = 1; j<2 + i; j++) {
	   			System.out.print("*");
	   			
	   		}
	   		System.out.println();
	   		///////
	   		
	   		
	   		
	   	}
	   	
	   	
	   	}
	   	
	   	public void method11() {
	   		
	   		Scanner sc = new Scanner(System.in);
	   		
	   		System.out.print("정수 입력 : ");
	   		int num = sc.nextInt(); 
	   		
	   		
	   		for(int i = 0; i<num; i++) {
	   			for(int j = 0; j<i; j++) {
		   			
		   			System.out.print(" ");
	   			
	   		}
	   		
	   		for(int j = 0; j<num-i; j++) { // 0 1 2 3
	   		System.out.print("*");//****
	   		}
	   		
	   		System.out.println();
	   		
	   	    
	   		
	   		
	   	}
	   	
	   	
	   	}
	   	
	   	
	   	public void method12() {
	   		
	   		Scanner sc = new Scanner(System.in);
	   		
	   		System.out.print("정수 입력 : ");
	   		int num = sc.nextInt(); 
	   		for(int i=0; i<num; i++) {
	   			
	   			for(int j=0; j<num-i; j++) { //j : 0 1 2 
		   			System.out.print(" ");
		   			
		   		}
		   		for(int j=0; j<1+2*i; j++) {//1 3(1+2) 5(1+4) 7(1+6)
		   			
		   			System.out.print("*");
		   		}
		   		System.out.println();
	   			
	   			
	   		}
	   	
	   	}
	   	
	   	public void method14() {
	   		
	   		Scanner sc = new Scanner(System.in);
	   		
	   		System.out.print("숫자 : ");
	   		int num = sc.nextInt();
	   		
	   		if(num<2) {
	   			System.out.println("잘못 입력하셨습니다.");
	   			return;
	   		}
	   		int count = 0;
	   		
	   		for(int i=2; i<=num; i++) {
	   			boolean isPrime = true;
	   			// i값이 소수인지 아닌지 검사.
	   			for(int j =2; j<i; j++) {
	   				if(i % j == 0) {
	   					
	   					isPrime = false;
		
	   				}
	   			}
	   			if(isPrime == true) {
	   				System.out.print(i+" ");
	   				count++;
	   			}
	   			
	   			
	   			// i값이 소수라면 출력하고, 값을 1 증가시킴
	   			
	   			
	   		}
	   		
	   		
	   		System.out.printf("2부터 %d까지의 소수의 개수는 %d개입니다.",num,count );
	   		
	   	}
	   	
	   	public void method18() {
	   		
	   		Scanner sc = new Scanner(System.in);
	   		
	   		System.out.print("정수 입력 : ");
	   		int num = sc.nextInt();
	   	
	   		// *
	   		for(int j=0; j<2; j++) {
	   			System.out.print(" ");
	   		}
	   		for(int j=0; j<1; j++) {
	   			System.out.print("*");
	   		}
	   	System.out.println();
	   	
	   	/// ***
	   	
	   	for(int j=0; j<1; j++) {
	   		System.out.println(" ");
	   	}
	   	for(int j=0; j<3; j++) {
	   		System.out.println("*");
	   	}
	   	//*****
	   	for(int j=0; j<0; j++) {
	   		System.out.println(" ");
	   	}
	   	for(int j=0; j<5; j++) {
	   		System.out.println("*");
	   	}
	   	
	   	
	   	
	   	
	   	}
	   	
}