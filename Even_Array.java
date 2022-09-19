import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}