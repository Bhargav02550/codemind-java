import java.util.Scanner;
class post
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int s2=0,s1=0;
        for (int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s2+=i;
            }
        }
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                s1+=i;
            }
        }
        if(n==s1 && m==s2)
        {
            System.out.format("Amicable");
        }
        else
        {
            System.out.format("Not Amicable");
        }
    }
}