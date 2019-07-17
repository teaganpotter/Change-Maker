package assignments;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much change would you like?");
		int change = scanner.nextInt();
		System.out.println(getChange(change));
		
		scanner.close();
	}
/** 
 * This method returns an output of String result that tells the user how much change he/she will receive
 * from the change maker. The method getChange takes the input from the user (int change) from the main
 * method (using the Scanner) and uses this as the formal parameter for the method. 
 * <p>
 * This method begins by defining the int variables of quarters, dimes, and nickels as their US currency
 * change value multiplied by 100 (to allow for these variables to be int instead of double). 
 * The method further defines variables, such as rQuarters, to be the amount of quarters the int change
 * value can produce. This process (continued for rDimes, rNickels, and rPennies) is done by simple
 * division. The modulus of the change value by quarters then creates and defines a new variable, 
 * int remainder. This value is redefined throughout the division processes until the only value remaining
 * is that of rPennies. 
 * <p>
 * The method then uses if statements in order to create a return value that will only print the amount
 * of each coin if there are coins to print, i.e. if there are 0 quarters, the return value should not
 * contain quarters. The method does this for each coin type, adding the result of the coin type to the 
 * previous result. The method then returns the result, allowing for the main method to print the String.
 *  
 * @param change the input taken from the user
 * @return the amount of change dispersed through each coin type
 */
	public static String getChange(int change) {
		String result = "Your change is " + change + " cents. "; 
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int rQuarters = change / quarters;
		int remainder = change % quarters;
		int rDimes = remainder / dimes;
		remainder = remainder % dimes;
		int rNickels = remainder / nickels;
		int rPennies = remainder % nickels;
		
		if (change >= 1 && change <= 99) {
			if (rQuarters != 0) {
				result = result + rQuarters + " Quarters ";
			}if (rDimes != 0) {
				result = result + rDimes + " Dimes ";
			}if (rNickels != 0) {
				result = result + rNickels + " Nickels ";
			}if (rPennies != 0) {
				result = result + rPennies + " Pennies";
			}
		}else {
			result = "Invalid change amount.";
		}
		
		return result;
	}	
}
