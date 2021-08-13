package DemoBanHang.Service.AdminImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.ChiTietSpDao;
import DemoBanHang.Dto.ChiTietSp;
import DemoBanHang.Service.Admin.IChiTietSp;

@Service
public class ChitietspServiceImpl implements IChiTietSp{

	@Autowired
	private ChiTietSpDao ctsp;
	@Override
	public void add(ChiTietSp ct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ChiTietSp> getListChiTietSp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ChiTietSp b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChiTietSp findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChiTietSp> getByIdPid(int id) {
		
		return ctsp.getByIdPid(id);
	}
	

}
