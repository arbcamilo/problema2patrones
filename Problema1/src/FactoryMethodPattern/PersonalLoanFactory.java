package FactoryMethodPattern;

public class PersonalLoanFactory implements LoanFactory {
    @Override
    public Loan createLoan() {
        return new PersonalLoan();
    }
}
