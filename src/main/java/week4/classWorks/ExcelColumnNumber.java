package week4.classWorks;

import org.junit.Assert;
import org.junit.Test;

public class ExcelColumnNumber {
	/* 1) Did I understand the problem?  
	Description : To find the the column value of given input String
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  String
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            Input: columnTitle = "A" --> Output: 1
            Input: columnTitle = "AB" --> Output: 28
            Input: columnTitle = "ZY" --> Output: 701
     
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the input String 
	 * 2.Iterate the string using for loop
	 * 3.get the character in the string using chatAt method
	 * 4.store the character value using ASCII value
	 * 5. return the result
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	
	@Test
	public void test() {
		int actual=excelColoumnVale("AA");
		System.out.println(actual);
		Assert.assertEquals(27, actual);
	}
	@Test
	public void test1() {
		int actual=excelColoumnVale("AB");
		System.out.println(actual);
		Assert.assertEquals(28, actual);
	}
	@Test
	public void test2() {
		int actual=excelColoumnVale("ZY");
		System.out.println(actual);
		Assert.assertEquals(701, actual);
	}
	public int excelColoumnVale(String str) {
		int result=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			int value=ch-'A'+1;
			result=result*26+value;
		}
		return result;
		
	}
}
