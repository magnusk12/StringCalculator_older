package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.junit.*;

public class CalculatorTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
	}

	@Test
	public void testEmpty() {
		assertEquals(0, Calculator.add(""));
	}
}
