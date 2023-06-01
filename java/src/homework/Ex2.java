package homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받아 두 정수의 산술연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		 * 예 : 
		 * 두 정수를 입력하세요.
		 * 1 2 [엔터]
		 * 1 + 2 = 3
		 * 1 - 2 = -1
		 * 1 * 2 = 2
		 * 1 / 2 = 0.5
		 * 1 % 2 = 1 
		 */
		//안내 문구 출력
		System.out.println("두 정수를 입력하세요.");
		//콘솔에서 입력받을 수 있는 스캐너 생성
		Scanner sc = new Scanner(System.in);
		//두 정수를 입력 받음
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//두 정수의 산술 연산을 게산
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = num1 / (double)num2;
		int mod = num1 % num2;
		//결과를 콘솔에 출력
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mul);
		System.out.println(num1 + " / " + num2 + " = " + div);
		System.out.println(num1 + " % " + num2 + " = " + mod);
		sc.close();
		
	}

}
