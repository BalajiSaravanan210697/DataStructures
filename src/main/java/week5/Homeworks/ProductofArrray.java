package week5.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class ProductofArrray {
	/* 1) Did I understand the problem?  Yes
	Description : To find the product of given array values and determine the output based on product values (+,- or 0)
	* 		-> If yes, go to next step !! Yes
	 * 
	 *    What is the input(s)? int[]
	 *    What is the expected output? int 
	 *    Do I have constraints to solve the problem?  nums.length 1 to 1000   Array Values between -100 to 100
	 *    Do I have all informations to go to next step!! Yes
	 *    
	 * 2) Test data set
	 *    Minimum of 3 data set !! Positive, Edge, Negative 
	 *    Postive : [-1,-2,-3,-4,3,2,1]  --> 144 -- > 1
	 *    [1,5,0,2,-3]   --> 0 --> 0
	 *    [-1,1,-1,1,-1] --> -1 --> -1 
	 *
	 *    [-100,1,100]	--> -10000 -->	-1
          [-99,-98,-97]	--> 941,094	-1
          [97,0,99]	--> 941094	0
		
          [101,102] -->	It's out of the constrain values -->	Error message throws to user
          [-101,103]-->	It's out of the constrain values -->	Error message throws to user
 
         
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 *  1.Initializes variable product 
	 *  2.Initialize for loop to iterate the values in the nums[i] array
	 *  3.check the nums[i] value not less than -100 and not greater than 100 
	 *  4. if it is less than -100 or greater than +100 than Throws an Error message 
	 *  5. product the values from the nums[i] array and stored in product variable
	 *  6. if product value is grater than or equal to 1 than return 1 
	 *  7.  else if the value less than or equal to  -1 than return -1
	 *  8.  else return 0 
   
     * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = signofProductValues(new int[] {-1,-2,-3,-4,3,2,1});
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test1() {
		int actual = signofProductValues(new int[] {1,5,0,2,-3});
		Assert.assertEquals(0, actual);
	}
	@Test
	public void test2() {
		int actual = signofProductValues(new int[] {-1,1,-1,1,-1});
		Assert.assertEquals(-1, actual);
	}
	@Test
	public void test4() {
		signofProductValues(new int[] {-101,103});
	}
	@Test
	public void test5() {
		int actual = signofProductValues(new int[] {-100,1,100});
		Assert.assertEquals(-1, actual);
	}
	@Test
	public void test6() {
		int actual = signofProductValues(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41});
		Assert.assertEquals(-1, actual);
	}
	public int signofProductValues(int[] nums) {
		int product=1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>100||nums[i]<-100) {
				System.out.println("Enter the valid input Array values!!");
				break;
			}else {
				product*=nums[i];
			}
	}
		if(product>=1) { return 1;
		}else if(product<=-1) {return -1;}
		return 0;
	}
}
