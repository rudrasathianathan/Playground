import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
		int num = in.nextInt();



int sum = 0;
int copy = num;
     
while(num > 0)

       {  int r = num % 10;
	int factorial = 1;
         for(int i =1 ; i<= r ;i++)
                  {factorial = factorial * i;
                  } 
          sum = sum + factorial;
          num = num / 10;
       }         
if(copy == sum)
  {System.out.println("Yes");}
else
  {System.out.println("No");}
  	}
}