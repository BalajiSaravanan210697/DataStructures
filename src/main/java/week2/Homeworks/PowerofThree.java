package week2.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class PowerofThree {
	/* 1) Did I understand the problem?  
	Description : To check the given input number is power of three or not
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
            27  --> true
            0,-1 --> false
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
       1. Get the input value
       2. while(input%3==0)
       3. input=input/3
       4. if n==1
       5. return true
       6. return false   
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		boolean actual= isPowerof3orNot(27);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual= isPowerof3orNot(0);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test2() {
		boolean actual= isPowerof3orNot(-1);
		Assert.assertEquals(false, actual);
	}
	public boolean isPowerof3orNot(int num) {
		if(num>1) {
		while(num%3==0) {
			num=num/3;
		} if(num==1) {
			return true;
		}}
		return false;
		
	}

}
