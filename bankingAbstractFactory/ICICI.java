package bankingAbstractFactory;

public class ICICI implements BankName {
	private final String BNAME;

	public ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;
	}

}
