/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	
	public static void main(String[] args) {
		Card card1 = new Card("7","Heart" , 7);
		Card card2 = new Card("7", "Heart", 7);
		Card card3 = new Card("7", "Diamond", 7);
		System.out.println(card1.toString());
		if(card1.matches(card2)) {
			System.out.println("Yes, Card1 matches card2.");
		}
		else {
			System.out.println("No card1 does not match card2.");
		}
		
		if(card1.matches(card3)) {
			System.out.println("Yes card1 matches card3.");
		}
		else {
			System.out.println("No card1 does not match card3.");
		}
		
	}
}
