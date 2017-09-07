import java.util.Scanner;
public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean keepGoing = true;
		
		Scanner userKeyboard = new Scanner(System.in);
		
		System.out.println("Set Password");
		String password = userKeyboard.nextLine();
		while (keepGoing) {
			System.out.println("Password?");
			String userAttempt = userKeyboard.nextLine();
			
			
			if (userAttempt.equalsIgnoreCase(password)){
				System.out.println("Success! Again?");
				String userResponse = userKeyboard.nextLine();
				userResponse = userResponse.substring(0, 1);
				if (userResponse.equalsIgnoreCase("y")){
					keepGoing = true;
				} else {
					System.out.println("Sorry. Command Not recognized. Exitting.");
					System.exit(0);
				}
			} else {
			System.out.println("Fail! Again?");
			String userResponse = userKeyboard.nextLine();
			userResponse = userResponse.substring(0, 1);
			if (userResponse.equalsIgnoreCase("y")){
				keepGoing = true;
			} else {
				System.out.println("Sorry. Command Not recognized. Exitting.");
				System.exit(0);

					}
			}
			
			
		} 
		
		
		
	}

}
