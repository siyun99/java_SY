package day5.whileex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//HelloWorld를 10번 출력하는 코드를 작성하세요.
		/* 반복횟수 :10번 ,1번부터 10번까지 1씩 증가 
		 * =>변수의 초기값 : 1
		 * =>조건식 : 10까지 => 10보다 작거나 같을 때까지
		 * =>증가하는 식 : 1씩 증가
		 * 규칙성 : HelloWorld를 출력
		 * 
		 */
		int max = 10;
		int i = 1;//변수의 초기값 : 1
		//i가 10보다 작거나 같을 때가지
		while(i<=max) {
			i++;
			//i는 1씩 증가
			System.out.println("Hello World");
		}
		System.out.println("================");
		/* 반복 횟수 : i는 10부터 1까지 1씩 감소
		 * 
		 */
		i = max;
		while(i >= 1) {
			System.out.println("Hello World");
			--i;
		}
		System.out.println("================");
		
		i = max;
		while(i-- > 0) {
			System.out.println("Hello World");
			
		}

	}

}
