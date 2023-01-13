package com.greedy.section02.looping;

import java.util.Scanner;

public class C_while {

	public void tesSimpleWhileStatement() {

		/* [while문 표현식]
		 * 초기식;
		 * while(조건식) {
		 * 		조건식을 만족하는 경우 수행할 구문(반복할 구문);
		 * 		증감식;
		 * }
		 * */

		//		for(int i = 1; i <=10; i++) {
		//			System.out.println(i);
		//		}

		int i =1;
		while( i <= 10) {
			System.out.println(i);

			i++;
		}

	}
	public void testWhileExample1() {
		/* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();

		for(int i = 0; i <str.length(); i++ ) {
			System.out.println(i + " : " + str.charAt(i));
		}

		int index = 0;
		while(index < str.length()) {

			System.out.println(index + " : " + str.charAt(index));

			index++;
		}
	}

	public void testWhileExample2() {

		/* 정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 출력 
		 * 단, while문을 이용해서 작성하세요
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요: ");
		int num = sc.nextInt();

		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			i++;
		}

		System.out.println("sum : " + sum);
	}

	public void testWhileExample3() {

		/* while문을 이용하여 구구단 2단 ~ 9단 출력하기*/

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단");
		int num = sc.nextInt();

		int dan = 2;
		while(dan < 10 ) {
			int su = 1;
			while (su <10) {

				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;
			}
			
			dan++;
		}
	
	}
}
