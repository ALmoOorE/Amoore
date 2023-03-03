package javacourse;
import java.util.*;
public class FavNum {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("What is your favorite number");
		n = input.nextInt();
		
		//compute next number
		n = n + 1;
		
		//output to console
		System.out.println();
		System.out.println("My favorite number is 1 more than that," + n);
		System.out.println();
		System.out.println();
		input.close();
	
		

	}

}
