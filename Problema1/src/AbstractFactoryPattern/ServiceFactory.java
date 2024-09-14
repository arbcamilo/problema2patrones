package AbstractFactoryPattern;

import FactoryMethodPattern.LoanFactory;

public interface ServiceFactory {
    LoanFactory getLoanFactory(String loanType);
}
