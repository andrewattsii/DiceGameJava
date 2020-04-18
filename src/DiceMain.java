import  java.util.Random;

class DiceOne{
	public static int DiceOneRoll() {
		Random diceOneRandom = new Random();
		int random = diceOneRandom.nextInt(7);
		return random;
	}
}
class DiceTwo{
	public static int DiceTwoRoll() {
		Random diceTwoRandom = new Random();
		int random = diceTwoRandom.nextInt(7);
		return random;
	}
}
public class DiceMain {

	public static void main(String[] args) {
		
		int num1 = DiceOne.DiceOneRoll();
		int num2 = DiceTwo.DiceTwoRoll();
		int tot = num1+ num2;
		if(num1 == num2) {
			System.out.println("First Dice :" + num1);
			System.out.println("Second dice :" + num2);
			System.out.println("Total : " + tot);
			System.out.println("You have rolled snake eyes, roll again");
		}
		else if (num1 != num2) {
			int number = num1 + num2 ;
			if(number == 6) {
				System.out.println("First Dice :" + num1);
				System.out.println("Second dice :" + num2);
				System.out.println("Total : " + tot);
				System.out.println("You have won the pot is yours, be sure to complete the rounds of rolling before claining your money");
			}
			else {
				System.out.println("First Dice :" + num1);
				System.out.println("Second dice :" + num2);
				System.out.println("Total : " + tot);
				System.out.println("numbers not equal to 6. Roll again.");
			}
		}
		else {
			System.out.println("You rolled :");
			System.out.println(num1 + num2);
		}
	}

}
