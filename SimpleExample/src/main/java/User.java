
public class User {

	//Fields
	private String username;
	private String password;
	private String secret = "ldjflafjlkdjfafjdf;jasklfdj";
	
	//Constructor
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User() {}
	
	//Methods
	public String sayHello(String name) {
		return username + " Says hello to " + name;
	}
	
	public String sayHello2(String password) {
		if(password.equals(this.password)) {
			return this.secret;
		}else {
			return "wrong password";
		}
	}
	
	//Getters and Setters
	public String getUsername() {
		return this.username;
	}
	
}
