package week2.Homeworks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {
	/* 1) Did I understand the problem?  
	Description : Remove the Target Element from the array
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
	 *      input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			input = [2, 2], target=2
			   output = []
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 1.Get the Int[] array and Target Element
	 * 2.Create a Empty List 
	 * 3.Using for loop to iterate the integer array values
	 * 4.If (value[i] == target)
	 *       remove the value 
	 *       
	 *       return the int[]
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
	int[] actual=RemoveTargetElementfromArray(new int[] {2, 3, 3, 4, 5},3);
	System.out.println(actual);
	Assert.assertArrayEquals(new int[] {2, 4, 5}, actual);	
	
	}
	@Test
	public void test1() {
	int[] actual=RemoveTargetElementfromArray(new int[] {2, 2},2);
	System.out.println(actual);
	Assert.assertArrayEquals(new int[] {}, actual);	
	}
	
	public int[] RemoveTargetElementfromArray(int[] input, int target)  {
	
		List<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=target) {
				list.add(input[i]);
				}	
			}
		int[] output=new int[list.size()];
		for (int i = 0; i< list.size(); i++) {
		output[i]=list.get(i);
			
		}
		return output;	
	} 

}
