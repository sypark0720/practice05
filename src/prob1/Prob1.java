package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		String s2 = s.toUpperCase();
		
		for(int i=0; i< s2.length(); i++){
			for(int j=0; j<=i; j++){
				System.out.print(s2.charAt(j));
			}
			System.out.println();
		}	
	}
}
