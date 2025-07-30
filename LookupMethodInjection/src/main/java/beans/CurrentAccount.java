package beans;

public class CurrentAccount implements Account {
	public void createAccount() {
		System.out.println("CurrentAccount Created");
	}
	public void searchAccount() {
		System.out.println("CurrentAccount identified");
	}
	public void updateAccount() {
		System.out.println("CurrentAccount updated");
	}
	public void deleteAccount() {
		System.out.println("CurrentAccount Deleted");
	}
}
