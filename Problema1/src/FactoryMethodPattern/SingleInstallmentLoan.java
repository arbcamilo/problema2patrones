package FactoryMethodPattern;

class SingleInstallmentLoan implements Loan {
    @Override
    public void create() {
        System.out.println("Creating Single Installment Loan");
    }
}