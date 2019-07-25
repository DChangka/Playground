import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int number,n1,n2;
      Scanner in=new Scanner(System.in);
      number=in.nextInt();
      n1=number/10;
      n2=n1%10;
      System.out.println(n2);
    
	}
}