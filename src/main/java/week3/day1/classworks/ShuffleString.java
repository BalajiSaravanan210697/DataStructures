package week3.day1.classworks;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {
	/* 1) Did I understand the problem?  
	Description : To recreate a String using the given input indices rearrange
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[] , String 
	 *    What is the expected output? String 
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            s = "codeleet", indices = [4,5,6,7,0,1,2,3] --> leetcode
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the input values of int[] and String
	 * 2.using for loop to iterate the input array and values 
	 * 3.Get the character at the indices of i 
	 * 4.Store it into a string

	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	@Test
	public void test() {
	String actual=	shffleStringafter("codeleet",new int[] {4,5,6,7,0,2,1,3});
	Assert.assertEquals("leetcode",actual);
	}	
	@Test
	public void test1() {
	String actual=	shffleStringafter("abc",new int[] {0,1,2});
	Assert.assertEquals("abc",actual);
	}	
	public String shffleStringafter(String s,int[] indices) {
		char[] temp = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            temp[indices[i]] = s.charAt(i);    
        }
        return new String(temp);	
	}
}
