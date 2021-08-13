package DemoBanHang.Dto;

import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
	private int id;
	private String name;
	private int catid;
	private int brandid;
	private String desciption;
	private int price;
	private int discount;
	private String img;
	private MultipartFile filename;

	private int type;

	public ProductDto() {
		super();
	}

	public ProductDto(int id, String name, int catid, int brandid, String desciption, int price, int discount,
			String img, int type) {
		super();
		this.id = id;
		this.name = name;
		this.catid = catid;
		this.brandid = brandid;
		this.desciption = desciption;
		this.price = price;
		this.discount = discount;
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

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getBrandid() {
		return brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
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

	public MultipartFile getFilename() {
		return filename;
	}

	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}
	

}
