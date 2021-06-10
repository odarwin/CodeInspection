package labcodeinspection;
import java.util.Locale;
/**
*
*
* @author Oscar Guaman
*/
public class Email {
	/**
	*
	*
	* variable M_FIRSTNAME
	*/
	private transient final String M_FIRSTNAME;
	/**
	* variable M_LASTNAME
	*/
	
	private transient final String M_LASTNAME;
	/**
	* variable password
	*/	
	private static String password = "";
	/**
	* variable department
	*/
	private static String department = "";
	/**
	* variable PASSLEN
	*/
	private static final int PASSLEN = 8;
	/**
	* variable password
	*/
	private static String emainame;

	/**
	* variable
	*/
	public Email(final String firstName, final String lastName) {
		this.M_FIRSTNAME = firstName;
		this.M_LASTNAME = lastName;
	}

	/**
	* metodo showInfo Oscar
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + M_LASTNAME + "\nLAST NAME= " + M_LASTNAME); 		
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + emainame + "\nPASSWORD= " + password); 		
	}
	
	/**
	* setDeparment Oscar
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) { 		

		case 1: 
			Email.department = "sales";
			break;
		case 2:
			Email.department = "dev";
			break;
		case 3:
			Email.department = "acct";
			break;
		default:
			Email.department="vacio";
			break;
		}
		
	}
	/**
	* randomPassword Oscar
	*/
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length()); 
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	* generateEmail Oscar
	*/
	public void generateEmail() {
		Email.password = this.randomPassword(Email.PASSLEN);
		Email.emainame = this.M_FIRSTNAME.toLowerCase(Locale.getDefault()) + this.M_LASTNAME.toLowerCase(Locale.getDefault()) + "@" + Email.department 
				+ ".espol.edu.ec";
	}
}
