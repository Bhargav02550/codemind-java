import java.util.Scanner;
class digits
{
    public static int p(int n)
    {
        int i;
        for(i=2;i<=(n/2)+1;i++)
        {
           if(n%i==0)
           {
               return 0;
           }
        }
    return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int o=(a+b);
        for(int i=1;;i++)
        {
            if(p(o+i)==1)
            {
                System.out.format("%d",i);
                break;
            }
        }
    }
}