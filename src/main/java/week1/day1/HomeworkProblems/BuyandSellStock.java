package week1.day1.HomeworkProblems;

import org.junit.Assert;
import org.junit.Test;

public class BuyandSellStock {
	
	/* 1) Did I understand the problem?  
	Description : To find the maximum profit - which days to buy and sell stocks
	* 		-> If yes, go to next step !!
	 * 
	 *    What is the input(s)? int[]
	 *    What is the expected output? int
	 *    Do I have constraints to solve the problem?
	 *    Do I have all informations to go to next step!!
	 *    
	 * 2) Test data set
	 *  	[7,1,5,3,6,4]
	 *      [7,6,4,3,1]
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 * 
	 * 3) Do I know how to solve it?
	 * 		Yes - great. - Ask for tip
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Start always with Pseudo code 
	 * 
	 * 1.Traverse into the Integer array 
	 * 2.A Nested loops to compare the values present in i with j
	 *         if i<j
	 *         if(stock value<j-1){
	 *          stock value =j-i and store into a variable
	 *          }
	 *          return stock value
	 * 6) Implement them in the code (editor)
	 * 
	 * 7) Test against the different data set 
	 * 
	 * 8) If it fails, debug them to solve it !!
	 * 
	 */
	@Test
	public void test() {
		int actual=BuyandSellStocks(new int[] {7,1,5,3,6,4});
		Assert.assertEquals(5, actual);
	}
	@Test
	public void test1() {
		int actual=BuyandSellStocks(new int[] {7,6,4,3,1});
		Assert.assertEquals(0, actual);
	}
   public int BuyandSellStocks(int[] prices) {
		//[7,1,5,3,6,4]
		int stockprice=0;
        for (int i = 0; i < prices.length; i++) {
				for (int j = i+1; j < prices.length; j++) {
					if(prices[i]<prices[j]) {
						if(stockprice<prices[j]-prices[i]) {
						stockprice = prices[j]-prices[i];
					}
					}
					}
		}
        return stockprice;	
		}
}
