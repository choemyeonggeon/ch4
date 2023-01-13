package com.greedy.section1.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		System.out.print("사과,바나나,복숭아,키위중한가지를 고르시오 :");
		
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		
		if(answer.equals("사과")) {
			System.out.println("사과 : 1000원");
		}else if(answer.equals("바나나")) {
			System.out.println("바나나 3000원");
		}else if(answer.equals("복숭아")) {
			System.out.println("복숭아 2000원");
		}else if(answer.equals("키위")) {
			System.out.println("키위 5000원");
		}else{
			System.out.println("다시입력해주세요");
		return;
			
	
		}
		
	

		
		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면 
		 * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 * 
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 * 
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 * 
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */
	}		
	}


