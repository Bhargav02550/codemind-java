import java.util.Scanner;
class grades
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>50 && b>60 && c>100)
        {
            System.out.format("10");
        }
        else if (a>50 && b>60 && c<100)
        {
            System.out.format("9");
        }
        else if (a<50 && b>60 && c>100)
        {
            System.out.format("8");
        }
        else if(a>50 && b<60 && c>100)
        {
            System.out.format("7");
        }
        else if (a>50 || b>60 || c>100)
        {
            System.out.format("6");
        }
        else
        {
            System.out.format("5");
        }
    }
}