import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i <= arr_size - 1; i++)
        {
            arr[i] = in.nextInt();
        }
        int maxno;
               if(arr[0] > arr[1])
        {
            maxno = arr[0];
        }
        else{
             maxno = arr[1];
        }
               for(int i= 2; i <= arr_size - 1; i++)
        {
            if(maxno < arr[i])
            {
                maxno = arr[i];
            }
        }
        System.out.println(maxno);
    }
}



