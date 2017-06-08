import java.io.*;
import java.util.*;

class Integeras
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String n=String.valueOf(a);
        
        String f[]=n.split("");
        Arrays.sort(f);
        for(int i=0;i<f.length;i++)
        {
        System.out.print(f[i]);
    }
    }
}
