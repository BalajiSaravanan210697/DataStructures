package week2.day2.classroom;

import org.junit.Assert;
import org.junit.Test;

public class Poweroftwo {
	/* 1) Did I understand the problem?  
	Description : To given input number is power of 2 or not
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  int
	 *    What is the expected output?  boolean
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      ex :16 -->true
	 *      ex;20 -->false
	 *    
	 * 
	 * 3) Do I know how to solve it?
	 * 		Yes - great. 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * reverse 
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the input value
	 * 2.while(true){
	 * if(n%2==0){
	 *  n=n/2==0
	 *  return true
	 * }else{
	 * return false
	 * }
	 * }
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
		boolean actual=isPoweroftwoornot(16);
		Assert.assertEquals(true, actual);
		}
	
	@Test
	public void test1() {
		boolean actual=isPoweroftwoornot(20);
		Assert.assertEquals(false, actual);
	}
	public boolean isPoweroftwoornot(int input) {
		while(input%2==0) {
			input=input/2;
			}
		if(input==1) {
			return true;
		}
		return false;	
	}
}
