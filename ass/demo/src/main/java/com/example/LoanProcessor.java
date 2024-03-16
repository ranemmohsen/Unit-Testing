package com.example;

public class LoanProcessor {
    // Define constants for magic numbers
    private static final int MIN_CREDIT_SCORE = 600;
    private static final int MAX_LOAN_AMOUNT = 50000;

    public String processLoanApplication(int creditScore, boolean isEmployed, int loanAmount) {
        if (creditScore < MIN_CREDIT_SCORE) {
            return "Rejected: Credit score too low (Minimum required: " + MIN_CREDIT_SCORE + ")";
        } else if (!isEmployed) {
            return "Rejected: Applicant must be employed";
        } else if (loanAmount > MAX_LOAN_AMOUNT) {
            return "Rejected: Loan amount too high (Maximum allowed: " + MAX_LOAN_AMOUNT + ")";
        } else {
            return "Approved";
        }
    }
}