import java.util.Scanner;
class Main{
	public static void main (String[] args){
	
 Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    for(int rownum = 1; rownum <= n; rownum++){
                           int num = rownum;
            for(int colnum = 1; colnum <= (n-(rownum - 1)); colnum++){
                  System.out.print(n-(num - 1));
                    num = num + 1;
}System.out.print("\n");

}    	}
}