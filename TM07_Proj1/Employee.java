import java.util.Comparator;

public class Employee {

	private String FirstName,LastName,Email,Address;
	private Long MobileNumber;
	
	public Employee(String firstName, String lastName, String email, String address, Long mobileNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Address = address;
		MobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAdress(String address) {
		Address = address;
	}

	public Long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	
	
}
