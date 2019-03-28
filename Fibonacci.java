import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter valid number");
	 int n = scan.nextInt();
      
	int r= Fiborek(n);
	int s=fiboiter(n);
	System.out.println(r);
	System.out.println(s);
}

public static int  Fiborek(int n) {
	// input n
	// n is decreasing to 0
	// until n > 1 continue
	// if n == 1 stop
	if( n < 2 ) {
		// basic case : continue
		return n;
	} else {
		// stop case
		return Fiborek(n-1)+Fiborek(n-2);
	}
	
}

public static int fiboiter(int n) {
	
	int a = 0; 
	int b = 0;
	int c = 1;
	if(n<2) {
		a=n;
	}
	else {
		for(int i =1; i<n;i++ ) {
			a=b+c;
			int temp = c;
		    c=a;
			b=temp;
		}
	}
	return a;
}
	
}
