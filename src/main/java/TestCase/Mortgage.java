/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCase;

/**
 *
 * @author john clarence
 */
public class Mortgage {
    private double principal; // Loan amount
    private double interestRate; // Annual interest rate
    private int loanTerm; // Loan term in years

    public Mortgage(double principal, double interestRate, int loanTerm) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }
      public double calculateMonthlyPayment() {
        double monthlyInterestRate = (interestRate / 12) / 100; // Convert annual interest rate to monthly
        int numberOfPayments = loanTerm * 12;                   // Total number of payments

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return monthlyPayment;
    }


    // Add getters and setters as needed
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
   
}


