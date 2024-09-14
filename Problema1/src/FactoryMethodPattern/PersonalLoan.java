package FactoryMethodPattern;

class PersonalLoan implements Loan {
    @Override
    public void create() {
        System.out.println("Creating Personal Loan");
    }
}