import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int a=s.nextInt();
            int c=1;
            int [] arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=s.nextInt();
            }
            for(int i=0;i<a-1;i++){
                if(arr[i]>arr[i+1]){
                    c+=1;
                }
            }
            System.out.format("%d
",c);
        }
    }
}