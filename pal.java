import java.util.*;
class pal
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int t=0,sum=0,k=0;
while(n!=0)
{
t=n%10;
sum=sum+t;
n=n/10;
}
System.out.println(sum);
int t1,a;
t1=sum;
while(sum>0)
{
a=sum%10;
k=(k*10)+a;
sum=sum/10;
}
if(t1==k)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}
     
