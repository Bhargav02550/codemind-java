import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=0;i<b;i++)
        {
            int m=s.nextInt();
            int n=s.nextInt();
            if(m<a || n<a)
            {
                System.out.format("UPLOAD ANOTHER
");
            }
            else if((m==a&&n==a)||m==n)
            {
                System.out.format("ACCEPTED
");
            }
            else
            {
                System.out.format("CROP IT
");
            }
        }
    }
}