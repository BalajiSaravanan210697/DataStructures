package week5.Homeworks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingDigitSUM {
	/* 1) Did I understand the problem?  Yes
	Description : Return Sum of all Digit values in the given input integer with most significant taken positive first and next digit will opposite of the previous digit
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int 
	 *    What is the expected output? int 
	 *    Do I have constraints to solve the problem? 1 to 10 power 9
	 *    Do I have all informations to go to next step!! Yes
	 *    
	 * 2) Test data set
	 *    Minimum of 3 data set !! Positive, Edge, Negative 
          Positive  : int value 567  - output : 6
                      int value 6784 - output : 3  
                      int value 89763 - output: 3 
                      int value 997978 - output : -3
                      int value 6867673 - ouput : -1
                      int value 8-9+7-9+6-6+4-5 - output : -6 
                      int value 6-4+3-4+2-6+9-3+2 - output : 5  
          Edge      : int value 1    - output : 1
                      int value 9-9+9-9+9-9+9-9+9-9  output : 0 
                      int value 1-0+0-0+0-0+0-0+0  output : 1
          Negative  : int value -3   - output : Throws Error   
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 1.Get the input integer value 
	 2.Initialize the variable n remainder and Quotient 
	 3.Initialize the Integer array to store the remainder values
	 4.create while loop and it's check condition remainder greater than zero
	 5. n is module by 10 and the remainder stored to the array 
	 6. n is divided by 10 for the next iteration
	 7. once all iterations are done get the final array of remainders -RemArray 
	 8. create a for loop to iterate the RemArray values 
	 9. if the value of i divisible by 2 equal to zero then put '+' operator
	 10. else put the '-' operator to the particular array elements of RemArray
	 11. sum all the values of the array based on  the elements signs
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual = digitSumforalternateindiceschange(6867673);
		Assert.assertEquals(-1, actual);
	}
	@Test
	public void test1() {
		int actual = digitSumforalternateindiceschange(1);
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test2() {
		int actual = digitSumforalternateindiceschange(89763);
		Assert.assertEquals(3, actual);
	}
	@Test
	public void test3() {
		int actual = digitSumforalternateindiceschange(6784);
		Assert.assertEquals(3, actual);
	}
	@Test
	public void test4() {
		int actual = digitSumforalternateindiceschange(997978);
		Assert.assertEquals(-3, actual);
	}
	@Test
	public void test5() {
		 digitSumforalternateindiceschange(-3);
	
	}
	public int digitSumforalternateindiceschange(int n) {
		
		List<Integer> RemainderList=new ArrayList<Integer>();
		int Remainder=0,sum=0;
		if(n<=0) {
			System.out.println("Enter the Proper Input value !");
		}
		while(n>0) {
			Remainder=n%10;
			RemainderList.add(Remainder);
			n=n/10;		
		}
        
		for (int i = 0; i < RemainderList.size(); i++) {
			int size=RemainderList.size()%2;
			if(size!=0)
			if(i%2==0) {
				 sum+=  RemainderList.get(i);
			}else {
				sum+= - RemainderList.get(i);
			}
			if(size==0) 
			if (i%2==0) {
             sum+= - RemainderList.get(i);
			}
        	else {
        		sum+= RemainderList.get(i);
        	}
		}
		return sum;
		
		
	}	
}
