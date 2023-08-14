package week2.Homeworks;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {

	/* 1) Did I understand the problem?  
	Description :   Move Zero's to the end of an array
	* 		-> If yes, go to next step !!
	 *    What is the input(s)?  int[]
	 *    What is the expected output?int[]
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 *     2) Test data set
	 *     Minimum of 3 data set !! Positive, Edge, Negative 
	 *     [0,1,0,3,12] --> [1,3,12,0,0]
	 *     [0] --> [0]
	 *     
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 *  
	 *  4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * if array length is i then return same array
       1.Create a for loop to iterate the array values
       2. A nested for loop to move the 0 into last index 
       3. if (value present in the index==0)
          then  j=i   i value to be stored into the j index
            return the updated array
            return the array
          
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */	
	@Test
	public void test() {
		int[] actual=MoveZerotoLast(new int[] {0});
		Assert.assertArrayEquals(new int[] {0}, actual);
	}
	@Test
	public void test1() {
		int[] actual=MoveZerotoLast(new int[] {0,1,0,3,12});
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);	
		}
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, actual);
	}
	
	public int[] MoveZerotoLast(int[] nums) {
		int temp=0;
		if(nums.length>1) {
			for (int i = 0; i < nums.length; i++) {   //[0,1,0,3,12]
				for (int j = i+1; j < nums.length; j++) {
					if(nums[i]==0) {
						temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
				}
				}
			}return nums;
		}
		return nums;
		
	}

}
