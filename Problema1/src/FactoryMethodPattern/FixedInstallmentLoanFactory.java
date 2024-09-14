package FactoryMethodPattern;

public class FixedInstallmentLoanFactory implements LoanFactory {
    @Override
    public Loan createLoan() {
        return new FixedInstallmentLoan();
    }
}
