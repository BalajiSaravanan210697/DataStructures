package week3.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class PivotElement {
	
	/* 1) Did I understand the problem?  
	Description : To Find the pivot element from the given input integer array
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? Int[]
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
         Input: nums = [1,7,3,6,5,6]  --> 3
         Input: nums = [1,2,3] --> -1
         Input: nums = [2,1,-1] --> 0
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	   1.Get the integer array values and get the length of an array
	   2.create a while loop to check the the array length is not equal to pivot
	   3.create a for loop to get the value of left hand side iteration
	   4.Create a for loop to get the value of right hand side iteration
	   5. using if check that leftsum==rightsum
	                  return i
	                  else return -1
	                  Increment the pivot for each iteration      
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual=tofindthePivotElement(new int[] {1,7,3,6,5,6});
		Assert.assertEquals(3, actual);
	}
	public int tofindthePivotElement(int[] nums) {
		int leftsum=0;
		int rightsum=0;
		int pivorposition=0;
		while(nums.length!=pivorposition){
			for (int i = pivorposition+1; i < nums.length; i++) {
				rightsum+=nums[i];
			}
			for (int i = 0; i <= pivorposition; i--) {
				leftsum+=nums[i];	
			}
			if(leftsum==rightsum) {
				return pivorposition;
			}leftsum=0;
			rightsum=0;
			pivorposition++;
		}
		
		return -1;
		
	}

}
