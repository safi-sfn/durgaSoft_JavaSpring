package beans;

public class SavingsAccount implements Account{
	public void createAccount() {
		System.out.println("SavingsAccount Created");
	}
	public void searchAccount() {
		System.out.println("SavingsAccount identified");
	}
	public void updateAccount() {
		System.out.println("SavingsAccount updated");
	}
	public void deleteAccount() {
		System.out.println("SavingsAccount Deleted");
	}
}
