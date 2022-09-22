import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if((a%2==0)&&(a>0||b%2==0))
        {
            System.out.format("YES");
        }
        else
        {
            System.out.format("NO");
        }
    }
}