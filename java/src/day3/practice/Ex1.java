package day3.practice;

public class Ex1 {

	public static void main(String[] args) {
		int score = 65;
		String str;
		str = score >= 60 ? "true" : "false";
		System.out.println("Do you pass 65 points?"+str);
		
		int score1 = 45;
		String str1;
		str1 = score1 >= 60 ? "true" : "false";
		System.out.println("Do you pass 65 points?"+str1);
		
		/*Scanner sc = new Scanner(System.in);
		 * System.out.println("input score : ");
		 * int score = sc.nextInt();
		 * boolean result = score >= 60;
		 * System.out.println("Do you pass " + score + "points?" +result);
		 * sc.colse();
		*/
	}

}
