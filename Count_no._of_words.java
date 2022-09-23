import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                c++;
            }
        }
        System.out.format("%d",c+1);
    }
}