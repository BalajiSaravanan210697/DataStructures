package week2.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class PalindromorNot {
/* 1) Did I understand the problem?  
	Description : To Check the given integer reverse should be same with the given input integer
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int
	 *    What is the expected output? boolean
	 *    Do I have constraints to solve the problem? 
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Ex : 121 --> true
	 * 
	 * 3) Do I know how to solve it?
	 * 		Yes - great. 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
 
	 * 5) Start always with Pseudo code 
	 * 1.Get the Given input integer value
	 * 2.Convert the integer into string
	 * 3.  using for loop to print the string in reverse order
	 * 4.Temporary variable to store the reversed string
	 * 5. if(reverse value==coverted integer)
	 *      return true
	 *      
	 *      return false
      
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	
	@Test
	public void test() {
		boolean  actual=isPalindromorNot(121);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean  actual=isPalindromorNot(-121);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test2() {
		boolean  actual=isPalindromorNot(10);
		Assert.assertEquals(false, actual);
	}
	public boolean isPalindromorNot(int x) {
		String converted=Integer.toString(x);
		String temp="";
		for (int i = converted.length()-1;i >= 0; i--) {
			temp=temp+converted.charAt(i);
		}if(converted.equals(temp)) {   //121
			return true;
		}
		return false;	
	}
	
	
}
