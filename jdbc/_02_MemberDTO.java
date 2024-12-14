package jdbc;

public class _02_MemberDTO {
	
	private String id;
	private String password;
	private String gender;
	private String email;
	private String address;
	
	public String getId() { 
		return id;
	}
	
	public String setId(String id) {
		return this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "id:" + id + 
				", password:" + password + 
				", gender:" + gender + 
				", gender:" + gender + 
				", email: " + email + 
				", address: " + address;                 
	}
	
}
