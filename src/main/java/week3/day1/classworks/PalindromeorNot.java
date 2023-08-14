package week3.day1.classworks;

import org.junit.Assert;
import org.junit.Test;



public class PalindromeorNot {
	/* 1) Did I understand the problem?  
	Description : To check the given String is palindrom or not
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
            "A man, a plan, a canal: Panama"  --> true
            "race a car" --> false
            " " --> false
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
     1.Choose the alpha numerice characters from the given input string 
     2.convert it into a lowercase
     3.convert the string into a char[] array
     4.Reverse using for loop from reverse iterataion 
     5. compare with lowercase converted string 
        if both values equals return true
            return false
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	
	@Test
	public void test() {
		boolean actual = isPalindromorNot("A man, a plan, a canal: Panama");
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual =  isPalindromorNot("race a car");
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test2() {
		boolean actual = isPalindromorNot(" ");
		Assert.assertEquals(true, actual);
	}
	
	public boolean isPalindromorNot(String input) {
		String Reverse ="";
		String AfterCoversion = input.replaceAll("[^a-zA-Z0-9]", "");
		String CovertedString = AfterCoversion.toLowerCase();
		char[] chr= CovertedString.toCharArray();
		for (int i = chr.length-1;i >= 0;  i--) {
			Reverse=Reverse+chr[i];
		} 
		if(Reverse.equals(CovertedString)) {
			return true;
		}
		return false;	
	}

}
