import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
		int n = in.nextInt();


 int num=n;
 int result = 0;
 while(num != 0)
  {
  int r = num % 10;
  result = result + (r*r*r) ;
  num = num /10;      
}
 if(result == n)
{System.out.println("Armstrong Number");}
else
{System.out.println("Not a Armstrong Number");}

	}
}