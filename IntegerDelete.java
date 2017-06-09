import java.io.*;
import java.util.*;
class IntegerDelete{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int r=s.nextInt();
String n=String.valueOf(a);
String f[]=n.split("");
Arrays.sort(f);
int d[]=new int[f.length];
for(int i=0;i<f.length;i++)
{d[i]=Integer.parseInt(f[i]);}
for(int i=0;i<d.length;i++){if(i<(d.length-(r))){System.out.print(f[i]);
}}}}
