import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int n1=0,n2=1,n3;
        System.out.format("%d %d ",n1,n2);
        for(int i=2;i<n;i++)
        {
            n3=n1+n2;
            System.out.format("%d ",n3);
            n1=n2;
            n2=n3;
        }
    }
}