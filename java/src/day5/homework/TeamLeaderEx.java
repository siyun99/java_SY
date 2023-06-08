package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("input student number : ");
		num = sc.nextInt();
		switch(num % 3) {
		case 0 :
			System.out.println("Student number" + num + " is the team leader");
		break;
		default :
			System.out.println("Student number" + num + " is a member of the team");
		break;
		}
		
			sc.close();
	}

}
