public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount account) {
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = getBalance();
        double interest = balance * getInterestRate();
        return balance + interest;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
