import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int d = 0;		
		while(scan.hasNext()){
			int n = scan.nextInt();
			
					
			BigInteger a = BigInteger.ONE;
			BigInteger b = BigInteger.ONE;		
			BigInteger c = BigInteger.ONE;			

			for(int i = 1; i <= 2*n; i++){
				a = a.multiply(BigInteger.valueOf(i));
				if(i == n) {
					b = a;
				}
				if(i == n + 1) {
					c = a;
				}
			}	
			BigInteger catalanN = a.divide(b.multiply(c));			
			
			if(d == 1) System.out.println();			
			System.out.println(catalanN);
			d = 1;
		}
	}
}
