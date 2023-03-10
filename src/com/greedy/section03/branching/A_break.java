package com.greedy.section03.branching;

public class A_break {
	public void testSimpleBreakStatment() {
		
		/*break문은 반복문 내부에서 사용한다.
		 * 해당 반복문을 빠져나올 떄 사용하며,
		 * 조건문 판단 결과와 상관 없이 강제로 반복을 종료한다.
		 * 일반적으로 if(조건식) {break;} 처럼 사용된다.*/
		
//		while(true) {
//			switch(변수){
//				case 1 :break;
//			}
//			}
		
		int sum = 0;
		int i = 1;
		while(true) {
			
			sum += i;
			if(i== 100) {
				break;
			}
			
			i++;
			
		}
		System.out.println("sum"+sum);

	}
	public void testSimpleBreakStatment2() {
		/*중첩 반복문 내에서 분기문의 흐름
		 * break는 모든 반복문을 종료하는 것이 아닌,
		 * 자신에게 가장 인접한 반복문만 실행을 멈춘다.
		 **/
		
		//구구단 2단~9단출력
		//단 각 단의 수가 5보다 큰 경우는 출력을 생략
		
		for(int dan =2; dan<10; dan++) {
			
			for(int su=1; su<10; su++) {
				if(su>5) {
					break;
				}
				System.out.println(dan+"*"+su+"="+(dan*su));
	}	
		System.out.println();
	}
	
}
	public void testJumpBreak() {
		
		label:
		for(;;) {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				if(i ==3) {
					break label;
				}
			}
		}
	}
}

