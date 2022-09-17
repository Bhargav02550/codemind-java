import java.util.Scanner;
class shake
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.format("%d",(n*(n-1))/2);
    }
}