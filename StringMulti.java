import java.util.*;
import java.io.*;
 class StringMulti
 { 
	public static void main(String args[])
 	{ 
         Scanner sr=new Scanner(System.in);
         String s1=sr.nextLine();
         String s2=sr.nextLine();
         int n1=Integer.parseInt(s1);
         int n2=Integer.parseInt(s2);
         int m=n1*n2;
         System.out.println(String.valueOf(m));
}}
