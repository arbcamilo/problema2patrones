package AbstractFactoryPattern;


import FactoryMethodPattern.FixedInstallmentLoanFactory;
import FactoryMethodPattern.LoanFactory;
import FactoryMethodPattern.PersonalLoanFactory;
import FactoryMethodPattern.SingleInstallmentLoanFactory;

class ChileServiceFactory implements ServiceFactory {
    @Override
    public LoanFactory getLoanFactory(String loanType) {
        switch (loanType) {
            case "Personal":
                return new PersonalLoanFactory();
            case "FixedInstallment":
                return new FixedInstallmentLoanFactory();
            case "SingleInstallment":
                return new SingleInstallmentLoanFactory();
            default:
                throw new IllegalArgumentException("Unknown loan type");
        }
    }
}