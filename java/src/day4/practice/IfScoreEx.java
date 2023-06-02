package day4.practice;

import java.util.Scanner;

public class IfScoreEx {

	public static void main(String[] args) {
		/*성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90 이상 ~ 100이하 : A
		 * 80 이상 ~ 90미만  : B
		 * 70 이상 ~ 80미만  : C
		 * 60 이상 ~ 50미만  : D
		 * 60 미만          : F
		 * 0보다 작거나 100보다 큰 경우 : wrong score
		 */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input score");
		num = sc.nextInt();
		//90 이상 ~ 100이하 : A
		//score가 90이상이고 score가 100이하면 A라고 출력
		//score가 90보다 크거나 같고 score 100보다 작거나 같으면 A라고 출력
		 if(num>=90 && num<=100) {
			System.out.println("A");
		}else if(num>=80 && num<90) {
			System.out.println("B");
		}else if(num>=70 && num<80) {
			System.out.println("C");
		}else if(num>=60 && num<70) {
			System.out.println("D");
		}else if(num<60 && num>0) {
			System.out.println("F");
		}else {
			System.out.println("Wrong score");
		}
		
		
	}

}
