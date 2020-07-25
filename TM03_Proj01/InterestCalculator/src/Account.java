
public abstract class Account {
	double interestRate,amount;
	abstract double calculateInterest() throws InvalidAmountException, InvalidNoOfDaysException, InvalidAgeException;
	

}
