import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                c++;
            }
        }
        if(c==1)
        {
            System.out.format("YES");
        }
        else
        {
            System.out.format("NO");
        }
    }
}