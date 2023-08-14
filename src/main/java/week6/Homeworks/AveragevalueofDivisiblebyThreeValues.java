package week6.Homeworks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AveragevalueofDivisiblebyThreeValues {
	/* 1) Did I understand the problem?  
	Description : To find the  average of the even numbers in the array and divisible by 3 
	* 		-> If yes, go to next step !! Yes
	 * 
	 *    What is the input(s)? int[] nums
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem? array value between 1 to 1000
	 *    Do I have all informations to go to next step!! Yes
	 *    
	 * 2) Test data set
	 *    Minimum of 3 data set !! Positive, Edge, Negative 
	 *    Positive : {1,3,6,10,13,15,12,5,7,8,8,18}
	 *    Edge :{13,3,7,1,2,3,3,3,5,7,9,5}
	 *    Negative : {5,0,3,4,4,5}
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
      
       >Initialize the sum and Average variables
       >Declare a Integer Array List 
       >use for loop to iterate the nums[i] values
       >using if condition to check the nums[i] value less than print the valid error message
       > again use another if condition to check the number is even using modulo nums[i]%2==0 && number is divisible by 3 using dividend nums[i]/3==0 
           both condition satisfies then add the nums[i] into a List
       > use another for loop to iterate the values added in the List
       > sum the values present the List and store into sum variable
       > Divide the sum/List.size() to get the average and stored into average
       > Return Average 
       
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = averageNumberEvenDivisibleThree(new int[] {1,3,6,10,12,15});
		Assert.assertEquals(9, actual);
	}
	@Test
	public void test1() {
		int actual = averageNumberEvenDivisibleThree(new int[] {1,2,4,7,10});
		Assert.assertEquals(0, actual);
	}
	@Test
	public void test2() {
		int actual = averageNumberEvenDivisibleThree(new int[] {3,6,6,9,12,15,18,21,24,27,30,33});
		Assert.assertEquals(16, actual);
	}
	@Test
	public void test3() {
		averageNumberEvenDivisibleThree(new int[] {1,2,4,7,0});
	}
    public int averageNumberEvenDivisibleThree(int[] nums) {
    	int sum = 0,Average=0;
    	List<Integer> listofnumber=new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]<1) {System.out.println("'nums' must consist of values from 1 to 1000 only");break;}
    		if (nums[i]%2==0&&nums[i]%3==0) {
    			listofnumber.add(nums[i]);
			}
    	}
    	if(listofnumber.size()==0) {return 0;}
    	for (int i = 0; i < listofnumber.size(); i++) {
			sum+=listofnumber.get(i);
		}
    	Average=sum/listofnumber.size();
	return Average;
}
}
