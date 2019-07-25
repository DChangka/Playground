import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int i,factorial=1;
       for(i=1;i<=n;i++)
       {
         factorial=factorial*i;
       }
      System.out.print(factorial);
	}
}