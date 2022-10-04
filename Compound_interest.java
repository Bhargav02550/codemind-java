import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        double ci=Math.pow((1+r/100.0),t)*p;
        System.out.format("%.2f",ci);
    }
}