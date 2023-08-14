package week2.Homeworks;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {
	/* 1) Did I understand the problem?  
	Description : Find the unique appeared number from integer Array
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)?  int[] 
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      [2,2,1]
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Create a set and iterate the int[] using loop
	 * 
	 * 1.Iterate the Array using for loop
	 * 2.Create a nested for loop to compare the values 
	 * 3. if the values present in array equals then increase the count+1
	 *     else print the number value present in the array iteration
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
		int actual = FindSingleNumber(new int[] {2,2,1});
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test1() {
		int actual = FindSingleNumber(new int[] {4,1,2,1,2});
		Assert.assertEquals(4, actual);
	}
	@Test
	public void test2() {
		int actual = FindSingleNumber(new int[] {1});
		Assert.assertEquals(1, actual);
	}
    public int FindSingleNumber(int[] nums) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i:nums) {
			if(!set.add(i)) {
				set.remove(i);
			}
		}
		return set.iterator().next();
	}
	

}
