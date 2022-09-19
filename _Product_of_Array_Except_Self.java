import java.util.Scanner;
class product{
    
    public static void prodArray(int a[], int n){
        int p[] = new int[n], prod=1;
        for(int i=0; i<n; i++)
        {
            prod = prod * a[i];
        }
        for(int i=0; i<n; i++)
        {
            p[i] = prod / a[i];
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(p[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      product pro = new product();
      int n=s.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextInt();
      }
      pro.prodArray(a,n);
    }
}