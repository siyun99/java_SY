package day18.practice;

import java.util.Scanner;

public class StringSplitEx {

	public static void main(String[] args) {
		//문장 입력
		System.out.println("input : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//공백을 기준으로 단어들 저장
		String words[] = str.split(" ");
		//개추 출력
		System.out.println("Word : " + words.length);
		sc.close();
		
	}

}
