import java.util.Scanner;
class post
{
    public static boolean plan(int num)
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
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=s.nextInt();
            if(plan(a))
            {
                System.out.format("True
");
            }
            else
            {
                System.out.format("False
");
            }
        }
    }
}