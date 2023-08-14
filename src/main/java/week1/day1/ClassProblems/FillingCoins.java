package week1.day1.ClassProblems;

import org.junit.Assert;
import org.junit.Test;

public class FillingCoins {
	/* 1) Did I understand the problem?  
	Description :  To Find the the rows filled fully based on given input
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int n
	 *    What is the expected output? int 
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *     * Input: n = 5
           * Output: 2
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the Input value
	 * 2.Using for loop to iterate i should be start with 1 till element the n  consider 1
	 * 3. variable balance to be declared n-i    n =10  10-1  = 9 
	 *    if(i<balance){
	
	 * 4. variable count++ to increase the completed rows }
	 * 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	
	@Test
	public void test() {
		int actual = FindRowCount(5);
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test1() {
		int actual = FindRowCount(6);
		Assert.assertEquals(3, actual);
	}
	
	public int FindRowCount(int n) {
		int count=0; // Completed rows
		int balance = 0; //to store the balance coins
		for (int i = 1; i <= n; i++) {
			balance = n-i; //substract the coins by row completed
			if(i<balance) {
				count++;
				}	
			}
		return count;
	}	 
}
