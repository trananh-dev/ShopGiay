package DemoBanHang.Entity;

public class Admin {
	private int id;
	private String name;
	private String email;
	private String use_;
	private String pass;
	private int level;
	
	public Admin() {
		super();
	}

	public Admin(int id, String name, String email, String use_, String pass, int level) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.use_ = use_;
		this.pass = pass;
		this.level = level;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUse_() {
		return use_;
	}

	public void setUse_(String use_) {
		this.use_ = use_;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	
	

}
