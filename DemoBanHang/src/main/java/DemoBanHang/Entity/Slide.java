package DemoBanHang.Entity;

public class Slide {
	private int id;
	private String name;
	private String img;
	private int type;
	
	
	public Slide() {
		super();
	}


	public Slide(int id, String name, String img, int type) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.type = type;
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


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	
	

}
