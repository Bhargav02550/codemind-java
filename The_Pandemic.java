import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1 || n==2)
        {
            System.out.format("%d",n-1);
        }
        else
        {
            System.out.println("2");
        }
    }
}