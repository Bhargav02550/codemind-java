import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String moves=s.nextLine();
        int leftright = 0, updown = 0;
        for(int i = 0 ; i<moves.length() ; i++){
            if(moves.charAt(i) == 'U')  updown++;
            else if(moves.charAt(i) == 'D')  updown--;
            else if(moves.charAt(i) == 'R')  leftright++;
            else if(moves.charAt(i) == 'L')  leftright--;
        }
        if(updown==0 && leftright==0)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}