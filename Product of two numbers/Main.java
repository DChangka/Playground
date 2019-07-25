import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		int num1,num2;
      float product;
      Scanner in=new Scanner(System.in);
      num1=in.nextInt();
      num2=in.nextInt();
      product=num1*num2;
      System.out.println(product);
	}
}