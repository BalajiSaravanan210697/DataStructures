package week1.day1.ClassProblems;

import org.junit.Assert;
import org.junit.Test;

public class FindoccurenceofInputGiven {
	/* 1) Did I understand the problem?  
	Description : Find the occurence of given input number
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[] , int
	 *    What is the expected output? int 
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      {1, 1, 2, 2, 2, 2, 3,}, x = 2 output = 4
	 *  
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pesudo code 
	 * 1.Get the Target Element to be count the Number
	 * 2.Iterate the given int[]
	 * 3. if the nums[i] ==Target value 
	 *    Count+1
	 * 4. return count 
	 * 
	 *
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	 
	 
	/*
	 * Given a sorted array arr[] and a number x, write a function that counts the
	 * occurrences of x in arr[]. arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2 output = 4
	 */
	
	@Test
	public void test() {
		int actual=Findoccurenceofinput(new int[] {1, 1, 2, 2, 2, 2, 3},2);
		Assert.assertEquals(4, actual);
	}
	@Test
	public void test1() {
		int actual=Findoccurenceofinput(new int[] {1, 1, -2, 2, 2, 2, 3},-2);
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test2() {
		int actual=Findoccurenceofinput(new int[] {1, 1, -2, 2, 2, 2, 3},4);
		Assert.assertEquals(0, actual);
	}
	@Test
	public void test3() {
		int actual=Findoccurenceofinput(new int[] {},4);
		Assert.assertEquals(0, actual);
	}
	public int Findoccurenceofinput(int[] nums, int num) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num) {
				count++;
			}
		}
		return count;	
	}
}
