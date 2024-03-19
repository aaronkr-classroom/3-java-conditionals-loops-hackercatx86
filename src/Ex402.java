import java.util.Scanner;

public class Ex402 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요: ");
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if ( num % 2 == 0 ) {
			System.out.println( num + ": 짝수");
		}

		else {
			System.out.println( num + ": 홀수");
		}
		
		System.out.println("Out of IF");
		
	}

}
