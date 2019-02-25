import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
	    int digit = (num % 100) / 10;
		System.out.println(digit);
	
	}
}