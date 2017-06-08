import java.io.*;
import java.util.*;

class OrderorNot
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int a[]=new int[n];
        for(int i=0;i<n;i++){a[i]=s.nextInt(); }
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++){ c[i]=a[i];}
    Arrays.sort(a);
    if(a==c){System.out.println("order");}
    else{System.out.println("not");}
    }
}
