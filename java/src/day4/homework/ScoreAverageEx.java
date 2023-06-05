package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		int K, E, M;
		double avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("input your score");
		K = sc.nextInt();
		E = sc.nextInt();
		M = sc.nextInt();
		//국어 영어 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		avg  = (K+E+M)/(double)3.0; //(double)로 형변환도 가능. 3.0을 이용도 가능
		
		System.out.println(avg);
	}

}
