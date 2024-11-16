//package partc;

public class User {
	//these are the attributes of User..these value defines the users
	private String id;
	private String password;
	private String name;
	private String email;
	private double balance=0;

	private int type;

	//this is parameterized constructor with 4 attributes
	User(String id,String password,String name,String email){
		this.setId(id);
		this.setPassword(password);
		this.setName(name);
		this.setEmail(email);
	}

	//and this is a null one
	public User() {
		// TODO Auto-generated constructor stub
	}

	//Afterwards are getters and setters(simple)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance =this.balance+ balance; //add new deposit_balance with previous balance
	}

	public void show_my_balance(){
		System.out.println("Current balance is: "+balance);
	}



}
