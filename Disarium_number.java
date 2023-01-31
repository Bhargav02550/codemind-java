import java.util.*;
class solution{
    public static int lenght(int n){
        int h=0;
        while(n!=0)
        {
            h++;
            n/=10;
        }
        return h;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,s=0,l,r;
        l=lenght(n);
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            s+=(int)Math.pow(r,l);
            temp=temp/10;
            l--;
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}