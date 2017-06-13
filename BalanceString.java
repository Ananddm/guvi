import java.io.*;
import java.util.*;

class BalaceString
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int count=0;
        int count1=0;
        String str=s.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
        char str2[]=str1[i].toCharArray();
        if(str2.length%2!=0)
        {
            System.out.println(str1[i]+"is not balanced");
            continue;
        }
        for(int j=0;j<str2.length;j++)
			{
			if((str2[j]>='A'&&str2[j]<='M')||(str2[j]>='a'&&str2[j]<='m'))
			{
				count++;
			}
			
			if((str2[j]>='N'&&str2[j]<='Z')||(str2[j]>='n'&&str2[j]<='z'))
			{
				count1++;
			}}
		
		if(count==count1)
		{
		    System.out.println(str1[i]+"is balanced");
		}
		else{
		    System.out.println(str1[i]+"is not balanced");
		}

        }
        }
}
