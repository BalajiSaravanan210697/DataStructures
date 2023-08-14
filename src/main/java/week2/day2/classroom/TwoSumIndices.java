package week2.day2.classroom;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumIndices {
	/* 1) Did I understand the problem?  
	Description : To find the sum of given target element from array values indices
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[] int target element
	 *    What is the expected output?  int[]
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      nums = [2,7,11,15], target = 9
	 * 
	 * 3) Do I know how to solve it?
	 * 		Yes - great. 
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1. Get the int[]  and int target element
	 * 2.A nested loops to compare the values from nums[i] and nums[j]
	   if (nums[i]+nums[j]=target element)
	       return new int[] {i,j}
	       return new int[] {-1,-1}
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
		int[] actual = FindTwoSum(new int[] {2,7,11,15},9);
		Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
	@Test
	public void test1() {
		int[] actual = FindTwoSum(new int[] {3,2,4},6);
		Assert.assertArrayEquals(new int[] {1,2}, actual);
	}
	@Test
	public void test2() {
		int[] actual = FindTwoSum(new int[] {3,3},6);
		Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
	public int[] FindTwoSum(int[] nums,int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
				 return new int[] {i,j};
				}	
			}
		}
	    return new int[] {-1,-1};
	}

}
