# Divisor
  import java.io.*;
import java.util.*;
public class Division
{
  public  static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);  
    int count=0;  
    int div=sc.nextInt();
    int divisor=sc.nextInt();  
    while(div>=0)
    {
      div=div-divisor;
      count ++;
    }
    System.out.println(count-1);
  }
}
    
