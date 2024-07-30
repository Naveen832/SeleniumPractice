
public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num = 50;
      int c=2;
      if(num<=1) {
    	  System.out.println("neither prime or not");
      }
      while(c<num) {
    	  if(num%c==0) {
    		  System.out.println("not prime number");
    	  }
    	  c=c+1;
      }
    	  System.out.println("prime number");
    	}
  //   System.out.println("prime number");
	}


