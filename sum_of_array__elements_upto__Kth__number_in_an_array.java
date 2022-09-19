import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        System.out.format("%d",sum);
    }
}