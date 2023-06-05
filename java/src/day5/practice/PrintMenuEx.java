package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/*다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로 실행되는 코드를 작성하세요.
		 *  반복 횟수 : menu가 3이 아닐때까지
		 *  규칙성 : 
		 *  -메뉴를 출력
		 *  -메뉴를 입력
		 *  -입력받은 메뉴에 따라 콘솔에 출력
		 *  -입력받은 메뉴가 1이면 Program Start!
		 *  -입력받은 메뉴가 2이면 Program Save!
		 *  -입력받은 메뉴가 3이면 Program Exit!
		 */
		int menu = 0;//3이 아닌 값으로 초기화
		Scanner sc= new Scanner(System.in);
		while(menu != 3) {
			//메뉴를 입력 
			System.out.println("Menu");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.println("Selext Menu : ");
			//메뉴를 출력
			menu = sc.nextInt();
			
			//-입력받은 메뉴에 따라 콘솔에 출력
			switch(menu) {
			//-입력받은 메뉴가 1이면 Program Start!
			case 1:
				System.out.println("Program Start!");
			//*  -입력받은 메뉴가 2이면 Program Save!
			case 2:
				System.out.println("Program Save!");
			//*  -입력받은 메뉴가 3이면 Program Exit!
			case 3:
				System.out.println("Program Exit!");
				break;
			}
			
			
		}
		
	}

}
