import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        char c=Character.toLowerCase(ch);
        if(c=='v')
        {
            System.out.format("Violet");
        }
        else if(c=='i')
        {
            System.out.format("Indigo");
        }
        else if(c=='b')
        {
            System.out.format("Blue");
        }
        else if(c=='g')
        {
            System.out.format("Green");
        }
        else if(c=='y')
        {
            System.out.format("Yellow");
        }
        else if(c=='o')
        {
            System.out.format("Orange");
        }
        else if(c=='r')
        {
            System.out.format("Red");
        }
        else
        {
            System.out.format("-1");
        }
    }
}