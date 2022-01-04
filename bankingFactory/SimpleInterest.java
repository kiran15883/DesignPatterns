package bankingFactory;

public class SimpleInterest extends Interest {

	private int Principle;
	private int Time;
	private float Rate;
	
	@Override
	public void CalculateInterest() {
		float SI = (float)(Principle*Time*Rate)/100;
		System.out.println("Simple Interest is "+SI);		
	}

	@Override
	public void setPrinciple(int Principle) {
		this.Principle = Principle;
		
	}

	@Override
	public void setTime(int Time) {
		this.Time = Time;
		
	}

	@Override
	public void setRate(int Rate) {
		this.Rate = Rate;		
	}

}
