import AbstractFactoryPattern.ServiceFactory;


import AbstractFactoryPattern.ColombiaServiceFactory;
import FactoryMethodPattern.Loan;
import FactoryMethodPattern.LoanFactory;

public class Main {
    public static void main(String[] args) {
        ServiceFactory colombiaFactory = new ColombiaServiceFactory();

        LoanFactory personalLoanFactory = colombiaFactory.getLoanFactory("Personal");
        Loan personalLoan = personalLoanFactory.createLoan();
        personalLoan.create();

        LoanFactory fixedInstallmentLoanFactory = colombiaFactory.getLoanFactory("FixedInstallment");
        Loan fixedInstallmentLoan = fixedInstallmentLoanFactory.createLoan();
        fixedInstallmentLoan.create();

        LoanFactory singleInstallmentLoanFactory = colombiaFactory.getLoanFactory("SingleInstallment");
        Loan singleInstallmentLoan = singleInstallmentLoanFactory.createLoan();
        singleInstallmentLoan.create();
    }
}