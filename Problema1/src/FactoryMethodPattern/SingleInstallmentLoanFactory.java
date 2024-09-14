package FactoryMethodPattern;

public class SingleInstallmentLoanFactory implements LoanFactory {
    @Override
    public Loan createLoan() {
        return new SingleInstallmentLoan();
    }
}