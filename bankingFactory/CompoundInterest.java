package bankingFactory;

public class CompoundInterest extends Interest  {
	
	private int Principle;
	private int Time;
	private float Rate;
	
	public void CalculateInterest() {
		float A1 = (1+(float)(Rate/100));
		A1 = (float)Math.pow(A1,Time);	
		float CI = Principle*(A1) - Principle;
		System.out.println("Compound Interest is "+CI);		
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
