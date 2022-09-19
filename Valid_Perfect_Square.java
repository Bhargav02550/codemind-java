import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=s.nextInt();
            int c=0;
            for(int j=0;j<a;j++)
            {
                if((j*j)==a)
            {
                c++;
            }
            }
            if(c==1)
            {
                System.out.format("True
");
            }
            else
            {
                System.out.format("False
");
            }
        }
    }
}