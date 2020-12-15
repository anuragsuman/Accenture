package com.mgl.digital.sds.scrapper.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.mgl.digital.sds.scrapper.app.service.*;

public class TestProg {
	
	@Autowired
	private DefaultNumberService numberService = new DefaultNumberService();
	
	@Autowired 
	private YourTargetNumberService targetNumberService = new YourTargetNumberService();
	
	@Test
	public void targetNumber() throws Exception {
		int arr[] = {0, 29, 10, 8, 19, 2};
		int expectedOutput[] = {1,3};
		assertArrayEquals(targetNumberService.indices(arr, 37), expectedOutput);
	}
	
	@Test
	public void number() throws Exception {
		assert(numberService.getNumbers().toString().contains("[9, 25, 36, 81, 100, 144, 225, 324, 400, 441]"));
	}
	
	@Test
	public void targetNumberNegative() throws Exception {
		int arr[] = {0, 29, 10, 8, 19, 2};
		int expectedOutput[] = {1,3};
		assertNotEquals(targetNumberService.indices(arr, 33), expectedOutput);
	}
	
	@Test
	public void numberNegative() throws Exception {
		assertFalse(numberService.getNumbers().toString().contains("[9, 95, 36, 81, 100, 144, 225, 324, 400, 441]"));
	}
}
