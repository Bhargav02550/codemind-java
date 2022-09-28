import java.util.*;
class solution
{
    public static int maxsub(int[] arr)
    {
        int c=arr[0];
        int s=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            c= Math.max(arr[i],c+arr[i]);
            s= Math.max(s,c);
        }
    return s;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=maxsub(a);
        System.out.format("%d",sum);
    }
}