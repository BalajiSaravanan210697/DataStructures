package week1.day1.ClassProblems;
import org.junit.Assert;
import org.junit.Test;

public class FindDuplicates {
	@Test
	public void test() {
		boolean actual = isDuplicate(new int[] {1,2,3,1});
		Assert.assertEquals(true, actual);
	}
    public void test1() {
    	boolean actual = isDuplicate(new int[] {1,2,3,4});
		Assert.assertEquals(false, actual);
	}
    public void test2() {
    	boolean actual = isDuplicate(new int[] {});
		Assert.assertEquals(false, actual);
}
public boolean isDuplicate(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
			if(nums[i]==nums[j]) {
				return true;
			}
			}
		    }
	return false;
}
}
