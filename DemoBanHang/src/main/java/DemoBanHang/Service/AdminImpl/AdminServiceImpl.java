package DemoBanHang.Service.AdminImpl;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.AdminDao;
import DemoBanHang.Entity.Admin;
import DemoBanHang.Service.Admin.IAdminService;
@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private AdminDao adminDao;
	

	@Override
	public Admin CheckAccount(Admin ad) {
		String pas = ad.getPass();
		ad = adminDao.GetUserByAcc(ad);
		if (ad != null) {
			if(BCrypt.checkpw(pas, ad.getPass())) {
				return ad;
			}else {
				return null;
			}

		}
		return null;
	}

}
