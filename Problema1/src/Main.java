import AbstractFactoryPattern.ServiceFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import AbstractFactoryPattern.ColombiaServiceFactory;
import AbstractFactoryPattern.ServiceFactory;
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