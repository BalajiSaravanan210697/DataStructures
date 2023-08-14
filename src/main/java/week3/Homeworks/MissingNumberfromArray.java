package week3.Homeworks;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberfromArray {
	/* 1) Did I understand the problem?  
	Description : To find the missing number present in the the given input array
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? Integer[] 
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            Input: nums = [3,0,1] -->output: 2
            Input: nums = [0,1] --> Output: 2
            Input: nums = [9,6,4,2,3,5,7,0,1] -->Output: 8
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 1.Get the Input array 
	 * 2.Sort the input array
	 * 3.Iterate the values using for loop
	 * 4.Compare the values with the index
	 * 5. if the one value is not equal with index is missing value
	 * 6.       return the index value
	 * 7. return the length because if the missing value present in last then the array length would be missing
	 * 5) Start always with Pseudo code 
	  
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = missingNumberinArray(new int[] {3,0,1});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test1() {
		int actual = missingNumberinArray(new int[] {0,1});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test2() {
		int actual = missingNumberinArray(new int[] {9,6,4,2,3,5,7,0,1});
		Assert.assertEquals(8, actual);
	}
	public int missingNumberinArray(int[] nums) {
		Arrays.sort(nums);//[3,0,1]  --> [0,1,3]  -->[0.1]
	   for (int i = 0; i < nums.length; i++) {
		   if(nums[i]!=i) { //  3=2
			   return i;
		   }
		
	}		return nums.length;
		
	}

}
