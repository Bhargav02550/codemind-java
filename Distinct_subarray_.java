import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=0,c=0;
        for(int i=a;i<=b;i++)
        {
            x=0;
            for(int j=i;j<=b;j++)
            {
                x+=j;
                if(x%2==1)
                {
                    c++;
                }
            }
        }
        System.out.format("%d",c);
    }
}