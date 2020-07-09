package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope{
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	Zodiac zodiac;
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void display() {
		switch (zodiac) {
		case ARIES:
			
			break;
		case AQUARIUS:
			
			break;
		case CANCER:
			
			break;
		case CAPRICORN:
			
			break;
		case GEMINI:
			
			break;
		case LEO:
			
			break;
		case LIBRA:
			
			break;
		case PISCES:
			
			break;
		case SAGITTARIUS:
			
			break;
		case SCORPIO:
			
			break;
		case TAURUS:
			
			break;
		case VIRGO:
			
			break;			
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h = new _00_Horoscope();
		h.display();
		
	}
}
