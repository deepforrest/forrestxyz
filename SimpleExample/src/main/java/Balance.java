

//ALT - SHIFT - S
public class Balance {

	//field
	private User user;
	
	//Constructor
	public Balance(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
	}
	//Method
	public void sayUsername() {
		System.out.println("Username from balance: " + user.getUsername());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		User user = ((Balance) obj).getUser();
		if(this.user.getUsername().equals(user.getUsername())) {
			return true;
		}
		return false;
	}
	
	
}
