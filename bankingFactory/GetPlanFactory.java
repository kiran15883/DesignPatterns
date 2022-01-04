package bankingFactory;

public class GetPlanFactory {

	public Interest getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		
		if (planType.equalsIgnoreCase("SI")) {
			return new SimpleInterest();
		} 
		else if (planType.equalsIgnoreCase("CI")) {
			return new CompoundInterest();
		}
		
		return null;
	}

}
