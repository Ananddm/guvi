import java.io.*;
import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int f=1;
        if(n<0)
        {System.out.println("no output");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println(f);
        }
            
  }
}
