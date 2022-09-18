import java.util.Scanner;
class palindrome
{
    public static int palin(int num)
    {
        int r=0,m;
        m=num;
        while(num!=0)
        {
            r=r*10+num%10;
            num=num/10;
        }
        if(r==m)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
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
            if(palin(a[i])==1)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}