import java.util.Scanner;
class king
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int[] d=new int[a];
        for(int i=0;i<a;i++)
        {
            d[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(d[i]%b!=0)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}