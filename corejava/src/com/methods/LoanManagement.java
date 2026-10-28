package com.methods;

public class LoanManagement {
	String customerName;
	int LoanAmount;
	int interestRate;
	int Loantenure;
	int years;

	int calculateInterest(int amount, int rate) {
		return (amount * rate * Loantenure);
	}

	int calculateTotalAmount(int intrest) {
		return LoanAmount + intrest;
	}

	int calculateMonthlyEMI(int total, int tenure) {
		return total / tenure * 12;
	}

	void displayLoanSummary(int interest, int total, int EMI) {
		System.out.println("Enter the customerName : " + customerName);
		System.out.println("LoanAmount:" + LoanAmount);
		System.out.println("interestRate:" + interestRate);
		System.out.println("Loantenure:" + Loantenure);
		System.out.println("years:" + years);

	}

	public static void main(String[] args) {
		LoanManagement m = new LoanManagement();
		m.customerName = "Raju";
		m.LoanAmount = 20000;
		m.interestRate = 10;
		m.Loantenure = 12;
		m.years = 1;

		int interest = m.calculateInterest(m.LoanAmount, m.interestRate);
		int total = m.calculateTotalAmount(interest);
		int EMI = m.calculateMonthlyEMI(total, m.Loantenure);

		m.displayLoanSummary(interest, total, EMI);
	}

}
