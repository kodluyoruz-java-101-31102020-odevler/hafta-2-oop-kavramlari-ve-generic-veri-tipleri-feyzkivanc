package manager;

import java.util.TreeSet;

import account.Account;
import account.InvalidAuthenticationException;

public class AccountManager {
	
	private TreeSet<Account> accountTreeSet;
	public static int accountStatus =0;

	public TreeSet<Account> getAccountTreeSet() {
		return accountTreeSet;
	}

	public void setAccountTreeSet(TreeSet<Account> accountTreeSet) {
		this.accountTreeSet = accountTreeSet;
	}
	/*public Account login(String email, String password) {
		for(Account account : accountTreeSet) {
			if (account!=null) {
				try {
					account.login(email, password);
					
				}catch (InvalidAuthenticationException ex) {
					System.out.println(ex);
			}

		}
		

		}
		return null;
	}*/
}
	