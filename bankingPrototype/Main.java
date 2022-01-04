package bankingPrototype;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Bank Name: ");
		String BName = br.readLine();
		
		System.out.println("Enter Bank Code: ");
		String BCode = br.readLine();
		

		System.out.println("Enter Bank Address: ");
		String BAddress = br.readLine();
		


		BankRecord b1 = new BankRecord(BName, BCode, BAddress);

		b1.showRecord();

		
		BankRecord b2 = (BankRecord) b1.getClone();
		b2.showRecord();
	}

}
