import java.util.Scanner;
 class numsys
{
public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
int fl=0;
String s=String.valueOf(i);
for(String s1:s.split(""))
{
if(s1.equals("3")) 
{
fl++;
}
if(s1.equals("4"))
{
fl++;
}
}
if(fl==s.length())
{
System.out.println(i);
}
}
}
}
