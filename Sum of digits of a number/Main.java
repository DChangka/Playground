import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int n1=0;
      while(n>0)
      {
        
       n1=n%10;
        sum=sum+n1;
        n=n/10;
       
        
      }
      
      System.out.println(sum);
    }
}

        
      
  
        
	
