package AnnotatiosEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	public void assertions() {
		
		String name="Peter";
		assertEquals(name, "sam","names do not match with comparision");

}
}