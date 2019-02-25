import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
		int n = in.nextInt();
 for (int row = 1; row <= n; row++) {
for(int col = 1; col <=  n; col++){
      int num = col;
       if(row % 2 == 1)
          {if( num != n)
             { System.out.print(row);
             num = num +1;}
            else
            {System.out.print(row + 1);}
          }
      else
           {if(num == 1)
            {System.out.print(row + 1);}
         else
            {System.out.print(row);}
      
          }
}System.out.print("\n");

}
}}