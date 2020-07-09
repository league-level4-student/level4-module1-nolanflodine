package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("It is Sunday");
			break;
		case "Monday":
			System.out.println("It is Monday");
			break;
		case "Tuesday":
			System.out.println("Taco Tuesday");
			break;
		case "Wednesday":
			System.out.println("Hump Daaayy");
			break;
		case "Thursday":
			System.out.println("Day after hump day");
			break;
		case "Friday":
			System.out.println("Whoop Whoop");
			break;
		case "Saturday":
			System.out.println("Whoopty Shmoopty");
			break;
		}
	}
}
