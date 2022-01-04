package bankingFactory;

public abstract class Interest {
	
	
	public abstract void setPrinciple(int Principle);
	
	public abstract void setTime(int Time);
	
	public abstract void setRate(int Rate);
	
	public abstract void CalculateInterest();
}

//create the concrete(subclasses) which extends Interest abstract class
