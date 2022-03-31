import java.io.Console;
import java.util.Scanner;

public class Surface{
	public static void main(String[] args) {
		int a ;
		int b;
		int s ;
		Scanner console = new Scanner(System.in);
		System.out.println("donner la longeur du rectangle");
		a = console.nextInt();
		System.out.println("donner la largeur du rectangle");
		b = console.nextInt();
		s= a*b ;
		System.out.println("la surface est "+s);
		
	}
	
	
}