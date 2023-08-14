package week5.Homeworks;

import org.junit.Assert;
import org.junit.Test;

public class MoneyLeetCode {
	/* 1) Did I understand the problem?  
	Description : To find the sum of the money at given day
	* 		-> If yes, go to next step !!
	 * Yes
	 *    What is the input(s)? int
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem? 1 to 1000
	 *    Do I have all informations to go to next step!! yes
	 *    
	 * 2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
            Positive : 10 --> 37
                        4 --> 10
                       20 --> 96
                       
            Edge : 1 --> 1
                   999 --> 
                   
            Negative : <=0 then --> Throws Error Message
	 * 3) Do I know how to solve it? Yes
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	   1.Get the input integer value 
	   2.Initialize the variables like the startDay, CurrentDay and totalcost 
	   3.Create a for loop to iterate the values from 1 to 1000
	   3.if the i value of modulo 7 would be 1 then that increase the startDay value plus one using counter
	   4.Calculate the totalcost value after incremented the value using counter
	   5.Swap the StartDay value value into Currentday value    
	   6.else get the currentday value and increment using counter
	   7.totalcost value to be adding the currentday values
	   8.Return the totalcost
	 
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 */
	@Test
	public void test() {
		int actual= moneyinBank(10);
		Assert.assertEquals(37, actual);
	}
	@Test
	public void test1() {
		int actual= moneyinBank(4);
		Assert.assertEquals(10, actual);
	}
	@Test
	public void test2() {
		int actual= moneyinBank(20);
		Assert.assertEquals(96, actual);
	}
	@Test
	public void test3() {
		int actual= moneyinBank(1);
		Assert.assertEquals(1, actual);
	}
	@Test
	public void test4() {
		int actual= moneyinBank(999);
	 Assert.assertEquals(74778, actual);
	}
	
	public int moneyinBank(int n) {
		int totalcost=0,startDay=0,CurrentDay=0;
		for (int i = 1; i <= n; i++) {
			if(i%7==0) {
				CurrentDay++;
				totalcost+=CurrentDay;
				startDay++;
				CurrentDay=startDay;
			}else {
				CurrentDay++;
				totalcost+=CurrentDay;
			}
		}
		
		return totalcost;
	}

}
