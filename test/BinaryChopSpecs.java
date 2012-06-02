import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryChopSpecs
{
	private ISearchAnArray sut;
	
	@Test
	public void whenAskedToFindAnElement_AndElementIsPresent_shouldReturnElementIndex()
	{
		sut = new BinaryChopIterative();
	    assertEquals(-1, sut.chop(3, new int[]{}));
	    assertEquals(-1, sut.chop(3, new int[]{1}));
	    assertEquals(0,  sut.chop(1, new int[]{1}));
	    
	    assertEquals(0,  sut.chop(1, new int[]{1, 3, 5}));
	    assertEquals(1,  sut.chop(3, new int[]{1, 3, 5}));
	    assertEquals(2,  sut.chop(5, new int[]{1, 3, 5}));
	    assertEquals(-1, sut.chop(0, new int[]{1, 3, 5}));
	    assertEquals(-1, sut.chop(2, new int[]{1, 3, 5}));
	    assertEquals(-1, sut.chop(4, new int[]{1, 3, 5}));
	    assertEquals(-1, sut.chop(6, new int[]{1, 3, 5}));
	    
	    assertEquals(0,  sut.chop(1, new int[]{1, 3, 5, 7}));
	    assertEquals(1,  sut.chop(3, new int[]{1, 3, 5, 7}));
	    assertEquals(2,  sut.chop(5, new int[]{1, 3, 5, 7}));
	    assertEquals(3,  sut.chop(7, new int[]{1, 3, 5, 7}));
	    assertEquals(-1, sut.chop(0, new int[]{1, 3, 5, 7}));
	    assertEquals(-1, sut.chop(2, new int[]{1, 3, 5, 7}));
	    assertEquals(-1, sut.chop(4, new int[]{1, 3, 5, 7}));
	    assertEquals(-1, sut.chop(6, new int[]{1, 3, 5, 7}));
	    assertEquals(-1, sut.chop(8, new int[]{1, 3, 5, 7}));
	}

}
