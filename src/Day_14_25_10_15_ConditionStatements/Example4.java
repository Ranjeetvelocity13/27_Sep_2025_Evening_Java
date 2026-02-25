package Day_14_25_10_15_ConditionStatements;

public class Example4 {

	/*
	 * 🔹 Nested if Statement
	 * 
	 * Definition: An 'if' inside another 'if' block. It is useful when one
	 * condition depends on another.
	 * 
	 * Syntax: if (condition1) { if (condition2) { // Executes only when both are
	 * true } }
	 */

	public static void main(String[] args) {

		System.out.println("Program started");
		System.out.println("-----------------------");

		// 1️⃣ Example - Voter Eligibility
		int age = 16;
		String nationality = "Indian";

		if (nationality.equals("Indian")) { // true
			if (age >= 18) { // false
				System.out.println("Eligible to vote in India");
			} else {
				System.out.println("Not eligible to vote in India (Underage)");
			}
		} else {
			System.out.println("Only Indian citizens can vote here");
		}

		System.out.println("-----------------------");

		// 2️⃣ Example - ATM Withdrawal
		double balance = 5000;
		double withdraw = 2000;

		if (balance >= withdraw) { // 5000 >= 2000 → true
			if (withdraw <= 4000) { // 2000 <= 4000 → true
				System.out.println("Withdrawal successful!");
			} else {
				System.out.println("Withdrawal limit exceeded!");
			}
		} else {
			System.out.println("Insufficient balance!");
		}

		System.out.println("-----------------------");

		// 3️⃣ Example - Loan Approval
		int creditScore = 720;
		double income = 60000;

		if (creditScore >= 700) { // true
			if (income >= 50000) { // true
				System.out.println("Loan Approved!");
			} else {
				System.out.println("Loan Rejected: Insufficient Income");
			}
		} else {
			System.out.println("Loan Rejected: Low Credit Score");
		}

		System.out.println("-----------------------");

		// 4️⃣ Example - Exam Result Verification
		int marks = 85;
		boolean assignmentSubmitted = true;

		if (assignmentSubmitted) { // true
			if (marks >= 40) { // true
				System.out.println("Result: Passed");
			} else {
				System.out.println("Result: Failed");
			}
		} else {
			System.out.println("Result: Incomplete (Assignment not submitted)");
		}

		System.out.println("-----------------------");

		// 5️⃣ Example - Online Shopping Discount Eligibility
		double totalAmount = 1200;
		boolean isMember = true;

		if (isMember) { // true
			if (totalAmount > 1000) { // true
				System.out.println("Discount applied: 15%");
			} else {
				System.out.println("Discount applied: 5%");
			}
		} else {
			System.out.println("No discount for non-members");
		}

		System.out.println("-----------------------");
		System.out.println("Program ended");
	}
}
