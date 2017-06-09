import java.io.*;
import java.util.*;

class Kinder {
    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
	int i,n,j,k,l=0;
	k=s.nextInt();
	n=2*k;
	for(i=1;i<n;i++)
   {
   for(j=i+1;j<=n;j++)
   {
      System.out.println(i+""+j);
      l++;
	}}	System.out.println("pairs"+l);

}}
