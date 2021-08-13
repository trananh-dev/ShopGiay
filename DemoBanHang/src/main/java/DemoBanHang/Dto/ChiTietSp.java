package DemoBanHang.Dto;

public class ChiTietSp {
	private int id;
	private int pid;
	private int size;
	private String color;
	private int slnhap;
	private int sndat;
	
	public ChiTietSp() {
		super();
	}

	public ChiTietSp(int id, int pid, int size, String color, int slnhap, int sndat) {
		super();
		this.id = id;
		this.pid = pid;
		this.size = size;
		this.color = color;
		this.slnhap = slnhap;
		this.sndat = sndat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSlnhap() {
		return slnhap;
	}

	public void setSlnhap(int slnhap) {
		this.slnhap = slnhap;
	}

	public int getSndat() {
		return sndat;
	}

	public void setSndat(int sndat) {
		this.sndat = sndat;
	}
	
	
	
	
	

}
