import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int e=0,o=0;
        while(n>0)
        {
            if(n%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            n/=10;
        }
        if(e>1&&o==0)
        {
            System.out.format("Even");
        }
        else if(o>1 && e==0)
        {
            System.out.format("Odd");
        }
        else
        {
            System.out.format("Mixed");
        }
    }
}