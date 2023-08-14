package week3.day1.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstPalindrom {
	/* 1) Did I understand the problem?  
	Description : To find the first palindrom string present in the given input array
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  String[]
	 *    What is the expected output?  String
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
       
         words = ["abc","car","ada","racecar","cool"] -->"ada"
         words = ["notapalindrome","racecar"] -->"racecar"
         words = ["def","ghi"] --> ""
	 * 3) Do I know how to solve it?
     	Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the String [] values
	 * 2.Get the value and store into temp variable
	 * 3.Iterate the values using for loop in reverse
	 * 4.compare the reversed string with the temp variable stored string 
	 * 5. if equals return str
	 * 5     return "";

	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	@Test
	public void test() {
		String actual = findPalidndromfromarray(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals("ada", actual);
	}
	@Test
	public void test1() {
		String actual = findPalidndromfromarray(new String[] {"notapalindrome","racecar"});
		Assert.assertEquals("racecar", actual);
	}
	@Test
	public void test2() {
		String actual = findPalidndromfromarray(new String[] {"def","ghi"});
		Assert.assertEquals("", actual);
	}
	
	public String findPalidndromfromarray(String[] words) {
		String temp="";
		String reverse="";
		
		for (int i = 0; i < words.length; i++) {
			temp = words[i];   //abc
			for (int  j = temp.length()-1; j >= 0;j--) { //cbarac
				reverse=reverse+temp.charAt(j);	
			}
			if(reverse.equals(temp)) {
				return temp;}
			else {
				reverse="";
			}
		}
		return "";
	}

}
