import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter valid number");
		 int n = scan.nextInt();
	      
		int r= Factorial(n);
		System.out.println(r);
	}
	
	public static int  Factorial(int n) {
		// input n
		// n is decreasing to 0
		// until n > 1 continue
		// if n == 1 stop
		if( n > 1 ) {
			// basic case : continue
			return n*Factorial(n-1);
		} else {
			// stop case
			return 1;
		}
	}

}

