import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,sum=0;
    System.out.println("Enter an integer:");
    a=sc.nextInt();
    for(int i=1;i<=a;i++)
    {
      sum=sum+i;
      }
      System.out.println("The sum of natural numbers of:"+sum);
    }
}
