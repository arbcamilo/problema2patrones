package FactoryMethodPattern;

class FixedInstallmentLoan implements Loan {
    @Override
    public void create() {
        System.out.println("Creating Fixed Installment Loan");
    }
}
