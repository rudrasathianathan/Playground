import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   
Scanner in = new Scanner(System.in);
		int n = in.nextInt();
                int digit = n;
                int sum = 0;
while (n > 0)
{    digit = n % 10;
     sum = sum + digit;
     n = n/10;
    }
System.out.println(sum);

	}
}