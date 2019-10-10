/* Molly Luther (1212646498)
 * CSE 360: Intro to Software Engineering
 * Assignment 2
 * The AddingMachine.java file contains the class definition for an adding 
 * machine object. There exists a private instance variable, a constructor, a 
 * get, add, subtract, and toString method, as well as a clear method to reset
 * the adding machine. 
 */

package cse360assign2;

/** 
 * AddingMachine contains one private int instance variable that represents the
 * total of all values added and subtracted, one private String instance 
 * variable that represents the transaction history, one constructor, a get 
 * method to return the total, adding and subtracting functions to modify the 
 * total, a toString() function to print the history, and a clear function to 
 * reset the adding machine's history back to 0. 
 *
 * @author mollyluther
 */
public class AddingMachine {
	
	private int total;
	private String history = ""; // make empty otherwise prints null in toString
	
	/** 
	 * Initializes AddingMachine object with int value of 0. There is no return
	 * value because this is a constructor. 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history += total;
	}
	
	/** 
	 * Returns current total value.    
	 * 
	 * @return 	total	int representing total calculated by adding machine
	 */
	public int getTotal () {
		return total;
	}
	
	/** 
	 * Adds parameter to current total and stores sum in total. 
	 * 
	 * @param 	value	int to add to total 
	 */
	public void add (int value) {
		total += value;
		history += " + "; 
		history += value; 
	}
	
	/** 
	 * Subtracts parameter from current total and stores difference in total. 
	 * 
	 * @param 	value	int to subtract from total 
	 */
	public void subtract (int value) {
		total -= value;  
		history += " - "; 
		history += value;
	}
	
	/** Returns String containing adding machine's transaction history.    
	 * 
	 * @return 	String 	representation of adding machine past operations
	 */
	public String toString () {
		return history;
	}

	/** 
	 * Resets adding machine back to 0.  
	 */
	public void clear () {
		history = "0"; 
	}
}
