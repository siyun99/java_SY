package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		/*국어,영어,수학 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		 * input 3score(kor,eng,math) : 10 20 30
		 * average : 20.0
		 * continue?(y/n)
		 * y
		 * 반복문 : menu가 n이 아닌면 반복(y,n이 아닌 다른 문자를 입력하면 반복)
		 * menu가 y이면 반복(y,n이 아닌 다른 문자를 입력하면 종료)
		 */
		int kor,eng,math;
		char menu = 'y';
		double avg;
		Scanner sc = new Scanner(System.in);
while(menu != 'n') {
			
		System.out.println("in put 3 score : ");
		kor = sc.nextInt();	
		eng = sc.nextInt();	
		math = sc.nextInt();	
		avg = (kor + eng + math)/(double)3;
		System.out.println("average : " + avg);
		System.out.println("countie?(y/n) : ");
		menu = sc.next().charAt(0);
		
}
	System.out.println("EXIT!");	
		sc.close();
	}

}
