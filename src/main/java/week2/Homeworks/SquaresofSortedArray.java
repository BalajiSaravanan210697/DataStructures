package week2.Homeworks;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquaresofSortedArray {

	/* 1) Did I understand the problem?  
	Description : To find the squares of each element in array and store in non decreasing order
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[]
	 *    What is the expected output? int[]
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
[-4,-1,0,3,10]  --> [0,1,9,16,100]
[-7,-3,2,3,11] --> [4,9,9,49,121]
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Create a for loop to iterate the int[] values
	 * 2.multiply i*i and store the value again to i index
	 * 3.Arrays.sort the overall array
	 * 4.return the array  

	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	@Test
	public void test() {
		int[] actual = squareofArray(new int[] {-4,-1,0,3,10});
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, actual);
	}
	@Test
	public void test1() {
		int[] actual = squareofArray(new int[] {-7,-3,2,3,11});
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, actual);
	}
	public int[] squareofArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]*nums[i];	
		}
		Arrays.sort(nums);
		return nums;	
	}
}
