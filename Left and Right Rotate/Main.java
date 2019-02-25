import java.util.Scanner;
class Main 
{
    public static void leftrotateeven(int arr_size, int arr[], int noofrotation)
    {
       int firstevenindex = 1;
       int lastevenindex;
       if(arr_size % 2 == 0)
       {
           lastevenindex = arr_size - 1;
       }
       else
       {
           lastevenindex = arr_size - 2;
       }
       for(int rotation = 1; rotation <= noofrotation; rotation++)
       {
           int temp = arr[firstevenindex];
           for(int index = 3; index < arr_size; index = index + 2)
           {
               arr[index - 2] = arr[index];
           }
           arr[lastevenindex] = temp;
       }
    }
    public static void rightrotateodd(int arr_size, int arr[], int noofrotation)
    {
       int firstoddindex = 0;
       int lastoddindex;
       if(arr_size % 2 == 1)
       {
          lastoddindex = arr_size - 1;
       }
       else
       {
          lastoddindex = arr_size - 2;
       }
       for(int rotation = 1; rotation <= noofrotation; rotation++)
       {
           int temp = arr[lastoddindex];
           for(int index = (lastoddindex - 2); index >= 0; index = index - 2)
            {
               arr[index + 2] = arr[index];
           }
           arr[firstoddindex] = temp;
       }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
        int noofrotation = in.nextInt();
        leftrotateeven(arr_size, arr, noofrotation);
        rightrotateodd(arr_size, arr, noofrotation);
    
    for(int index = 0; index <= (arr_size - 1); index++)
        {
            System.out.print(arr[index]+" ");
        }
    }
}