import java.util.Scanner;
class sum
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
        int c=s.nextInt();
        int c1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==c)
            {
                c1++;
            }
        }
        if(c1>=1)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}