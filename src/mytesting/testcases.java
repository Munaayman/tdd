package mytesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcases {

	@Test
	void test() {
		mytesting test=new mytesting();
		assertEquals(2,mytesting.add(1,1));
	}
	@Test
	public void testSum_BothNumbersAreneg_ShouldReturnnegNumber() {
		mytesting test=new mytesting();
		assertEquals(-2,mytesting.add(-1,-1));
}
	@Test
	public void testSum_differentandgretherispositive_ShouldReturnPositiveNumber() {
		assertEquals(4,mytesting.add(5,-1));

	}
	@Test
	public void testSum_differentandgretherisneg_ShouldReturnnegNumber() {
		assertEquals(-4,mytesting.add(-5,1));

	}
	@Test
	public void testSum_sameanddifferentsign_ShouldReturnzero() {
		assertEquals(0,mytesting.add(-5,5));

	}
	
	@Test
	public void testSum_addingzero_ShouldReturnsamenumber() {
		assertEquals(5,mytesting.add(0,5));

	}

}
