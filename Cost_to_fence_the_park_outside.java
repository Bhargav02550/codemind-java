import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        int w=s.nextInt();
        int c=s.nextInt();
        int area=((l+2*w)*(b+2*w))-l*b;
        System.out.format("%d",area*c);
    }
}