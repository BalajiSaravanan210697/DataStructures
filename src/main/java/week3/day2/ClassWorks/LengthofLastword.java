package week3.day2.ClassWorks;

import org.junit.Assert;
import org.junit.Test;

public class LengthofLastword {
	/* 1) Did I understand the problem?  
	Description : To Get the length of the Last Word
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? String 
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *  "Hello World"  --> 5
	 *  "   fly me   to   the moon  " --> 4
	 *  "luffy is still joyboy" --> 6
         
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
     1.Get the Input string 
     2.Trim the string using trim method
     3.Reverse the String value
     4.If the string contains space then break
     5. get the length of the stored string
      
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = LengthofLastWord("Hello World");
		System.out.println(actual);
		Assert.assertEquals(5, actual);
	}
	@Test
	public void test1() {
		int actual = LengthofLastWord("   fly me   to   the moon  ");
		System.out.println(actual);
		Assert.assertEquals(4, actual);
	}
	@Test
	public void test2() {
		int actual = LengthofLastWord("luffy is still joyboy");
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}
	
	public int LengthofLastWord(String s) {
		 String temp="";//"Hello World" 
		 String trimmedvalue=s.trim(); 
		 for (int i =trimmedvalue.length()-1; i >=0 ; i--) {
		 if(trimmedvalue.charAt(i)!=' ') {
		 temp=temp+s.charAt(i); 
		 System.out.println(temp);
		 }
		 else break; 
		 }
	    return temp.length();
	}	
	
}
