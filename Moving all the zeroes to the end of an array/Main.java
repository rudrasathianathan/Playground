import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
        zeroend(arr_size, arr);
       for(int index = 0; index <= arr_size - 1; index++){
           System.out.print(arr[index] + " ");
       }
    }
    public static void zeroend(int arr_size, int arr[])
    {
              int count = 0;
        
        for(int index = 0; index <= arr_size - 1; index++){
            if(arr[index] != 0)
            {
                int temp = arr[index];
                arr[index] = arr[count];
                arr[count] = temp;
                count++;
            }}}}


