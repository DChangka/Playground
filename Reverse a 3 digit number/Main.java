import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n1,n2,n3,number;
    Scanner in=new Scanner(System.in);
    number=in.nextInt();
    n1=number%10;
    n2=(number/10)%10;
    n3=number/100;
    System.out.print(n1);
    System.out.print(n2);
    System.out.print(n3);
  }
}