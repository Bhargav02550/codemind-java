import java.util.Scanner;
class primes
{
    public static int prime(int num)
    {
        int i;
        if(num==1)
        {
            return 0;
        }
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(prime(a[i])==1)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
    
}