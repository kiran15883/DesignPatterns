package bankingAbstractFactory;

public abstract class AbstractFactory {
	public abstract BankName getBank(String bank);

	public abstract Loan getLoan(String loan);

}
