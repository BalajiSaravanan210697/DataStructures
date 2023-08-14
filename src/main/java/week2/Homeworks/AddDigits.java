package week2.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class AddDigits {
	
	/* 1) Did I understand the problem?  
	Description : To count the unless the given input intoi single integer value
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Ex: 38 --> 2
	 *      
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the Integer Value 
	 * 2.Create a While loop and check that greater than 9 because we doesn't want one digit value
	 * 3. create a variable and store the remainder ex : 38%2 = 8
	 * 4.  Get the the Remain value to Substarct it from Remainder  ex: 38-8 =30
	 * 5.  Create another variable and store the Quotient ex: 30/10 = 3
	 * 6. Add Remainder + Quotient = 8+3 = 11
	 * 7. Increase the counter ++
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
		int actual = AddDigitsTillcountone(38);
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test1() {
		int actual = AddDigitsTillcountone(24);
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test2() {
		int actual = AddDigitsTillcountone(0);
		Assert.assertEquals(0, actual);
	}
	public int AddDigitsTillcountone(int nums) {
		int count = 0;
		int temp=0;
		int numafterRemainder=0;
	    int Remainder=0;
		while(nums>9) {//38
			Remainder=nums%10;
			numafterRemainder=nums-Remainder;
			temp=numafterRemainder/10;
			nums =temp+Remainder;	
			count++;
		}
		return count;
	}
	}
