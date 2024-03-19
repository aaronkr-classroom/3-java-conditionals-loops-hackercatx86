import java.util.Scanner;

public class Ex404 {

	public static void main(String[] args) {
		
		System.out.print("당신은 몇 살입니까?\n");
		System.out.print("당신의 키는 몇 cm입니까?\n");
		
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		int height = s.nextInt();
		
		if ( age > 15 ) {
			if ( height > 140 ) {
				System.out.println("입장 가능!!!");
			}
			else {
				System.out.println("140cm 이하는 입장 불가!");
			}
		}
		
		else {
			System.out.println("15살 이하는 입장 불가!");
		}

	}

}
