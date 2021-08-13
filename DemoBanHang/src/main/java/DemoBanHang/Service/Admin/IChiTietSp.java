package DemoBanHang.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.Dto.ChiTietSp;

@Service
public interface IChiTietSp {
	@Autowired
	public void add(ChiTietSp ct);

	public List<ChiTietSp> getListChiTietSp();

	public void delete(int id);

	public void update(ChiTietSp b);

	public ChiTietSp findById(int id);
	public List<ChiTietSp> getByIdPid(int id);
	

}
