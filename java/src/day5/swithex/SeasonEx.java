package day5.swithex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		month = sc.nextInt();
		//switch문은 ==(같다)가 들어가는 것만 쓸 수 있음.
		//변수(month)와 리터럴(3,4,5)를 이용한다
		switch(month) {
		//case 3: case 4: case 5:로 사용하는것임
		//case 3,4,5는 JDK 7버전 이후로 가능
		case 3,4,5 : 
			System.out.println("It is spring");
		break;
		//month가 6,7,8일 때 공통의 실행문이 아니라 8의 실행문에 얹혀서 쓴다
		//6의 실행문이 없고,break문도 없음
		//7의 실행문이 없고,break문도 없음
		case 6,7,8 : 
			System.out.println("It is summer");
		break;
		case 9,10,11 : 
			System.out.println("It is falling");
		break;
		default :
			System.out.println("It is winter");
		
		
		}
	}

}
