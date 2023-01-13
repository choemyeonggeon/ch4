package com.greedy.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

	public void testSIimpleforStatement() {
		/*[for문 표현식]
		 * for(초기식;조건식;증감식){
		 * 		조건을 만족하는 경우 수행할 구문(반복할 구문)
		 * 
		 * }*/

		//		for(int i =1; i<10; i++) {
		//			System.out.println(i);

		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
	}


	public void testForExample(){

		/*5명의 학생 이름을 입력받아 출력을 해보자
		 * 이떄 한 명 이름 입력받은 후 한 명 이름 출력을 반복*/
		Scanner sc = new Scanner(System.in);

		//		System.out.println("1번째 학생 이름을 입력해주세요 : ");
		//		String student1 = sc.nextLine();
		//		System.out.println("1번째 학생 이름은 " + student1 +"입니다.");
		//		
		//		System.out.println("2번째 학생 이름을 입력해주세요 : ");
		//		String student2 = sc.nextLine();
		//		System.out.println("2번째 학생 이름은 " + student2 +"입니다.");
		//
		//		System.out.println("3번째 학생 이름을 입력해주세요 : ");
		//		String student3 = sc.nextLine();
		//		System.out.println("3번째 학생 이름은 " + student3 +"입니다.");
		//	
		//		System.out.println("4번째 학생 이름을 입력해주세요 : ");
		//		String student4 = sc.nextLine();
		//		System.out.println("4번째 학생 이름은 " + student4 +"입니다.");
		//
		//		System.out.println("5번째 학생 이름을 입력해주세요 : ");
		//		String student5 = sc.nextLine();
		//		System.out.println("5번째 학생 이름은 " + student5 +"입니다.");
		//		
		for(int i =1; i <= 5; i++) {
			System.out.println(i+ "번쨰 학생의 이름을 입력해주세요:");
			String student = sc.nextLine();
			System.out.println(i+" 번쨰 학생 이름은" + student + "입니다.");
		}


	}

	public void testForExample2() {
		/*1~ 10까지의 합계를 구하시요*/
		int num1=1;
		int num2=2;
		int num3=3;
		int num4=4;
		int num5=5;
		int num6=6;
		int num7=7;
		int num8=8;
		int num9=9;
		int num10=10;

		//		int sum= 0;			//누적해서 담을 공간 초기값이 1일경우 1값을 넣으면 2가됨
		//누적해서 곱하기는 1을 넣음

		//		sum += num1;
		//		sum += num2;
		//		sum += num3;
		//		sum += num4;
		//		sum += num5;
		//		sum += num6;
		//		sum += num7;
		//		sum += num8;
		//		sum += num9;
		//		sum += num10;

		int sum= 0;

		for(int i=1; i<=10; i++) {
			sum +=i;
		}



		System.out.println("sum :" +sum);

	}

	public void testForExaples3() {

		int random = (int) (Math.random()*6+5);

		int sum =0;



		for(int i =1; i<=random;i++) {
			sum+=i;
		}
		System.out.println("1부터" +random+"까지의 합은:" +sum);

	}

	public void testForExaples4() {
		/*숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 * (첫 번쨰 정수가 반드시 작아야 하는 것은 아니다.)*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 넣어 더하세요");

		System.out.println("첫번쨰 숫자를 입력하세요");
		int fi = sc.nextInt();

		System.out.println("두번쨰 숫자를 입력하세요");
		int se = sc.nextInt();

		int sum=0;
		//		
		//		if(fi>se) {
		//			for(int i = se; i<=fi; i++) {
		//				sum +=i;
		//			}
		//		}else {
		//			for(int i = fi; i<= se; i++) {
		//				sum +=i;
		//			}
		//		
		//		}
		int min = 0;
		int max = 0;

		if(fi>se) {
			max =fi;
			min =se;
		}else {
			max=se;
			min=fi;
		}
		for(int i =min; i<=max; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

	public void printSimpleGugudan(){

		/*키보드로 2~9 사이의 숫자를 입력받아
		 * 2~9 사이인 경우 해당 단의 구구단을 출력,
		 * 그렇지 않은 경우 "반드시2~9 사이의 양수를 입력해야 합니다."출력*/

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. : ");

		int a = sc.nextInt();
		if(a <= 9 && a >= 2) {
			for(int i=1;i<=9; i++){
				System.out.println(a+"곱하기"+ i+ "="+(a*i));
			}
		
	}else{
		System.out.println("반드시2~9 사이의 양수를 입력해야 합니다.");

	}
}
}

