package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 		ex) int a = 10;
	 *           a = 20;
	 *           
	 * 배열 : 하나의 공간에 여러개의 값을 담을수가 있음.(단, 같은 자료형의 값으로만 가능)
	 * 		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스 0 부터 시작)
	 * 		 ex) int[] a = new int[3]; // int형의 자료가 들어갈수 있는 공간을 3개 만든다.
	 * 								   // 방, 사물함[0] [1] [2]을 3개 만듬.
	 * 								   // 인덱스는 항상 0부터 시작한다.**중요**
	 * 								   // 배열의 크기는 3, 마지막 인덱스 = 2
	 *                                 // 배열의 크기 100, 마지막 인덱스 = 99
	 *                                 // 항상 크기 = n, 마지막 인덱스 = n-1
	 * 
	 */
	
	public void method1() {
		//배열을 왜 써야할까
		//만약에 변수만을 가지고 프로그래밍을 하게되면
		//ex) 0,1,2,3,4, 기록해야됨
		
		/*
		 * 변수로 이용하여 각각의 데이터를 보관하고자 할때 ->각각의 변수를 만들어서 따로 관리해야됨
		 * int num1=0;
		 * int num2=1;
		 * int num3=2;
		 * int num4=3;
		 * int num5=4;
		 * 
		 * 출력할때 일일이 출력해야됨, 반복문 사용 불가능
		 * 
		 * for(int i =1; i<=5; i++){
		 * sysout(num+i);
		 * 
		 * 1. 배열을 가지고 프로그래밍 하기
		 * 0,1,2,3,4
		 * 
		 * [표현법]
		 * 자료형 [] 배열명;
		 * 자료형 배열명[];
		 * int a; 변수
		 * int[] a; 배열
		 * int a[]; 배열
		 * 
		 * 2) 배열 할당
		 * 이 배열에 몇개의 값들을 보관 할건지 배열의 크기를 지정해주는 과정
		 * 지정한 개수만큼 값이 들어갈 방이 생성됨.
		 * 
		 * [표현법]
		 * 배열명 = new 자료형[배열의 크기];
		 * 
		 * a = new int[5];
		 * 
		 */
		
		
		int [] arr = new int[5];
		int a;
		
		//System.out.println(arr[0]);
		/*
		 * 3. 배열의 각 인덱스(=방번호) 자리에 값 대입
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 * 
		 * arr[0]=0;
		 * arr[1]=1;
		 * arr[2]=2;
		 * arr[3]=3;
		 * arr[4]=4;
		 */
		
		
		// 배열의 가장 큰장점 : 반복문을 활용할 수 있다.
		
		for(int i =0; i<5; i++) {
			arr[i] = i;
			
			
		}
		// 배열의 for문을 활용해 값을 입력, 출력도 가능함.
		for(int i=0; i<5; i++) {
			System.out.printf("%d번 인덱스의 값 : %d\n", arr[i]);
			
		}
		//각각의 인덱스 값을 확인하기 위해서는 []을 통해 내가 확인하고자 하는 인덱스(방번호)를 제시해줘야함
		//그럼 arr에 전체 담겨있는 값을 확인하고 싶다면
		System.out.println(arr); //실제 arr이라는 값에는 주소값이 담겨있음.
		//[I@1888ff2c 여기서 @기준으로 우축은 참조 하고있는 heap 영역의 주소값
		//[ : 배열임을 나타냄
		// I : int 자료형을 의미함
		
		
		
		
		
	}
	
	public void method2() {
		
		int i = 10; //일반변수. i라는 박스에 10이라는 값이 그냥 담겨있음
		
		int arr[] = new int[5];
		//배열 자료형
		/*
		 * 우선 대입 연산자 기준 왼족이 먼저 실행 되므로 arr이라는 int형 배열 박스가 먼저 만들어짐.(stack영역에)
		 * 그다음 int[5]짜리 방이 heap영역에 생성됨(new 키워드가 붙은 녀석은 항상 heap영역에 값이 할당됨)
		 * 5칸짜리 방이 만들어진 후에 각 방에 기본값으로(int 0으로) 데이터가 초기회 되고, 주소값이 할당됨(0x123)
		 * 마지막으로 대입 연산자가 실행 되면서 주소값이 arr에 할당이 됨.
		 * 
		 * 
		 */
		
		System.out.println("i : "+i);
		System.out.println("arr : "+arr);
		System.out.println("arr의 해시코드값 : "+ arr.hashCode());
		//해시코드 : 주소값을 10진수의 형태로 변환한것
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		System.out.println("dArr의 해시코드값 : "+dArr.hashCode());
		
		/*
		 * 기본자료형(boolean, char, byte, short, int, float, double)
		 * => 실제 값(리터럴)을 바로 stack영역에서 담을 수 있는 변수 = > 일반 변수
		 * 
		 * 그 외 자료형(int[], double[] short[], ....., String, Scanner, ..)
		 * -> 주소값을 담고 이쓴ㄴ 변수 = > 참조 변수(레퍼런스 변수)
		 * 
		 */

		
	}
	
	public void method3() {
		
		int[] iArr = new int[3];
		double[] dArr = new double[3];
		
		for(int i=0; i<iArr.length; i++) { //0,1,2
			
			System.out.println(iArr[i]);

		}
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		/*
		 * 내가 각 인덱스 초기화하지 않았는데도 값들이 담겨있는 이유
		 * ->heap이라는 영역에난 절대로 빈공간이 존재할 수 없기때문.
		 * 따라서 jvm이 각 공간에 각 자료형의 기본값으로 초기화(대입)을 시켜줌
		 * 
		 * + 배열의 크기를 아는 방법 배열명.length
		 * 
		 * 
		 * 
		 */
		
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		
		//각 배열의 인덱스에 값을 대입하는 반복문
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1; //arr[0]=1 arr[1]=2 arr[2]=3 arr[3]=4 arr[4]=5
			
			
		}
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		/*
		 * ArrayIndexOutOfBoundException
		 * 배열의 인덱스 범위를 벗어남
		 * 
		 */
	
		
	}
	
	public void method5() {
		
		int i=0;
		String str = null;
		
		//int i2 = null; ->null값을 int 자료형에 넣을 수 없음.
		
		int[] arr = null; //null값 할당 가능. 주소값을 담을수 있는 변수의 기본값은 null
		
		
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다더나 특정 어딘가에 접근하고자 한다면
		 * 무조건 오류발생->NullPointerException
		 * ex)arr.hashCode(), arr.length
		 * 
		 */
		
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		/*
		 * arr[0]=2;
		 * arr[1]=4;
		 * arr[2]=6;
		 * arr[3]=8;
		 * arr[4]=10;
		 * 
		 */
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			
			
			arr[i] = value; 
			value += 2;
			
		}
		//System.out.println(arr[2]);
		/*
		 * 배열의 가장 큰 단점
		 * 한번 지정한 배열의 크기는 변경 불가능함
		 * 배열의 크기를 변경 하고자 한다면 어쩔 수 없이 새로운 배열을 다시 만들어야함
		 * 
		 */
		System.out.println(" arr 변경 전");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		
		
		arr = new int[7];
		
		System.out.println(" arr 변경 후");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성되었던 주소와 절대로 겹치지 않는다
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 
		 * 연결이 끊어진 기존의 배열은 Heap영역에 둥둥 떠다님
		 * 일정 시간이 지나고서도, 사용이 되지 않으면 " 가비지 컬렉터(GC)"가 삭제시켜줌.
		 * (자동 메모리관리)
		 * => 자바에서 자동 메모리관리 특징, 개발자가 메모리 관리신경 안쓰고 코드만 집중하게해줌
		 * 
		 */
		
		
		
		//현재 연결되어있는 고리를 끊고자 할대
		arr = null; //null : 아무것도 존재하지 않음을 의미
		
		
	}
	public void method7() {
		
		// 배열 선언과 동시에 할당(크기 지정)
		int[] arr = new int[4];
		//각 인덱스에 값 초기와(대입)
		
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		
		//배열 선언 및 동시에 초기화(대입) 까지 한번에 끝내는 방법 2가지
		
		int arr1 [] = new int[] {1,2,3,4};
		
		//방법 2.
		int arr2[] = {1,2,3,4};
		
		//배열 비교
		System.out.println(arr1 == arr2);
		// arr1 -> arr1의 heap영역의 "주소값"
		// arr2 -> arr2의 heap영역의 "주소값"
		// 주소값 == 주소값 : 주소값간에 동등비교를 수행하기 떼문에 false
		

	}
	
	public void method8() {
		//1. 크기 10짜리 정수(int)배열 선언.
		//2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서
		// 값을 대입, 대입하는 값은 랜덤값(1~100)
		//3. 반복문을 활용해서 0번 인덱스부터~마지막 인덱스까지 배열에 담긴값 출력
		
		
		int arr [] = new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]+=(int) (Math.random() *100+1);
			
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i, arr[i]);
			
		}
		
		
		
	}
	
	
	public void method9() {
		//1. 사용자에게 매번 키의 정보를 입력 받은 후 해당 크기만큼 문자열 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		String [] arr = new String[size];
		
		//2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매~ 인덱스 자리에 대입
		
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	
	
	public void method10() {
		//사용자에게 문자열을 하나 입력받은 후
		//각각의 문자들을 char 배열에 옮겨담기
		
		//1. 사용자에게 문자열 입력받기
		//2.char배열 생성해두기 (배열의 크기 == 문자열의 길이만큼)
		//3.문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		//  arr[0] = 문자열.charAt();
		//4.char배열의 각 인덱스에 있는 값들 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. :");
		String str = sc.nextLine();
		
		char arr [] = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		

	}
	
	
	public void method11() {
		
		//1. 사용자에게 배열의 길이를 입력받은후, 해당 크기만큼 정수배열 생성
		//2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값들 대입
		// ->랜덤값(1~100)
		//3. 반복문 활용해서 0번 인덱스부터 마지막인덱스까지 배열에 담긴값 출력과 동시에
		//   해당 인덱스에 ㅏㅁ긴값이 짝수인 경우 그 값들의 총합 구하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력 :");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int) (Math.random() *100+1);
			
		}
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
			if(arr[i] % 2 ==0) {
				sum+=arr[i];
			}
		}
		
		System.out.println("총합 : "+sum);
	
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		double heights[] = new double[3];
		
		//1. 반복문을 활용해서 heights배열의 0번 인덱스부터 마지막인덱스까지 반복을
		// 	 진행하면서 사용자로부터 키에대한정보(cm)를 입력받아 각 인덱스에 저장
		//2. 3명의 키에대한 정보를 출력 시키면서 동시에 모든 키에대한 총합을 저장
		//3. 3명의 키의 총합을 출력하고, 3명키의 평균도 출력(단 소수점 첫째자리까지 출력)
		
		
		for(int i=0; i<heights.length; i++) {
			
			System.out.print("키를 입력하세요 : ");
			double cm = sc.nextDouble();
			heights[i] = cm;
			
			
		}
		double sum = 0;
		double avg = 0;
		for(int i=0; i<heights.length; i++) {
		System.out.println(heights[i]);
			sum+=heights[i];
			avg=sum/3.0;
		}
		
		System.out.println("총합 :"+sum);
		System.out.println("평균 :"+avg);
		
		
	}
	
	
}
