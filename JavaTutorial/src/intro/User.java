package intro;

public class User {

	private	final int userId;
	private	String name;
	private	String password;
	public User(int userId) {
		this.userId = userId;
	}
	public User(int userId, String name, String password) {
		this.userId = userId;
			this.name = name;
			this.password = password;
			if(isNullOrEmpty(name))
			System.out.println("the name is empty");
			if(isNullOrEmpty(password))
			System.out.println("the name is empty");
		
			
			if(password.length()<8) 
			throw new IllegalArgumentException("the password should not be less than 8 chars");
	
	}
	private boolean isNullOrEmpty(String str) {
		if(str != null && !str.isEmpty())
            return false;
        return true;
	}
	public int getUserId() {
		return userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}