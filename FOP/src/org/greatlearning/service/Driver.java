package org.greatlearning.service;
import org.greatlearning.model.Employee;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			Employee e = new Employee("Badal", "Dan");
			CredentialService credentialservice = new CredentialService();
			int ch;
			do
			{
				System.out.println("Please enter the department from the follwing:");
				System.out.println("1.Technical");
				System.out.println("2.Administration");
				System.out.println("3.Human Resource");
				System.out.println("4.Legal");
				ch = sc.nextInt();
				switch(ch) {
								
				case 1:
				{
					String email = credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
					char[] password = credentialservice.generatePassword();
					credentialservice.showCredentials(e.getFirstName(), email, password);
					
				}
				break;
				
				case 2:
				{
					String email = credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "admin");
					char[] password = credentialservice.generatePassword();
					credentialservice.showCredentials(e.getFirstName(), email, password);
							
			}
				break;
				
				case 3:
				{
					String email = credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "hr");
					char[] password = credentialservice.generatePassword();
					credentialservice.showCredentials(e.getFirstName(), email, password);						
			}
				break;
				
				case 4:
				{
					String email = credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "legal");
					char[] password = credentialservice.generatePassword();
					credentialservice.showCredentials(e.getFirstName(), email, password);
									
			}
				break;
				
				default:
				{
					System.out.println("Select correct department/Enter a valid no.\n");
									
			}
				break;
				}			
				
			}
			while(true);
		}
	}
}
