package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누어 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 8과 12의 공약수 : 1,2,4
		 * 8과 12의 최대 공약수 : 4
		 * 반복횟수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		 * 		  mun1을 i로 나누었을 때 나머지가 0과 같고
		 * 		  mun2를 i로 나누었을 때 나머지가 0과 같다면
		 * 		  i를 gcd에 저장
		 * 반복문 종료 후 : gcd를 출력
		 */
		//두 정수를 입력
		int num1,num2;
		int i =1 ,gcd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//반복문(최대공약수를 구하기 위한) : i가 num1까지
		while(i<=num1) {
			// mun1을 i로 나누었을 때 나머지가 0과 같고mun2를 i로 나누었을 때 나머지가 0과 같다면i를 gcd에 저장
			if(num1 % i == 0 && num2%i==0) {
				gcd = i;
			}
			//i를 1증가
			i++;
		}
		
		//gcd를 출력
		System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
		sc.close();
	}
	
}
