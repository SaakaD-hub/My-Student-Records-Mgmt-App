import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class MortgageCalculator {
	private static final int MIN_AGE = 18;
	private static final double PARTNER_INCOME_CONTRIBUTION = 0.94;
	private static final List<String> HIGH_INCOME_PROFESSIONS = Arrays.asList("Developer", "Architect", "Scrum master");
	private static final List<String> MID_INCOME_PROFESSIONS = Arrays.asList("Tester", "System Administrator", "Technical writer");
	private static final List<String> HIGH_TIER_PROFESSIONS = Arrays.asList("Department head", "Professor");

	public double computeMaxMortgage(int yearOfBirth, int month, int day, double monthlyIncome, boolean married, double monthlyIncomePartner, String profession) {
		int age = calculateAge(yearOfBirth, month, day);
		if (age < MIN_AGE) {
			return 0;
		}

		double income = married ? (monthlyIncome + monthlyIncomePartner * PARTNER_INCOME_CONTRIBUTION) : monthlyIncome;
		return getMortgageAmount(income, profession);
	}

	private int calculateAge(int year, int month, int day) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		return Period.between(birthDate, today).getYears();
	}

	private double getMortgageAmount(double income, String profession) {
		if (income >= 5000) {
			return getAmountByProfession(profession, 220000, 160000, 280000);
		} else if (income >= 3000) {
			return getAmountByProfession(profession, 180000, 140000, 250000);
		} else if (income >= 2000) {
			return getAmountByProfession(profession, 160000, 120000, 220000);
		}
		return 0;
	}

	private double getAmountByProfession(String profession, double highIncomeAmount, double midIncomeAmount, double highTierAmount) {
		if (HIGH_INCOME_PROFESSIONS.contains(profession)) {
			return highIncomeAmount;
		} else if (MID_INCOME_PROFESSIONS.contains(profession)) {
			return midIncomeAmount;
		} else if (HIGH_TIER_PROFESSIONS.contains(profession)) {
			return highTierAmount;
		}
		return 0;
	}
}
