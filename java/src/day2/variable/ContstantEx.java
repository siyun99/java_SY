package day2.variable;

public class ContstantEx {
	
	public static void main(String[] args) {
		
		final int MAX_AGE;
		//MAX_AGE : 상수, 100 : 리터럴
		MAX_AGE = 100;
		//MAX_AGE = 101; 에러 발생. 1번 초기화 한 후 수정하려고 했기 때문에
		System.out.println(MAX_AGE);
		
		//지역 변수는 자동으로 초기화가 안됌 
		int totalCount;
		//System.out.println(totalCount); totalCount 변수가 초기화 되어 있지 않기 때문에 사용이 불가=>에러 발생
		//지역 변수는 무조건 초기화 해야됌.

	}

}
