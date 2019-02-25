import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
             int count = 1;
for(int i = 1; i<= n;)
 {
    
   if(count % 2 == 1)   
      {System.out.println(count);
      i = i + 1;}
       count = count + 1;
}
	}
}