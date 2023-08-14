package week1.day1.HomeworkProblems;

import org.junit.Assert;
import org.junit.Test;

public class PrimeorNot {
	/* 1) Did I understand the problem?  
	Description : The No is divisible by itself and 1 is called Prime No
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  int
	 *    What is the expected output? boolean
	 *    Do I have constraints to solve the problem? the number must be greater than 1
	 *    Do I have all informations to go to next step!! yes
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Testdata1 : 7 -->true
	 *      Testdata2 : 6 -->False
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the Integer value and check it greater than 1
	 * 2.Iterate the for loop less then given input integer value
	 * 3.Iterate the for loop and check if that input integer/index of the for loop == 0 (modulo) -->Yes - return false
	 *              return true
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	
	@Test
	public void test() {
		boolean actual=isPrimeorNot(5);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual=isPrimeorNot(6);
		Assert.assertEquals(false, actual);
	}
	public boolean isPrimeorNot(int input) {
		if(input>1) {
			for (int i = 2; i < input; i++) {
				if(input%i==0) {
					return false;
			     }
			}
		}
		return true;	
	}
}
