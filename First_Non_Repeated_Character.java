import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        while(n-->0)
        {
            int c=s.nextInt();
            String str=s.next();
            for(int i=0;i<str.length();i++)
            {
                x=0;
                for(int j=0;j<str.length();j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        x++;
                    }
                }
                if(x==1)
                {
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(x!=1)
            {
                System.out.format("-1
");
            }
        }
    }
}