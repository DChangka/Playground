import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int num1,num2;
      Scanner in=new Scanner(System.in);
      num1=in.nextInt();
      num2=in.nextInt();
      if(num1>num2)
        System.out.println("num1 is the greatest number");
     else if(num2>num1)
        System.out.println("num2 is the greatest number");
      else
        System.out.println("They are both equal");
	}
}