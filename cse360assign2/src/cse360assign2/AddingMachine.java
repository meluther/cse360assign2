/* Molly Luther (1212646498)
 * CSE 360: Intro to Software Engineering
 * Assignment 2
 * The AddingMachine.java file contains the class definition for an adding 
 * machine object. There exists a private instance variable, a constructor, a 
 * get, add, substract, and toString method, as well as a clear method to reset
 * the adding machine. 
 */

/** AddingMachine contains one private int instance variable that represents the
 * total of all values added and subtracted, one constructor, a get method to 
 * return the total, adding and subtracting functions to adjust the total, a 
 * toString() function to print transaction history, and a clear function
 * to reset the adding machine. 
 *
 * @author mollyluther
 *
 */
package cse360assign2;

public class AddingMachine {
	
	private int total;
	
	/** Initializes AddingMachine object with int value of 0. There is no return
	 * value because this is a constructor. 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns current total value.    
	 * 
	 * @return 	total	int representing total calculated by adding machine
	 * 
	 */
	public int getTotal () {
		return 0;
	}
	
	/** Adds parameter to current total and stores sum in total. 
	 * 
	 * @param 	value	int to add to total 
	 * 
	 */
	public void add (int value) {
		
	}
	
	/** Subtracts parameter from current total and stores difference in total. 
	 * 
	 * @param 	value	int to subtract from total 
	 * 
	 */
	public void subtract (int value) {
		
	}
	
	/** Returns String containing adding machine's transaction history.    
	 * 
	 * @return 	string representation of adding machine
	 * 
	 */
	public String toString () {
		return "";
	}

	/** Resets adding machine,    
	 */
	public void clear() {
	
	}
}
