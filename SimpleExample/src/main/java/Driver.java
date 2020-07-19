
public class Driver {

	public static void main(String[] args) {
		System.out.println("=====Start=====");
		
		User user = new User("Phoeborous", "1234");
//		System.out.println("username: " + user.getUsername());
		
//		System.out.println();
//		System.out.println(user.sayHello2("1234"));
//		System.out.println(user.sayHello2("wrong"));
//		System.out.println();
		
		
//		Balance balance = new Balance(user);
//		Balance balance2 = new Balance(user);
//		balance.sayUsername();
//		
//		System.out.println(balance);
//		System.out.println(balance2);
//		
//		System.out.println(balance == balance2);
//		System.out.println();
//		System.out.println(balance.equals(balance2));
//		
		
		Transactions trannie = new Transactions(); 
		System.out.println(trannie.getIndex(2));
		
		System.out.println("====END====");
	}

}
