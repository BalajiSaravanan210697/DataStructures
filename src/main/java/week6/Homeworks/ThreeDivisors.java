package week6.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class ThreeDivisors {
	/* 1) Did I understand the problem?  
	Description : To Find the divisors of given input value 
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int 
	 *    What is the expected output? boolean 
	 *    Do I have constraints to solve the problem? 1 <= n <= 100000
	 *    Do I have all informations to go to next step!! Yes
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            Positive :4
                      6
                      7
                      2
                      9
            Edge :    1  --> False
                      9999 --> False
            Negative case : 0 --> expected 'n' to have value from 1 to 10000 only
                            100000  --> expected 'n' to have value from 1 to 10000 only

     
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 
	  > Initialize the count variable and declare to 0
	  > for loop to iterate the i value from 1 and i less than or equal to n   n is a input integer value
	  > if the n value modulo by i value  then increase the count  n%i ==0  --> Count++
	  > if the count is equal to 3 then return true
	  > return false for all other count values                   
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		boolean actual = threeDivisorforinputN(9);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual = threeDivisorforinputN(4);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void test2() {
		boolean actual = threeDivisorforinputN(1);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test3() {
		boolean actual = threeDivisorforinputN(9999);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test5() {
		 threeDivisorforinputN(-1);
	}
	@Test
	public void test6() {
		 threeDivisorforinputN(10001);
	}
	public boolean threeDivisorforinputN(int n) {
		int count=0;
		if(n<1||n>10000) {System.out.println("expected 'n' to have value from 1 to 10000 only");}
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count++;
			}
		} if(count==3) {
			return true;
		}
		return false;
		
	}

}
