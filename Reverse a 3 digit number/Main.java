import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int a = (n % 10) * 100 ;
        int b = ((n / 10) % 10 ) * 10 ;
        int c = n / 100 ;
        int sum =  (a + b + c) ;
		System.out.println(sum);
  }
}