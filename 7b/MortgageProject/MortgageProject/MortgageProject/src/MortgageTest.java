import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MortgageTest {
	private MortgageCalculator calculator;

	@Before
	public void setUp() {
		calculator = new MortgageCalculator();
	}

	@Test
	public void testEligibleArchitectWith3000Income() {
		double result = calculator.computeMaxMortgage(1967, 5, 2, 3000, false, 0, "Architect");
		assertEquals(180000, result, 0.001);
	}

	@Test
	public void testIneligibleDueToYoungAge() {
		double result = calculator.computeMaxMortgage(2001, 5, 2, 3000, false, 0, "Architect");
		assertEquals(0, result, 0.001);
	}

	@Test
	public void testMarriedDeveloperWithCombinedIncome() {
		double result = calculator.computeMaxMortgage(1977, 12, 2, 4000, true, 2000, "Developer");
		assertEquals(220000, result, 0.001);
	}

	@Test
	public void testProfessorWithHighIncome() {
		double result = calculator.computeMaxMortgage(1954, 5, 12, 5500, false, 0, "Professor");
		assertEquals(280000, result, 0.001);
	}
}
