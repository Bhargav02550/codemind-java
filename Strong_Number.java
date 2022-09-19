import java.util.Scanner;
class Solution
{
    public static int fact(int num)
    {
        if (num>=1)
        {
            return num*fact(num-1);
        }
        else
        {
            return 1;
        }
    }
    public static int sumf(int num2)
    {
        int r,s=0,f;
        while(num2!=0)
        {
            r=num2%10;
            f=fact(r);
            s+=f;
            num2=num2/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==sumf(n))
        {
            System.out.format("The number %d is a strong number",n);
        }
        else
        {
            System.out.format("The number %d is not a strong number",n);
        }
    }
}