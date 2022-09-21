import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i>j)
                {
                    break;
                }
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c!=0)
            {
                System.out.format(a[i]+" "+c+" ");
            }
        }
    }
}