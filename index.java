import java.util.*;


class index

{
    
    
public static void main(String args[])
   
 {
       
Scanner sc=new Scanner(System.in);
      
String s=sc.nextLine();
macc(s);
}
 static void macc(String sx)
{
String s=sx;
int[] a=new int[s.length()];
int x=0;
for(String s1:s.split(""))
{
a[x++]=Integer.valueOf(s1);
}      
Arrays.sort(a);
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
for(int i=0;i<a.length;i++)
       
{
          
 if(i==a[i])
          
 System.out.println(a[i]+" ");
           
      
 }
       
	
}


}
