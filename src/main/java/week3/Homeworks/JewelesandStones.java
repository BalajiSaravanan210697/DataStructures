package week3.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class JewelesandStones {
	/* 1) Did I understand the problem?  
	Description : To find that how many jewels i have in my hand
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? String String
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            Input: jewels = "aA", stones = "aAAbbbb"
            Output: 3
            Input: jewels = "z", stones = "ZZ"
            Output: 0
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	   1.Get the both input String values
	   2.Store the String jewels into character array using for loop
	   3.Get the stones input and convert into characters and check with stored character array values
	   4.    if the jewels char array values match with the stones char array then increase the count 
	   5.    return the count
     
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = tocountnoofjewels("aA","aAAbbbb");
		
		Assert.assertEquals(3, actual);
	}
	@Test
	public void test1() {
		int actual = tocountnoofjewels("z","ZZ");
		Assert.assertEquals(0, actual);
	}
	
	public int tocountnoofjewels(String jewels,String stones) {
		int count=0;
		char[] jewelschar=jewels.toCharArray();
		char[] stoneschar=stones.toCharArray();
		for (int i = 0; i < jewelschar.length; i++) {
			for (int j = 0; j < stoneschar.length; j++) {
				if(jewels.charAt(i)==stones.charAt(j)) {
					count++;
					}	
			}	
		}
		return count;
	}
	

}
