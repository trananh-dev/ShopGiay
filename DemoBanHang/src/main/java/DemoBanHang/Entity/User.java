package DemoBanHang.Entity;

public class User {
	private int id;
	private String name;
	private String add;
	private String city;
	private String phone;
	private String email;
	private String pass;
	
	public User() {
		super();
	}
	
	public User( String name, String add, String city, String phone, String email, String pass) {
		super();
		
		this.name = name;
		this.add = add;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}
	

	public User(int id, String name, String add, String city, String phone, String email, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
	

}
