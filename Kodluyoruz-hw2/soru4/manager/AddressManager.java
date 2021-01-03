package manager;

import address.Address;
import user.User;

public class AddressManager {
	
	
	
	public static  User addingAddress(User user, Address address) {
		
		user.getAdressList().add(address);
		
		
		
		
		return user;

	}
	public static User deletingAddress(User user, Address addreess) {
		
		user.getAdressList().remove(addreess);
		return user;
	}
}
