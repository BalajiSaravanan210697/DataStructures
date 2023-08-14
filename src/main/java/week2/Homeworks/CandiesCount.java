package week2.Homeworks;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CandiesCount {
	
	/* 1) Did I understand the problem?  
	Description : To find the different varieties of candies eaten count
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
	 *  [1,1,2,2,3,3]  --> 3
	 *  [1,1,2,3]   --> 2
	 *      
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 
	 * 1.Get the integer array values
	 * 2.Get the size of integer array and divide by 2 and stored to the variable
	 * 3.Create a set and iterate the values in set later get the size of the set
	 * 4.compare the set size and array length 
	 *     return minimum value - Set
	 *     return mimimun value - Array
	 *
	 *1.Initialise the variable and store the length of array and divide by 2
	 *2.Create for loop and iterate the values in the for loop
	 *3.Create A nested for loop and iterate the i+1 elements
	 *4.  if(i==j) increase the count+2 because the prsence is twice
	 *        
	 *
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
		int actual = FindCandiesCount(new int[] {1,1,2,2,3,3});
		Assert.assertEquals(3, actual);
	}
	@Test
	public void test1() {
		int actual = FindCandiesCount(new int[] {1,1,2,3});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test2() {
		int actual = FindCandiesCount(new int[] {6,6,6,6});
		Assert.assertEquals(1, actual);
	}
	public int FindCandiesCount(int[] n) {
		int len=0;
		len= n.length/2;
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < n.length; i++) {
			set.add(n[i]);
		}
		int SetSize=set.size();
		if(SetSize<len) {
			return SetSize;	
		}
		return len;
	}
	}

