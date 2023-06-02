package day3.practice;

public class Ex2 {

	public static void main(String[] args) {
		int score = 65;
		String str;
		str = score >= 60 ? "pass" : "fail";
		System.out.println("Do you pass 65 points?"+str);
		
		int score1 = 45;
		String str1;
		str1 = score1 >= 60 ? "pass" : "fail";
		System.out.println("Do you pass 65 points?"+str1);
		
		/* 강사님 예:
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("input score : ");
		 * int score = sc.nextInt();
		 * 
		 * String result = score >= 60 ? "pass" : "fail";
		 * System.out.println("Do you pass " + score + "points?" +result);
		 * sc.close();
		*/

	}

}
