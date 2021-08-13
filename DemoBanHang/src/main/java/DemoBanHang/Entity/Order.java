package DemoBanHang.Entity;

public class Order {
	private int id;
	private int id_product;
	private String pName;
	private int count;
	private int price;
	private String img;
	private int id_user;
	private int status;
	private String date;
	
	
	public Order() {
		super();
	}

	
	public Order(int id, int id_product, String pName, int count, int price, String img, int id_user, int status
			,String date) {
		super();
		this.id = id;
		this.id_product = id_product;
		this.pName = pName;
		this.count = count;
		this.price = price;
		this.img = img;
		this.id_user = id_user;
		this.status = status;
		this.date=date;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	
	
	
	
	

}
