package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month : ");
		num = sc.nextInt();
		
		if(num== 3 || num == 4 || num == 5) {
				System.out.println("spring");
		}else if(num == 6 || num == 7 || num == 8) {
				System.out.println("summer");
		}else if(num == 9 || num == 10 || num == 11) {
				System.out.println("falling");
		}else if(num == 12 || num == 1 || num == 2){
				System.out.println("winter");
		}else {
			System.out.println("this is wrong month");
		}
		
		if(num>=3 && num <=5) {
			System.out.println("spring");
		}else if(num>=6 && num <=8) {
			System.out.println("summer");
		}else if(num>=9 && num <=11) {
			System.out.println("falling");
		}else if(num==12 || (num >= 1 && num <=2)) {
			System.out.println("winter");
		}else {
			System.out.println("this is wrong month");
		}
		
		
	}

}
