package bankingPrototype;

public class BankRecord implements Prototype {

	private String Name;
	private String Code;
	private String Address;

	public BankRecord() {
		System.out.println("Bank Records");
		System.out.println("Bank Name" + "\t" + "Bank Code" + "\t" + "Address");

	}

	public BankRecord(String Name, String Code, String Address) {	
		this.Name = Name;
		this.Code = Code;
		this.Address = Address;
	}

	public void showRecord() {

		System.out.println(Name + "\t" + Code + "\t" + Address);
	}

	@Override
	public Prototype getClone() {

		return new BankRecord(Name, Code, Address);
	}

}
