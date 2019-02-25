
import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
int maxid;
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
if(list[0] > list[1])
{
maxid = 0;
}
else
{
maxid = 1; 
}
for(int id = 2; id <= n-1 ; id++) {
if(list[maxid] < list[id])
{
maxid = id;}
}
System.out.println(maxid);
}}