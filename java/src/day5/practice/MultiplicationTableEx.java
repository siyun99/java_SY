package day5.practice;

import java.util.Scanner;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//2단 출력 예제
		/* 반복횟수 : i는 1부터 9까지 증가
		 * 규칙성 : 2 X i = 2*i를 출력
		 */
		int i = 1;
			while(i<10) {
			System.out.println("2 X " + i + " = " + 2*i );
			i++;
		}
				
	}

}
