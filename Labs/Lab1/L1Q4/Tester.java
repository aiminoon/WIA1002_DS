package Lab1.L1Q4;

public class Tester {
	public static void main(String[] args) {
		Account1 account = new Account1("George", 1122, 1000);
        Account1.setAnnualInterestRate(1.5);
        account.deposit(30, "1st deposit");
        account.deposit(40, "2nd deposit");
        account.deposit(50, "3rd deposit");
        account.withdraw(5, "1st withdraw");
        account.withdraw(4, "2nd withdraw");
        account.withdraw(2, "3rd withdraw");

        account.printInfo();
        account.printTransactionHistory();
	}
}
