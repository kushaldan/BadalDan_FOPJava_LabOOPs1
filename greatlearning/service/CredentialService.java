package org.greatlearning.service;
import java.util.Random;
public class CredentialService {
	
	public void showCredentials(String firstName, String email, char[] password)
	{
	System.out.println("Dear "+ firstName + " your generated credentials are as follows:-");
	System.out.println("Email-------->  "+ email);
	System.out.print("Password------>  ");
	System.out.println(generatePassword());
	System.out.println();
	
	}

	public String generateEmailAddress(String firstName, String lastName, String department)
	{
	return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".greatlearning.com";
}

	public char[] generatePassword() 
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters= "abcdefghijklmnopqrstuvwxyz";
		String numbers= "0123456789";
		String specialCharacters="!@#$%^&*<>";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0; i<8; i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
}
	

