import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      	 int n=in.nextInt();
      	 int i;
     	 int odd=(2*n)-1;
      	 
      	 for(i=1;i<=odd;i=i+2)
         {
          System.out.println(i);
         }
      	 
         
	}
}