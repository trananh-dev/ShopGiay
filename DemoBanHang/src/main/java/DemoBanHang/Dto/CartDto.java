package DemoBanHang.Dto;

public class CartDto {
	private int quanty;
	private int totalPrice;
	private ProductDto product;
	
	
	public CartDto() {
		super();
	}


	public CartDto(int quanty, int totalPrice, ProductDto product) {
		super();
		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.product = product;
	}


	public int getQuanty() {
		return quanty;
	}


	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public ProductDto getProduct() {
		return product;
	}


	public void setProduct(ProductDto product) {
		this.product = product;
	}
	
	
	
	

}
