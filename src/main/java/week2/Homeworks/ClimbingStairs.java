package week2.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairs {
	
	/* 1) Did I understand the problem?  
	Description : To find the probabilities that to climp into a staris
	* 		-> If yes, go to next step !!
	 *    What is the input(s)? int
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 *     2) Test data set
	 *     Minimum of 3 data set !! Positive, Edge, Negative 
	 *     n =7  output --> 21
	 *     
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 *  
	 *  4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 
	 * 1.if n is greater than 1 the proceed with for loop 
	 * 2.declare the n1 = 1 and n2 = 2  because we start from the initial step possibilities and n3 variable as zero 
	 * 3.Create for loop to iterate the till the given input value not equal
	 * 4. n3=n1+n2  //1+2
	 *    n1=n2 
	 *    n2=n3
	 *      
	 *    return n3 value till the iteration done
	 * 5.return n1 if the value not greater than 1
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
		int actual = StaircasePossibilities(4);
		Assert.assertEquals(5, actual);
	}
	@Test
	public void test1() {
		int actual = StaircasePossibilities(6);
		Assert.assertEquals(13, actual);
	}
	@Test
	public void test2() {
		int actual = StaircasePossibilities(1);
		Assert.assertEquals(1, actual);
	}
	public int StaircasePossibilities(int n) {
		int n1=1,n2=2,n3=0;
		if(n>2) {
			for(int i=2;i<n;i++) {   
				n3=n1+n2;
				n1=n2; 
			    n2=n3;     
			} return n3;	
		}
		return n2;	
	}
}
