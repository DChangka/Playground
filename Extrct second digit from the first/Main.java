import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int second_digit=0;
      while(n>100)
      {
        n=n/10;
      
      }
       second_digit=n%10;
      System.out.println(second_digit);
    }
}