import java.util.Scanner;
public class Fibonacci {
  public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count;    
 System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();  
          scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

    
 for(i=2;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 } 
}
}


