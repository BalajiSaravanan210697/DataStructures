package week2.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class HowManyElementsX {

	/* 1) Did I understand the problem?  
	Description : To count the how many x+1 elements present in the array
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[]
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *  [1, 2, 3]  --> 2
	 *  [1, 1, 3, 3, 5, 5, 7, 7]   --> 0
	 *  [1, 1, 2]  --> 2
	 *      
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 
	 * 1.Get the Input array of values  (Declare the counter as 0 as default)
	 * 2.Create a for loop to iterate the i elements in the array
	 * 3.Create a nested for loop to iterate the j = i+1 elements in the array
	 * 4. if the i+1 ==j the increate the counter++
	 *           return count
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
		int actual = HowManyElementsPresent(new int[] {1, 2, 3});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test1() {
		int actual = HowManyElementsPresent(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		Assert.assertEquals(0, actual);
	}
	@Test
	public void test2() {
		int actual = HowManyElementsPresent(new int[] {1, 1, 2});
		Assert.assertEquals(2, actual);
	}
	
	public int HowManyElementsPresent(int[] input) {
		int count=0; //[1, 2, 3]
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]+1==input[j]) {
					count++;
				}
			}
			
		}return count;
	}

}
