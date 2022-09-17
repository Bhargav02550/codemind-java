import java.util.Scanner;
class miss
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int m=0;m<n;m++)
        {
            int a=s.nextInt();
            int[] arr=new int[a];
            int sum=0,c=0;
            for(int i=0;i<a-1;i++)
            {
                arr[i]=s.nextInt();
                sum+=arr[i];
            }
            for(int j=1;j<=a;j++)
            {
                c+=j;
            }
            int ans=c-sum;
            System.out.format("%d
",Math.abs(ans));
        }
    }
}