package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope{
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	Zodiac zodiac;
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	String input = JOptionPane.showInputDialog("Enter your Zodiac sign for a horoscope");
	String input2 = input.toUpperCase();
	void display() {
		zodiac = Zodiac.valueOf(input2);
		switch (zodiac) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Your slow and steady approach may need a sharp kick in the pants today.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Interaction with others may not be especially satisfying for you today.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Suddenly you've found your energy again. Your engine is oiled up and ready to go.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You may have the spark that wants to light things today.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "If people insist on having things their own way, let them.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "You may be a bit daunted by the frenzy of energy present in the air today.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "It's time to implement the plans you fostered as a result of internal processes over the past few days.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "The clouds have finally lifted, and you should be able to see clearly again.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Be a little braver than usual today.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Your mood should be quite good today.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Try to seek freedom and new experiences today.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Don't be surprised if unexpected actions from others give your heart a jolt today.");
			break;	
		default:
			System.out.println("error"); //default not working
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		h.display();
		
	}
}
