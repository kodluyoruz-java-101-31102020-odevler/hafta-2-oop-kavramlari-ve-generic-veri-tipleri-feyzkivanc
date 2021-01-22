package account;

import java.util.List;

import Insurance.Insurance;
import enumPackage.AuthenticationStatus;
import user.User;

public abstract class Account implements Comparable <Account> {
	protected User user;
	protected AuthenticationStatus fail= AuthenticationStatus.FAIL;
	protected AuthenticationStatus success = AuthenticationStatus.SUCCESS;
	protected AuthenticationStatus login = fail;
	protected  List<Insurance> InsuranceList;
	public Account() {
		
	}
	
	public Account(User user, AuthenticationStatus fail, AuthenticationStatus success, AuthenticationStatus login,
			List<Insurance> insuranceList) {
		super();
		this.user = user;
		this.fail = fail;
		this.success = success;
		this.login = login;
		InsuranceList = insuranceList;
	}

	public abstract void createPolicy();

	public final void showUserInfo() {
        if(this.user != null) {
        	System.out.println("User's name:" + this.user.getName() + "User's surname" + 
             this.user.getSurname() + "last login date:" + this.user.getLastLoginDate() +
            "User's job" + this.user.getJob());
        	
        } else {
        	System.out.println("There is no user");
        }
        }
        public void login(String email, String password) throws InvalidAuthenticationException {
    		if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
    			login= success;
    			System.out.println("login success ");
    
    		} else {
    			
    			
    			System.out.println("error");
    		}
    	
	}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((InsuranceList == null) ? 0 : InsuranceList.hashCode());
			result = prime * result + ((fail == null) ? 0 : fail.hashCode());
			result = prime * result + ((login == null) ? 0 : login.hashCode());
			result = prime * result + ((success == null) ? 0 : success.hashCode());
			result = prime * result + ((user == null) ? 0 : user.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			if (InsuranceList == null) {
				if (other.InsuranceList != null)
					return false;
			} else if (!InsuranceList.equals(other.InsuranceList))
				return false;
			if (fail != other.fail)
				return false;
			if (login != other.login)
				return false;
			if (success != other.success)
				return false;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Account [user=" + user + ", fail=" + fail + ", success=" + success + ", login=" + login
					+ ", InsuranceList=" + InsuranceList + "]";
		}
	
	
	
	
	
			

			
			
			
	
}
	
	
	
	
