package com.demo.assignment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.demo.assignment.Assignment;

public class AssignmentTest {
	
	@Test
	public void testFindLongestSequenceFail() {
		Assignment as = new Assignment();
		int inAr[] = { 4, 3, 6, 9, 12, 5, 22 };
		List<Integer> expected= Arrays.asList(2,3,4,7);
		
		assertEquals(expected, as.findLongestSequence(inAr)); // fail
	}
	
	@Test
	public void testFindLongestSequencePass() {
		Assignment as = new Assignment();
		int inAr[] = { 4, 3, 6, 9, 12, 5, 22 };
		List<Integer> arl= Arrays.asList(3,4,5,6);
		
		assertEquals(arl, as.findLongestSequence(inAr)); // pass
	}
	
	@Test
	public void testFindLongestSequenceLong() {
		Assignment as = new Assignment();
		int inAr[] = { 2, 3, 4, 7, 8, 10, 11, 12, 13 };
		List<Integer> arl= Arrays.asList(10, 11, 12, 13);
		
		assertEquals(arl, as.findLongestSequence(inAr)); // pass
	}
	
	@Test
	public void testFindLongestSequenceLongCon() {
		Assignment as = new Assignment();
		int inAr[] = { 2, 3, 4, 7, 8, 10, 11, 12, 13 };
		List<Integer> arl= Arrays.asList(2, 3, 4);
		
		assertEquals(arl, as.findLongestSequence(inAr)); // fail
	}

}
