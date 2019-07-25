import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last_digit=0,first_digit=0;
      int sum=0;
      last_digit=n%10;
      while(n>10)
      {
        n=n/10;
    	first_digit=n%10;
      }
      sum=first_digit+last_digit;
      	System.out.print(sum);
	}
}