import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>12)
        {
            System.out.format("-1");
        }
        else if (n==4||n==5||n==6)
        {
            System.out.format("Summer");
        }
        else if(n==7||n==8||n==9||n==10)
        {
            System.out.format("Rainy");
        }
        else if(n==11||n==12||n==1)
        {
            System.out.format("Winter");
        }
        else
        {
            System.out.format("Spring");
        }
    }
}