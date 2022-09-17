import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        char c=Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.format("Vowel");
        }
        else
        {
            System.out.format("Consonant");
        }
    }
}