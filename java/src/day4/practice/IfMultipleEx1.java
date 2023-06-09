package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

		public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("정수가 2의 배수인가?");

		num = sc.nextInt();

		if((num % 2) == 0) {

			System.out.println(num + "는(은) 2의 배수입니다");

		} else {

			System.out.println(num + "는(은) 2의 배수가 아닙니다");

		}

	}



}