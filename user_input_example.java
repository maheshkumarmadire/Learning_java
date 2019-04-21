import java.util.Scanner;
public class user_input_example {

	public static void main(String[] args) {
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the command prompt
		System.out.println("Enter Your Name");
		
		// Wait for the User input
		String line=input.nextLine();
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println("Enter a floting point value");
		double mydouble=input.nextDouble();
		
		System.out.println(" Your Name is : " + line);
		System.out.println(" You age is : " + age);
		System.out.println(" You double value  is : " + mydouble);
		
		// while loop
		System.out.println("Enter 5 to come out of While loop");
		int x=input.nextInt();
		while( x !=5)
		{
			System.out.println("Enter % to come out of while loop");
			x=input.nextInt();
		}
		
		
		do {
			System.out.println("Enter 7 to come out of Do-while loop");
			x=input.nextInt();
			
		}
		while (x !=7);
		

	}

}
