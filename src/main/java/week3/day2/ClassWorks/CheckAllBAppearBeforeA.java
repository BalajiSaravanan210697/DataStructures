package week3.day2.ClassWorks;

import org.junit.Assert;
import org.junit.Test;

public class CheckAllBAppearBeforeA {
	/* 1) Did I understand the problem?  
	Description : To check that all a's present before b's present in the string
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? String
	 *    What is the expected output? boolean
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            s = "aaabbb"  --> true
            s = "abab"   --> false
            s=   "bbb"   --> true
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the input String
	 * 2.Check that all a's present before present b using contains of the string "ba"
	 * 3.if present the return false
	 * 4.else return true
     
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		boolean actual=allAPrsentBeforeB("aaabbb");
		Assert.assertEquals(true, actual);
		}
	@Test
	public void test1() {
		boolean actual=allAPrsentBeforeB("abab");
		Assert.assertEquals(false, actual);
		}
	@Test
	public void test2() {
		boolean actual=allAPrsentBeforeB("bbb");
		Assert.assertEquals(true, actual);
		}

	public boolean allAPrsentBeforeB(String str) {
		if(str.contains("ba")) {
			return false;
		}
		return true;
		
	}
}
