import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner intin = new Scanner(System.in);
		Scanner inword = new Scanner(System.in);
		
		System.out.println("Enter a floating number");
		
		double fvalue = inword.nextDouble();
		
		System.out.println("Enter new line");
		
		String line = input.nextLine();
		
		System.out.println("Enter a digit");
		
		int value = intin.nextInt();
		
		System.out.println("Entered line is " + line);
		System.out.println("Entered digit is " + value);
		System.out.println("Entered float num is " + fvalue);
	}
}