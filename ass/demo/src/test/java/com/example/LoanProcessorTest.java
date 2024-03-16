package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoanProcessorTest {
    private LoanProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new LoanProcessor();
    }

    @Test
    public void testApplicationRejectedDueToLowCreditScore() {
        Assertions.assertEquals("Rejected: Credit score too low (Minimum required: 600)", processor.processLoanApplication(550, true, 20000));
    }

    @Test
    public void testApplicationRejectedDueToUnemployment() {
        Assertions.assertEquals("Rejected: Applicant must be employed", processor.processLoanApplication(650, false, 20000));
    }

    @Test
    public void testApplicationRejectedDueToHighLoanAmount() {
        Assertions.assertEquals("Rejected: Loan amount too high (Maximum allowed: 50000)", processor.processLoanApplication(700, true, 60000));
    }

    @Test
    public void testApplicationApproved() {
        Assertions.assertEquals("Approved", processor.processLoanApplication(700, true, 20000));
    }
}