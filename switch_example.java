import java.util.Scanner;
public class switch_example {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter command start/stop");
		String text=input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Machine Started");
		    break;
		case "stop":
			System.out.println("Machine STOPPED");
			break;
		default:
			System.out.println(" Command not recognized");
		}

	}

}
