import java.util.Scanner;
class Main {
	public static void main (String[] args){
    
Scanner in = new Scanner(System.in);
		int second = in.nextInt();
                
while (second >= 100)
    {
     second = second/10;
    }
second = second % 10;
System.out.println(second);
       
    }}
