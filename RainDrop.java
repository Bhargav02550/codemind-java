import java.util.Scanner;
class rain
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%3==0&&n%5==0)
    {
        System.out.format("PlingPlang");
    }
    else if(n%5==0&&n%7==0)
    {
        System.out.format("PlangPlong");
    }
    else if(n%3==0&&n%7==0)
    {
        System.out.format("PlingPlong");
    }
    else if(n%3==0)
    {
        System.out.format("Pling");
    }
    else if(n%5==0)
    {
        System.out.format("Plang");
    }
    else if(n%7==0)
    {
        System.out.format("Plong");
    }
    else
    {
        System.out.format("%d",n);
    }
    }
}