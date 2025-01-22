package user;

public class User {
	private int id;
	private String name;
	private String phone;
	
	public User (int id, String name, String phone) {
		this.id = id;
		this.setName(name);
		this.setPhone(phone);
	}
	
	public User (int id, String name) {
		this.id = id;
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
