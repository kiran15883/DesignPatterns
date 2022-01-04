package bankingFactory;
import java.util.*;

public class Main {
	public static void main(String [] args){
		
	GetPlanFactory planFactory = new GetPlanFactory();  
	
    Scanner sc = new Scanner(System.in);
    
 
    System.out.println("Enter the principle ");
    int principle = sc.nextInt();
    
    System.out.println("Enter the rate of interest ");
    int rate = sc.nextInt();
    
    System.out.println("Enter the time ");
    int time = sc.nextInt();
    
    Interest I = planFactory.getPlan("SI");  
    I.setPrinciple(principle);
    I.setRate(rate);
    I.setTime(time);
    I.CalculateInterest();
    
    Interest I1 = planFactory.getPlan("CI");  
    I1.setPrinciple(principle);
    I1.setRate(rate);
    I1.setTime(time);
    I1.CalculateInterest();
}
}
