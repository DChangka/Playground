import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	int n1,n2,number,sum;
      Scanner in=new Scanner(System.in);
      number=in.nextInt();
      n1=number/100;
      n2=number%10;
      sum=n1+n2;
      System.out.println(sum);
      
	}
}